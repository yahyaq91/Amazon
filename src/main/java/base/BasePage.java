package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static ExtentReports extent;


    @BeforeSuite(alwaysRun = true)
    public void reportSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod(alwaysRun = true)
    public void reportInit(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName();

        ExtentTestManager.startTest(methodName);
        ExtentTestManager.getTest().assignCategory(className);
    }

    @Parameters({"browser", "url"})
    @BeforeMethod
    public void driverSetup(@Optional("chrome") String browser, @Optional("https://www.amazon.com") String url) throws IOException {
        driverInit(browser);
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
        driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachTestMethod(ITestResult result) {

        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, "TEST CASE FAILED: " + result.getName());
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
            captureScreenshot(driver, result.getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "TEST CASE SKIPPED: " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "TEST CASE PASSED: " + result.getName());
        }

        ExtentTestManager.endTest();
        extent.flush();
    }

    // region Selenium API
    public void clickOnElement(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysToElement(WebElement element, String keys) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keys);
    }

    public void selectFromDropdownByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void selectFromDropdownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectFromDropdownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public boolean isElementVisible(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (ElementNotVisibleException elementNotVisibleException) {

        }

        return element.isDisplayed();
    }

    public void switchTabs() {
        String parentHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
            }
        }
    }

    // endregion

    // region Helper Methods
    private static Properties loadProperties(File file) throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream(file);
        prop.load(ism);
        ism.close();
        return prop;
    }

    public void driverInit(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static void captureScreenshot(WebDriver driver, String testName) {
        String fileName = testName + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File newScreenshotFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "test" + File.separator + "reports" + File.separator + fileName);

        try {
            FileHandler.copy(screenshot, newScreenshotFile);
            System.out.println("SCREENSHOT TAKEN");
        } catch (Exception e) {
            System.out.println("ERROR TAKING SCREENSHOT: " + e.getMessage());
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    // endregion

}

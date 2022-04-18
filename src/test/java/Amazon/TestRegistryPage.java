package Amazon;

import base.TestBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegistryPage extends TestBasePage {
    @Test
    public void testSelectFromDropdown() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.selectDropdownOption("Wedding Registry");

        Assert.assertTrue(registryPage.dropdownWeddingRegistry.isSelected());
    }





}

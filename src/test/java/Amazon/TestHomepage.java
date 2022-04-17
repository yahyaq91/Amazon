package Amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestHomepage extends TestBasePage {

    @Test
    public void testHomePage(){
        Homepage homepage = new Homepage();
        homepage.navigateToRegistryPage();
    }


}

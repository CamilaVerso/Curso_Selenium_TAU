package keys;

import base.BaseTests;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keypage = homePage.clickKeyPresses();
        keypage.enterPi();
    }
}

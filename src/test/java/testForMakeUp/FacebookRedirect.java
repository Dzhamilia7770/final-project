package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.LinksForMakeUp.urlForNewTab;
import static testForMakeUp.Xpath.*;

public class FacebookRedirect extends Methods {
    @Test(description = "main page")

    public static void T10() throws InterruptedException {
        Scroll();
        Click(ButtonFacebook);
        WaitSec();
        GoToNewTabBrowser(urlForNewTab);

    }
}



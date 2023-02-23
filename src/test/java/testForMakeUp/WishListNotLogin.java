package testForMakeUp;

import org.testng.annotations.Test;
import practice.Methods;

import static testForMakeUp.Xpath.*;

public class WishListNotLogin extends Methods {
    @Test(description = "main page")

    public static void T8() throws InterruptedException {

        WaitSec();
        SendText(FieldSearch, "шампунь");
        WaitSec();
        Click(FirstResultText);
        WaitSec();
        AssertForComponentNotExist(ButtonForWishList);

    }
}


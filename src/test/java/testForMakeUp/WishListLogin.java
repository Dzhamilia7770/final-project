package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.Xpath.*;

public class WishListLogin extends Methods {
    @Test(description = "main page")

    public static void T9() throws InterruptedException {
        Click(ButtonLogin);
        WaitSec();
        SendText(FieldForLogin, "Oper1927@dayrep.com");
        SendText(FieldForParole, "c6t8kv_tyneLNnU");
        Click(ButtonEnter);
        WaitSec();
        HandleUnneededModal();
        SendText(FieldSearch, "шампунь");
        Click(FirstResultText);
        WaitSec();
        Click(ButtonForWishList);
        WaitSec();
        Click(ButtonFollowPrice);
        WaitSomeSeconds(7000);
        AssertForText(CounterOfWishList, "(1)");
        WaitSec();

    }
}


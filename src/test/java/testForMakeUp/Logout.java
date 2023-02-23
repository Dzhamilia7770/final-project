package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.Xpath.*;

public class Logout extends Methods {
    @Test(description = "main page")

    public static void T4() throws InterruptedException {

        Click(ButtonLogin);
        WaitSec();
        SendText(FieldForLogin, "Oper1927@dayrep.com");
        WaitSec();
        SendText(FieldForParole, "c6t8kv_tyneLNnU");
        Click(ButtonEnter);
        WaitSec();
        HandleUnneededModal();
        WaitSomeSeconds(7000);
        AssertForText(Cabinet, "Кабінет");
        Click(Cabinet);
        AssertForText(TextForCabinet, "Особистий кабінет");
        WaitSec();
        Click(ButtonLogout);
        WaitSec();
        AssertForComponentNotExist(Cabinet);
        AssertForText(TextForEnterCabinet, "Вхід до кабінету");
        WaitSec();

    }
}


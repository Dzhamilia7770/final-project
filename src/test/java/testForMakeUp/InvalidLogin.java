package testForMakeUp;

import org.testng.annotations.Test;
import practice.Methods;

import static testForMakeUp.Xpath.*;

public class InvalidLogin extends Methods {
    @Test(description = "main page")

    public static void T2() throws InterruptedException {
        Click(ButtonLogin);
        WaitSec();
        SendText(FieldForLogin, "Oper1927@dayrep");
        WaitSec();
        SendText(FieldForParole, "c6t8kv_tyneLNnU");
        Click(ButtonEnter);
        WaitSomeSeconds(7000);
        AssertForComponentNotExist(Cabinet);
    }
}


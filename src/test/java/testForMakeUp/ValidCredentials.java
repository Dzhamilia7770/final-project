package testForMakeUp;

import org.testng.annotations.Test;
import practice.Methods;

import static testForMakeUp.Xpath.*;

public class ValidCredentials extends Methods {
    @Test(description = "main page")

    public static void T1() throws InterruptedException {
        Click(ButtonLogin);
        WaitSec();
        SendText(FieldForLogin, "Oper1927@dayrep.com");
        WaitSec();
        SendText(FieldForParole, "c6t8kv_tyneLNnU");
        Click(ButtonEnter);
        WaitSomeSeconds(7000);
        AssertForText(Cabinet, "Кабінет");
    }
}
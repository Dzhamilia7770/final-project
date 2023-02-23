package testForMakeUp;

import org.testng.annotations.Test;
import practice.Methods;

import static testForMakeUp.Xpath.*;

public class InvalidPassword extends Methods {
    @Test(description = "main page")

    public static void T3() throws InterruptedException {
        Click(ButtonLogin);
        WaitSec();
        SendText(FieldForLogin, "Oper1927@dayrep.com");
        WaitSec();
        SendText(FieldForParole, "111");
        Click(ButtonEnter);
        WaitSomeSeconds(7000);
        AssertForComponentNotExist(Cabinet);
    }
}



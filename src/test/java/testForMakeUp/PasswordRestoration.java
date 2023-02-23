package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.Xpath.*;

public class PasswordRestoration extends Methods {
    @Test(description = "main page")

    public static void T5() throws InterruptedException {
        Click(ButtonLogin);
        WaitSec();
        Click(ButtonForPassRestore);
        AssertForText(TextForPassRestore, "ВІДНОВЛЕННЯ ПАРОЛЮ");
        WaitSec();
        SendText(FieldForEmailPassParole, "Oper1927@dayrep.com");
        Click(ButtonEmailValidate);
        WaitSec();
        AssertForTextContains(TextEmailValidate, "На адресу вашої електронної пошти було надіслано посилання для встановлення нового пароля.");

    }
}
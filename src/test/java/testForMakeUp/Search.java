package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.Xpath.*;


public class Search extends Methods {
    @Test(description = "main page")

    public static void T6() throws InterruptedException {

        WaitSec();
        SendText(FieldSearch, "шампунь");
        WaitSec();
        AssertForText(FieldSearchResultTxt, "Шампуні");
        Scroll500();
        WaitSec();
        Click(FirstResultText);
        WaitSec();
        AssertForTextContains(TextAfterSearch, "Шампунь");

    }
}


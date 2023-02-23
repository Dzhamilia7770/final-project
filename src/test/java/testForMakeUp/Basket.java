package testForMakeUp;

import org.testng.annotations.Test;
import helper.Methods;

import static testForMakeUp.LinksForMakeUp.urlCheckOut;
import static testForMakeUp.LinksForMakeUp.urlFirstProduct;
import static testForMakeUp.Xpath.*;

public class Basket extends Methods {
    @Test(description = "main page")

    public static void T7() throws InterruptedException {

        WaitSec();
        SendText(FieldSearch, "шампунь");
        WaitSec();
        Click(FirstResultText);
        WaitSec();
        AssertForLinks(urlFirstProduct, "Test");
        Click(ButtonForBuying);
        WaitSec();
        AssertForText(TextForBasket, "Кошик");
        Click(ButtonForOrder);
        AssertForLinks(urlCheckOut, "Test2");

    }
}

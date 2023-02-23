package helper;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Methods {
    protected static WebDriver driver;

    @BeforeClass
    public static void Connect() {
        try {
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--disable-web-security");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("https://makeup.com.ua/ua/");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Click(String xPath) {
        WebElement element = driver.findElement(By.xpath(xPath));
        element.click();
    }

    public static void SendText(String xPath, String text) {
        WebElement element = driver.findElement(By.xpath(xPath));
        element.sendKeys(text, Keys.ENTER);
    }

    public static void waitUntil(String selector) {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
    }

    public static void Scroll500() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        Thread.sleep(10000);
    }

    public static void Scroll() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(10000);
    }

    public static String randomEmail(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        targetStringLength = targetStringLength;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String dom = "@gmail.com";
        String randomEmail = generatedString + dom;
        return randomEmail;
    }

    public static void AssertForLinks(String actualLink, String task) {
        String link = driver.getCurrentUrl();
        //      System.out.println("If test fails, check the link");                   //якщо тест зайфелился, перевірь лінку
        Assert.assertEquals(actualLink, link, task);

    }

    public static void AssertForText(String xpath, String expected) {
        WebElement element = driver.findElement(By.xpath(xpath));

        //  System.out.println(element.getText());
        Assert.assertEquals(element.getText(), expected);
    }

    public static void AssertForComponentNotExist(String xpath) {
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        Assert.assertEquals(elements.size(), 0);

    }

    public static void AssertForTextContains(String xpath, String expectedText) {
        WebElement element = driver.findElement(By.xpath(xpath)); // html element

        String elementText = element.getText();    // Телемарафон "Єдині новини" онлайн | 1+1 онлайн | ТСН онлайн | Новини України
        Boolean isContains = elementText.contains(expectedText);
        System.out.println(elementText + " " + expectedText + " " + isContains);
        Assert.assertTrue(isContains);
    }

    public static void WaitSomeSeconds(int sleep) throws InterruptedException {
        Thread.sleep(sleep);
    }

    public static void WaitSec() throws InterruptedException {
        int seconds = 5;
        Thread.sleep(seconds * 1000);
    }

    public static void WaitLoadPage(int time) throws InterruptedException {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println("Сторінка не прогрузилась за - " + time);
        }
    }

    public static void GoToNewTabBrowser(String actualLink) {
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
//        System.out.println(driver.getCurrentUrl());
    }

    @AfterClass(alwaysRun = true)

    public static void CloseBrowser() {
        driver.quit();
    }
}




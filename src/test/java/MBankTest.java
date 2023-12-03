/*Created by Stanislav Silkov */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.MBank;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("МБанк")
public class MBankTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void firs() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        MBank mbank = new MBank(driver);
        mbank.Authorization2();
    }

   /* @Test
    @Order(2)
    @DisplayName("Ввод смс-кода")
    public void b() throws InterruptedException {
        MBank mbank = new MBank(driver);
        mbank.enterPassword();
    }
*/
    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Пополнить")
    public void checkButtonPopolnit() {
        MBank mbank = new MBank(driver);
        mbank.checkButtonPopolnit();
    }

    @Test
    @Order(4)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        MBank mbank = new MBank(driver);
        mbank.checkButtonOplatit();
    }

    @Test
    @Order(5)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        MBank mbank = new MBank(driver);
        mbank.pageInformation();
    }


    @Test
    @Order(6)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        MBank mbank = new MBank(driver);
        mbank.pageSettings();
    }

    @Test
    @Order(7)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        MBank mbank = new MBank(driver);
        mbank.pageHistoryOperation();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Как пользоваться картой")
    public void checkPageHowUseCard() {
        MBank mbank = new MBank(driver);
        mbank.pageHowUseCard();
    }

    @Order(9)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        MBank mbank = new MBank(driver);
        mbank.clickTabDebt();
    }

    @Order(10)
    @Test
    @DisplayName("Наличие блока Мин платёж")
    public void checkAccMinAmount() {
        MBank mbank = new MBank(driver);
        mbank.checkAccMinAmount();
    }

    @Order(11)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        MBank mbank = new MBank(driver);
        mbank.checkAccGrace();
    }

    @Order(12)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        MBank mbank = new MBank(driver);
        mbank.checkAccDebt();
    }


    @Order(13)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        MBank mbank = new MBank(driver);
        mbank.checkAccCredLim();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        MBank mbank = new MBank(driver);
        mbank.checkAccTarrifs();
    }

    @Order(15)
    @Test
    @DisplayName("Содержимое вкладки Информация")
    public void checkPageInformationContains() {
        MBank mbank = new MBank(driver);
        mbank.checkPageInformationContains();
    }

    @Order(16)
    @Test
    @DisplayName("Клик на таб Реквизиты")
    public void clickTabRekv()  {
        MBank mbank = new MBank(driver);
        mbank.clickTabRekv();
    }

    @Order(17)
    @Test
    @DisplayName("Проверка содержимого Реквизиты")
    public void checkFieldsTabRekv(){
        MBank mbank = new MBank(driver);
        mbank.checkFieldsTabRekv();
    }

    @Order(18)
    @Test
    @DisplayName("Наличие в подвале кнопки Скачать")
    public void checkButtonDownLoad() {
        MBank mbank = new MBank(driver);
        mbank.checkButtonDownLoad();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие в подвале кнопки Отправить на емэйл")
    public void checkButtonSend() {
        MBank mbank = new MBank(driver);
        mbank.checkButtonSend();
    }

    @Order(20)
    @Test
    @DisplayName("Наличие в подвале кнопки Печать")
    public void checkButtonPrint() {
        MBank mbank = new MBank(driver);
        mbank.checkButtonPrint();
    }
    /////
   /* @Order(9)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void m() {
        MBank mbank = new MBank(driver);
        mbank.checkFieldsTabRekv();
    }

    @Test
    @DisplayName("Проверка экрана с ошибкой'")
    @Order(14)
    public void t() {
        MBank mbank = new MBank(driver);
        mbank.checkError();
    }*/

    /*@AfterAll
    @DisplayName("Закрытие браузера")
    public static void close() {
        driver.close();
    }*/

}

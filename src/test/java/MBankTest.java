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
        mbank.enterLoginAndSmsCode();
    }

    @Test
    @Order(2)
    @DisplayName("Ввод смс-кода")
    public void b() throws InterruptedException {
        MBank mbank = new MBank(driver);
        mbank.enterPassword();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Пополнить")
    public void bb(){
        MBank mbank = new MBank(driver);
        mbank.checkButtonpopolnit();
    }

    @Order(4)
    @Test
    @DisplayName("Проверка наличия Баннера с акциями и скидками")
    public void e(){
        MBank mbank = new MBank(driver);
        mbank.checkBannerDiscounts();
    }

    @Order(5)
    @Test
    @DisplayName("Проверка кнопок скачивания Выписки")
    public void f(){
        MBank mbank = new MBank(driver);
        mbank.checktabIO();
    }

    @Order(6)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void h(){
        MBank mbank = new MBank(driver);
        mbank.clickTabDebt();
    }

    @Order(7)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void k(){
        MBank mbank = new MBank(driver);
        mbank.checkButtonsDebt();
    }

    @Order(8)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void l(){
        MBank mbank = new MBank(driver);
        mbank.clickTabRekv();
    }
    @Order(9)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void m(){
        MBank mbank = new MBank(driver);
        mbank.checkFieldsTabRekv();
    }

    @Order(10)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void n(){
        MBank mbank = new MBank(driver);
        mbank.clickButtonMore();
    }

    @Order(11)
    @Test
    @DisplayName("Проверка кнопок в меню Ещё")
    public void p(){
        MBank mbank = new MBank(driver);
        mbank.checkMenuMore();
    }

    @Test
    @DisplayName("Проверка экрана с ошибкой'")
    @Order(14)
    public void t() {
        MBank mbank = new MBank(driver);
        mbank.checkError();
    }

    @AfterAll
    @DisplayName("Закрытие браузера")
    public static void close() {
        driver.close();
    }

}

/*Created by Stanislav Silkov */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.OpenwayVTBAccount;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Cчёт Openway_VTB")
public class OpenwayVTBAccountTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Ввод логина и пароля")
    public void clickButtonLogin() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.clickButtonLogin();
    }

    @Test
    @Order(2)
    @DisplayName("Ввод смс-кода")
    public void enterSmsCode() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.enterSmsCode();
    }

    @Test
    @Order(3)
    @DisplayName("Нажатие кнопки Esc у тупого баннера")
    public void pressEsc() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pressEsc();
    }


    @Test
    @Order(3)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonPopolnit();
    }

    @Order(4)
    @Test
    @DisplayName("Наличие раздела Предложения Банка")
    public void checkOffers(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkOffers();
    }

    @Order(6)
    @Test
    @DisplayName("Отображение кнопки скачивания Выписки")
    public void checkTabIO(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checktabIO();
    }

    @Order(7)
    @Test
    @DisplayName("Отображение остальных элементов во вкладке История операций")
    public void checkTabIOOther(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checktabIOOther();
    }

    @Order(8)
    @Test
    @DisplayName("Переход на вкладку Задолженность")
    public void clickTabDebt(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.clickTabDebt();
    }

    @Order(9)
    @Test
    @DisplayName("Отображение элементов во вкладке Задолженность")
    public void checkTabDebt(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkTabDebt();
    }

    @Order(10)
    @Test
    @DisplayName("Проверка кнопок во вкладке Задолженность")
    public void checkButtonsDebt(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonsDebt();
    }

    @Order(11)
    @Test
    @DisplayName("Отображение элементов во вкладке Реквизиты")
    public void checkTabRekv(){
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkTabRekv();
    }

    @Order(12)
    @Test
    @DisplayName("Проверка кнопок во вкладке Реквизиты")
    public void checkButtonsRekv() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonsRekv();
    }


    @Order(13)
    @Test
    @DisplayName("Нажатие кнопки Ещё")
    public void pressButtonsMore() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pressButtonMore();
    }

}
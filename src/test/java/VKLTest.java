/*Created by Stanislav Silkov */

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.Vkl;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("ВКЛ")
public class VKLTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void first() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Order(1)
    @Test
    @DisplayName("Ввод логина и пароля")
    public void enterLoginAndSmsCode(){
        Vkl Vkl = new Vkl(driver);
        Vkl.enterLoginAndSmsCode();
    }

    @Order(2)
    @Test
    @DisplayName("Ввод смс-кода")
    public void enterPassword() throws InterruptedException {
        Vkl Vkl = new Vkl(driver);
        Vkl.enterPassword();
    }

//    @Test
//    @DisplayName("Название вкладки \"История операций\"")
//    @Order(3)
//    public void g() throws InterruptedException {
//        Thread.sleep(4000);
//        WebElement asss = driver.findElement(By.xpath("//button[@id=\"HISTORY\"]"));
//        Assertions.assertTrue(asss.getText().equals("История операций"));
//    }
//
//    @Test
//    @DisplayName("Наличие кнопки \"Скачать выписку\"")
//    @Order(4)
//    public void h() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonDownload();
//    }
//
//    @Test
//    @DisplayName("Нажатие вкладки Информация")
//    @Order(5)
//    public void k() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickTabInformation();
//    }
//
//    @Test
//    @DisplayName("Проверка полей во вкладке Информация")
//    @Order(6)
//    public void l() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkFieldTabInformation();
//    }

//    @Test
//    @DisplayName("Проверка кнопки Получить Транш")
//    @Order(7)
//    public void m() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonHaveTransh();
//    }
//
//    @Test
//    @DisplayName("Нажитие кнопки \"Ещё\"")
//    @Order(8)
//    public void n() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickButtonMore();
//    }
//
//    @Test
//    @DisplayName("Наличие кнопки \"Пополнить\"")
//    @Order(9)
//    public void o() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonPopolnit();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Закрыть кредитную линию\"")
//    @Order(10)
//    public void p() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkButtonCloseVKL();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Сформировать выписку\"")
//    @Order(11)
//    public void r() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkMakeDocument();
//    }
//
//    @Test
//    @DisplayName("Проверка кнопки \"Подтвердить\" в сценарии закрытия")
//    @Order(12)
//    public void s() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickButtonCloseDocument();
//    }
//
//    @Test
//    @DisplayName("Проверка уведомления о 10 днях в сценарии закрытия")
//    @Order(13)
//    public void t() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkWarning();
//    }
//
//    @Test
//    @DisplayName("Проверка выпадающего списка в сценарии закрытия")
//    @Order(14)
//    public void u() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.clickListClose();
//    }
//
//    @Test
//    @DisplayName("Проверка наличия причины в выпадающем списке в сценарии закрытия")
//    @Order(15)
//    public void w() {
//        Vkl Vkl = new Vkl(driver);
//        Vkl.checkReason();
//    }
}

package ru.vtb.testing;
/*Created by Stanislav Silkov */

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.Constants;

import java.time.Duration;

public class Vkl extends Constants {
    public WebDriver driver;

    public Vkl(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonEsc = By.xpath("//button[@title=\"закрыть окно\"]");
    private final By buttonDownload = By.xpath("//button[@title=\"Открыть выбор получения выписки\"]");
    private final By tabInformation = By.xpath("//span[text()=\"Информация\"]");

    private final By fieldContract = By.xpath("//*[text()=\"Контракт\"]");
    private final By fieldNumber = By.xpath("//*[text()=\"Номер\"]");
    private final By fieldValuta = By.xpath("//*[text()=\"Валюта\"]");
    private final By fieldDostOstatok = By.xpath("//*[text()=\"Доступный остаток\"]");
    private final By fieldKrdLimit = By.xpath("//*[text()=\"Кредитный лимит\"]");
    private final By fieldProcRate = By.xpath("//*[text()=\"Процентная ставка\"]");
    private final By fieldPaymentDate = By.xpath("//*[text()=\"Дата очередного платежа\"]");
    private final By fieldMinSum = By.xpath("//*[text()=\"Минимальная сумма к погашению\"]");
    private final By fieldCommonSum = By.xpath("//*[text()=\"Общая сумма к погашению\"]");
    private final By fieldMainDolg = By.xpath("//*[text()=\"Основной долг\"]");
    private final By fieldPersents = By.xpath("//*[text()=\"Проценты\"]");
    private final By fieldNachPercents = By.xpath("//*[text()=\"Начисленные проценты\"]");
    private final By fieldEndDateCredLimit = By.xpath("//*[text()=\"Окончание срока действия кредитного лимита\"]");
    private final By fieldProsrZadolzh = By.xpath("//*[text()=\"Просроченная задолженность\"]");
    private final By fieldRefinans = By.xpath("//*[text()=\"Рефинансирование карт\"]");

    private final By buttonSendEmail = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By buttonDownloadReport = By.xpath("//p[text()=\"Сохранить\"]");
    private final By buttonPechat = By.xpath("//p[text()=\"Печать\"]");

    private final By buttonHaveTransh = By.xpath("//button[@aria-label=\"Получить транш \"]");
    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");
    private final By buttonPopolnit = By.xpath("//*[text()=\"Пополнить\"]");
    private final By buttonCloseVKL = By.xpath("//*[text()=\"Закрыть кредитную линию\"]");
    private final By buttonMakeDocument = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonCloseApply = By.xpath("//button[@class=\"sc-fzokOt sc-fzqBZW ezwqoX\"]");
    private final By listClose = By.xpath("//*[@class=\"sc-qQZrP bwWxNC\"]");


    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncVkl);
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(2000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/RevolvingCreditLine/B05D7FBD9C2141D99D05F2D08D790CAC");
        Thread.sleep(2000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncVkl);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(2000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/RevolvingCreditLine/B05D7FBD9C2141D99D05F2D08D790CAC");
        Thread.sleep(2000);
    }

    public void checkButtonDownload() {
        driver.findElement(buttonDownload).isEnabled();
    }

    public void clickTabInformation() {
        driver.findElement(tabInformation).click();
    }

    public void checkFieldTabInformation() {
        WebElement contract1 = driver.findElement(By.xpath("//*[@class=\"sc-fzoXWK dMoHqX\" and text()=\"Кредитная линия\"]"));
        Assertions.assertTrue(contract1.getText().equals("Кредитная линия"));
        driver.findElement(fieldContract).isEnabled();
        driver.findElement(fieldCommonSum).isEnabled();
        driver.findElement(fieldDostOstatok).isEnabled();
        driver.findElement(fieldKrdLimit).isEnabled();
        driver.findElement(fieldEndDateCredLimit).isEnabled();
        driver.findElement(fieldNachPercents).isEnabled();
        driver.findElement(fieldNumber).isEnabled();
        driver.findElement(fieldValuta).isEnabled();
        driver.findElement(fieldMainDolg).isEnabled();
        driver.findElement(fieldMinSum).isEnabled();
        driver.findElement(fieldPersents).isEnabled();
        driver.findElement(fieldRefinans).isEnabled();
        driver.findElement(fieldProsrZadolzh).isEnabled();
        driver.findElement(fieldProcRate).isEnabled();
        driver.findElement(fieldPaymentDate).isEnabled();
    }

    public void checkButtonSendOnEmail() {
        driver.findElement(buttonSendEmail).isEnabled();
    }

    public void checkDownloadReport() {
        driver.findElement(buttonDownloadReport).isEnabled();
    }

    public void checkButtonPechat() {
        driver.findElement(buttonPechat).isEnabled();
    }

    public void checkButtonHaveTransh() {
        driver.findElement(buttonHaveTransh).isEnabled();
    }

    public void clickButtonMore() {
        driver.findElement(buttonMore).click();
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkButtonCloseVKL() {
        driver.findElement(buttonCloseVKL).isDisplayed();
    }

    public void checkMakeDocument() {
        driver.findElement(buttonMakeDocument).isDisplayed();
    }

    public void clickButtonCloseDocument() {
        driver.findElement(buttonCloseVKL).click();
        driver.findElement(buttonCloseApply).isEnabled();
    }

    public void checkWarning() {
        WebElement warning = driver.findElement(By.xpath("//p[text()=\"Карта закроется через 10 дней\"]"));
        Assertions.assertTrue(warning.getText().equals("Карта закроется через 10 дней"));
    }

    public void clickListClose() {
        driver.findElement(listClose).click();
    }

    public void checkReason() {
        WebElement reason = driver.findElement(By.xpath("//*[text()=\"Не устроил сервис Банка\"]"));
        Assertions.assertTrue(reason.getText().equals("Не устроил сервис Банка"));
    }
}

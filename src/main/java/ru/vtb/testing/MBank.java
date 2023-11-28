package ru.vtb.testing;

/*Created by Stanislav Silkov */

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.Constants;

public class MBank extends Constants {
    public WebDriver driver;

    public MBank(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonPopolnit = By.xpath("//button[@aria-label=\"Пополнить \"]");
    private final By bannerDiscounts = By.xpath("//*[@data-test-id=\"offersbanner_offer-banner_banner\"]");
    private final By buttonDownLoad = By.xpath("//button[@title=\"Открыть выбор получения выписки\"]");
    private final By buttonDownLoadPDF = By.xpath("//*[@data-test-id=\"get_document_presentation_button_button\"]");

    private final By tabDebt = By.xpath("//span[text()=\"Информация о задолженности\"]");

    private final By footerButtonDownLoad = By.xpath("//p[text()=\"Сохранить\"]");
    private final By footerButtonSend = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By footerButtonPrint = By.xpath("//p[text()=\"Печать\"]");

    private final By tabRekvizits = By.xpath("//span[text()=\"Реквизиты\"]");
    private final By titleRekvAcc = By.xpath("//span[text()=\"Реквизиты счета • 9751\"]");
    private final By fieldBankName = By.xpath("//span[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//span[text()=\"БИК банка получателя\"]");
    private final By fieldINN = By.xpath("//span[text()=\"ИНН банка получателя\"]");
    private final By fieldKPP = By.xpath("//span[text()=\"КПП банка получателя\"]");
    private final By fieldKS = By.xpath("//span[text()=\"К/С банка получателя\"]");
    private final By fieldCardHolder = By.xpath("//span[text()=\"Получатель\"]");
    private final By fieldAccountNumber = By.xpath("//span[text()=\"Счет получателя в банке получателя\"]");
    private final By fieldReasonPayment = By.xpath("//span[text()=\"Назначение платежа\"]");
    private final By titleRekvCard = By.xpath("//span[text()=\"Реквизиты карты • 2308\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//span[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//span[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//span[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//span[text()=\"Статус карты\"]");

    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");

    private final By buttonGiveAndPay = By.xpath("//*[text()=\"Перевести и Оплатить\"]");
    private final By buttonTabDebt = By.xpath("//*[text()=\"Информация о задолженности\"]");
    private final By buttonCloseMBank = By.xpath("//*[text()=\"Закрыть карту\"]");

    private final By buttonPonyatno = By.xpath("//*[text()=\"Понятно\"]");

    public void enterLoginAndSmsCode() {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncMbank);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
    }

    public void enterPassword() throws InterruptedException {
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(2000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/RevolvingCreditLine/B05D7FBD9C2141D99D05F2D08D790CAC");
        Thread.sleep(2000);
    }

    public void checkButtonpopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkBannerDiscounts() {
        driver.findElement(bannerDiscounts).isDisplayed();
        WebElement bannerDiscountsText = driver.findElement(By.xpath("//h2[@class=\"sc-fzpkqZ bItIjs\"]"));
        System.out.println(bannerDiscountsText.getText());
        Assertions.assertTrue(bannerDiscountsText.getText().equals("Акции и скидки от партнеров ВТБ"));
    }

    public void checktabIO(){
        driver.findElement(buttonDownLoad).click();
        driver.findElement(buttonDownLoadPDF).click();
    }

    public void clickTabDebt(){
        driver.findElement(tabDebt).click();
    }

    public void checkButtonsDebt(){
        driver.findElement(footerButtonDownLoad).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void clickTabRekv(){
        driver.findElement(tabRekvizits).click();
    }

    public void checkFieldsTabRekv(){
        driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();
        driver.findElement(fieldReasonPayment).isDisplayed();

        driver.findElement(titleRekvCard).isEnabled();
        driver.findElement(fieldName).isEnabled();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void clickButtonMore(){
        driver.findElement(buttonMore).click();
    }

    public void checkMenuMore(){
        driver.findElement(buttonGiveAndPay).isEnabled();
        driver.findElement(buttonTabDebt).isEnabled();
        driver.findElement(buttonCloseMBank).isEnabled();
    }

    public void checkError(){
        driver.findElement(buttonCloseMBank).click();
        WebElement warning = driver.findElement(By.xpath("//h2[text()=\"Есть задолженность или операции в обработке\"]"));
        Assertions.assertTrue(warning.getText().equals("Есть задолженность или операции в обработке"));
        driver.findElement(buttonPonyatno).click();
    }



}
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
    private final By buttonPopolnit = By.xpath("//button[text()=\"Пополнить\"]");
    private final By buttonOplatit = By.xpath("//button[text()=\"Оплатить\"]");

    private final By pageInformation = By.xpath("//a[@class=\"SettingsView__StyledLink-sc-dhdr1i-0 kigDdL\"][1]");
    private final By pageSettings = By.xpath("//div[text()=\"Настройки\"]");
    private final By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    private final By pageHowUseCard = By.xpath("//div[text()=\"Как пользоваться картой\"]");

    private final By tabDebt = By.xpath("//button[text()=\"Задолженность\"]");

    private final By accMinAmount = By.xpath("//p[text()=\"Минимальный платеж\"]");
    private final By accGrace = By.xpath("//p[text()=\"Беспроцентный период\"]");
    private final By accDebt = By.xpath("//*[@class=\"sc-pIxCL hfpFnr\"]//p[text()=\"Общая задолженность\"]");
    private final By accCredLim = By.xpath("//p[text()=\"Кредитный лимит\"]");
    private final By accTarrifs = By.xpath("//p[text()=\"Тарифы и условия\"]");

    private final By footerButtonDownLoad = By.xpath("//p[text()=\"Сохранить\"]");
    private final By footerButtonSend = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By footerButtonPrint = By.xpath("//p[text()=\"Печать\"]");

    private final By tabRekvizits = By.xpath("//*[text()=\"Реквизиты\"]");
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

    private final By buttonGiveAndPay = By.xpath("//*[text()=\"Перевести и Оплатить\"]");
    private final By buttonTabDebt = By.xpath("//*[text()=\"Информация о задолженности\"]");
    private final By buttonCloseMBank = By.xpath("//*[text()=\"Закрыть карту\"]");

    private final By buttonPonyatno = By.xpath("//*[text()=\"Понятно\"]");


    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncMbank);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(2000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/96939526DBFF4AE9A7D55E7850924F04");
        Thread.sleep(2000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncMbank);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(2000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/96939526DBFF4AE9A7D55E7850924F04");
        Thread.sleep(2000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkButtonOplatit() {
        driver.findElement(buttonOplatit).isDisplayed();
    }


    public void pageInformation() {
        driver.findElement(pageInformation).isDisplayed();
    }

    public void pageSettings() {
        driver.findElement(pageSettings).isDisplayed();
    }

    public void pageHistoryOperation() {
        driver.findElement(pageHistoryOperation).isDisplayed();
    }

    public void pageHowUseCard() {
        driver.findElement(pageHowUseCard).isDisplayed();
    }

    public void clickTabDebt() {
        driver.findElement(tabDebt);
    }

    public void checkAccMinAmount() {
        driver.findElement(accMinAmount);
    }

    public void checkAccGrace() {
        driver.findElement(accGrace);
    }

    public void checkAccDebt() {
        driver.findElement(accDebt);
    }

    public void checkAccCredLim() {
        driver.findElement(accCredLim);
    }

    public void checkAccTarrifs() throws InterruptedException {
        driver.findElement(accTarrifs).click();
        Thread.sleep(2000);
    }

    public void checkButtonDownLoad() {
        driver.findElement(footerButtonDownLoad).isDisplayed();
    }

    public void checkButtonSend() {
        driver.findElement(footerButtonSend).isDisplayed();
    }

    public void checkButtonPrint() {
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void checkPageInformationContains(){
        driver.findElement(pageInformation).click();
        driver.getTitle().equals("Информация о карте");
        driver.navigate().back();
    }

    public void clickTabRekv(){
        driver.findElement(tabRekvizits).click();
    }

    public void checkFieldsTabRekv() {
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

    public void checkMenuMore() {
        driver.findElement(buttonGiveAndPay).isEnabled();
        driver.findElement(buttonTabDebt).isEnabled();
        driver.findElement(buttonCloseMBank).isEnabled();
    }

    public void checkError() {
        driver.findElement(buttonCloseMBank).click();
        WebElement warning = driver.findElement(By.xpath("//h2[text()=\"Есть задолженность или операции в обработке\"]"));
        Assertions.assertTrue(warning.getText().equals("Есть задолженность или операции в обработке"));
        driver.findElement(buttonPonyatno).click();
    }


}
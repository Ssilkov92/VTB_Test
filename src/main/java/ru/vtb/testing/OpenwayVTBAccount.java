package ru.vtb.testing;

/*Created by Stanislav Silkov */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import settings.Constants;

public class OpenwayVTBAccount extends Constants {
    public WebDriver driver;

    public OpenwayVTBAccount(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//button[@data-test-id=\"submit-credentials-button_button\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonEsc = By.xpath("//button[@title=\"закрыть окно\"]");

    private final By buttonPopolnit = By.xpath("//button[@aria-label=\"Пополнить \"]");
    private final By offers = By.xpath("//button[@data-test-id=\"bankOffers\"]");

    private final By buttonDownLoad = By.xpath("//button[@title=\"Открыть выбор получения выписки\"]");
    private final By buttonDownLoadPDF = By.xpath("//*[@data-test-id=\"get_document_presentation_button_button\"]");

    private final By inputNameSum = By.xpath("//input[@label=\"Поиск по названию и сумме\"]");
    private final By inputCalendar = By.xpath("//input[@inputmode=\"numeric\"]");
    private final By buttonShowAll = By.xpath("//button[@data-test-id=\"showallbutton_pfmhistorywidgetcontent\"]");

    private final By tabDebt = By.xpath("//span[text()=\"Задолженность\"]");
    private final By accMinPay = By.xpath("//h1[text()=\"Минимальный платеж\"]");
    private final By accFreePeriod = By.xpath("//h1[text()=\"Беспроцентный период\"]");
    private final By accCommonDebt = By.xpath("//h1[text()=\"Общая задолженность\"]");
    private final By accCredLim = By.xpath("//h1[text()=\"Кредитный лимит\"]");
    private final By accRates = By.xpath("//h1[text()=\"Тарифы и условия\"]");

    private final By tabRekvizits = By.xpath("//span[text()=\"Реквизиты\"]");
    //private final By titleRekvAcc = By.xpath("//span[text()=\"Реквизиты счета • 1806\"]");
    private final By fieldBankName = By.xpath("//span[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//*[text()=\"044525745\"]");
    private final By fieldINN = By.xpath("//*[text()=\"7702070139\"]");
    private final By fieldKPP = By.xpath("//*[text()=\"770943003\"]");
    private final By fieldKS = By.xpath("//*[text()=\"30101810345250000745\"]");
    private final By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
    private final By fieldAccountNumber= By.xpath("//*[text()=\"Счет получателя в банке получателя\"]");
    //private final By titleRekvCard = By.xpath("//span[text()=\"Реквизиты карты • 4876\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//*[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//*[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//*[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//*[text()=\"Статус карты\"]");

    private final By footerButtonDownLoad = By.xpath("//p[text()=\"Сохранить\"]");
    private final By footerButtonSend = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By footerButtonPrint = By.xpath("//p[text()=\"Печать\"]");

    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");

    private final By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    private final By input1 = By.xpath("//*[@type=\"password\"]");
    private final By input2 = By.xpath("//input[2]");
    private final By input3 = By.xpath("//input[3]");
    private final By input4 = By.xpath("//input[4]");

    private final By buttonContinue = By.xpath("//*[text()=\"Продолжить\"]");

    private final By inputSmsCod = By.xpath("//input[@label=\"Введите код из СМС / Push\"]");




    public void clickButtonLogin() {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncOpenWayAccount);
        driver.findElement(fieldPassword).sendKeys(password);
        driver.findElement(buttonVoyti).click();
    }

    public void enterSmsCode() throws InterruptedException {
        driver.findElement(smsCodeField).sendKeys(sms);
        Thread.sleep(4000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/3E7A1ADAB029405C81EA109F60255412");
    }

    public void pressEsc() throws InterruptedException {
        driver.findElement(buttonEsc).sendKeys(Keys.ESCAPE);
        Thread.sleep(5000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkOffers() { driver.findElement(offers).isDisplayed(); }


    public void checktabIO(){
        driver.findElement(buttonDownLoad).click();
        driver.findElement(buttonDownLoadPDF).click();
    }

    public void checktabIOOther(){
        driver.findElement(inputNameSum).sendKeys("1");
        driver.findElement(inputCalendar).sendKeys("2");
        driver.findElement(buttonShowAll).isDisplayed();
    }


    public void clickTabDebt(){
        driver.findElement(tabDebt).click();
    }

    public void checkTabDebt(){
        //driver.findElement(accMinPay).isDisplayed();
        driver.findElement(accCommonDebt).isDisplayed();
        driver.findElement(accFreePeriod).isDisplayed();
        driver.findElement(accCredLim).isDisplayed();
        driver.findElement(accRates).isDisplayed();
    }

    public void checkButtonsDebt(){
        driver.findElement(footerButtonDownLoad).isDisplayed();
        //driver.findElement(footerButtonShowNumber).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void clickTabReqv(){
        driver.findElement(tabRekvizits).click();
    }

    public void checkTabRekv(){
        //driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        //driver.findElement(titleRekvCard).isDisplayed();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void checkButtonsRekv() throws InterruptedException {
        driver.findElement(footerButtonDownLoad).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
        Thread.sleep(2000);
    }

    public void pressButtonMore(){
        driver.navigate().refresh();
        driver.findElement(buttonMore).click();
    }

}

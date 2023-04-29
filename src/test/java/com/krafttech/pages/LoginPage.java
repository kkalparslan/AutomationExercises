package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupButton_loc;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignup_loc;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement name_loc;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email_loc;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement clickButton_loc;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement getAccountText_loc;
    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    public WebElement signCheckbox_loc;
    @FindBy(xpath = "//label[text()='Receive special offers from our partners!']")
    public WebElement recieveCheckbox_loc;
    @FindBy(css = "#first_name")
    public WebElement firstNameButton_loc;
    @FindBy(css = "#country")
    public WebElement country_loc;
    @FindBy(css = "#state")
    public WebElement state_loc;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement createAccount_loc;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement getAccountText2_loc;
    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton_loc;
    @FindBy(xpath = "//b")
    public WebElement getLoggedText_loc;
    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    public WebElement deleteAccount_loc;
    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement getDeletedMessage_loc;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement lastContinueButton_loc;

    @FindBy(xpath = "//input[@type='email'][1]")
    public WebElement correctEmail2_loc;

    public void navigateUrl(String url){
        Driver.getDriver().get(url);
    }
    public void verifyHomePage(){
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);
        Assert.assertEquals("failed", expectedUrl,actualUrl);
    }
    public void signupMtd(){
        signupButton_loc.click();
    }
   public String getTextMessage(String expectedMessage){
        return Driver.getDriver().findElement(By.xpath("//h2[text()='"+expectedMessage+"']")).getText();

       // System.out.println("expectedMessage = " + expectedMessage);
        //System.out.println("actualMessage = " + actualMessage);
       // Assert.assertEquals("failed", expectedMessage, actualMessage);
    }
    public void writeNameAndEmailMtd(){
        name_loc.sendKeys(ConfigurationReader.get("firstName"));
        email_loc.sendKeys(ConfigurationReader.get("userEmail"));
    }
    public void clickAndSignupMethd(){
        clickButton_loc.click();
    }
    public void getAccountTextMtd(String expectedText){
        String actualText = getAccountText_loc.getText();
        System.out.println("expectedText = " + expectedText);
        System.out.println("actualText = " + actualText);
        Assert.assertEquals("failed", expectedText, actualText);
    }
    public void fillDetailsMtd(){
        Driver.getDriver().findElement(By.cssSelector("#id_gender1")).click();
        WebElement name = Driver.getDriver().findElement(By.cssSelector("#name"));
        name.clear();
        name.sendKeys(ConfigurationReader.get("firstName"));
//        WebElement email = Driver.getDriver().findElement(By.cssSelector("#email"));
//        email.clear();
//        email.sendKeys(ConfigurationReader.get("userEmail"));
        Driver.getDriver().findElement(By.cssSelector("#password")).sendKeys(ConfigurationReader.get("password"));

        WebElement dropDays = Driver.getDriver().findElement(By.xpath("//select[@id='days']"));
        Select select1=new Select(dropDays);
        select1.selectByIndex(5);

        WebElement dropMonth = Driver.getDriver().findElement(By.xpath("//select[@id='months']"));
        Select select2=new Select(dropMonth);
        select2.selectByValue("6");

        WebElement dropYears = Driver.getDriver().findElement(By.xpath("//select[@id='years']"));
        Select select3=new Select(dropYears);
        select3.selectByValue("2008");
    }
    public void signCheckBoxMtd(){
        BrowserUtils.scrollToElement(signCheckbox_loc);
        signCheckbox_loc.click();
        recieveCheckbox_loc.click();
    }
    /**public void inputYourInformations(String firstName, String lastName, String zipCode){
     Actions actions=new Actions(Driver.get());
     actions.click(inputFistName_loc).sendKeys(firstName)
     .sendKeys(Keys.TAB)
     .sendKeys(lastName)
     .sendKeys(Keys.TAB)
     .sendKeys(zipCode)
     .perform();*/
    public void fillAddresInformationMtd(){
        Actions actions=new Actions(Driver.getDriver());
        actions.click(firstNameButton_loc).sendKeys(ConfigurationReader.get("firstName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigurationReader.get("lastName"))
                .sendKeys(Keys.TAB)
                .sendKeys("Krafttech")
                .sendKeys(Keys.TAB)
                .sendKeys("520 sok. no:10/10 Ankara")
                .sendKeys(Keys.TAB)
                .sendKeys("520 sok. no:10/10 Ankara").perform();
        BrowserUtils.waitFor(1);
        Select select=new Select(country_loc);
        select.selectByValue("United States");
        BrowserUtils.waitFor(1);
    }
    public void fillAddress2Metd(){
        BrowserUtils.scrollToElement(state_loc);
        Actions actions=new Actions(Driver.getDriver());
        actions.click(state_loc).sendKeys("North Virginia")
                .sendKeys(Keys.TAB)
                .sendKeys("New York")
                .sendKeys(Keys.TAB)
                .sendKeys("06360")
                .sendKeys(Keys.TAB)
                .sendKeys("+1 900 544 7425").perform();
    }
    public void createAccountMtd(){
        createAccount_loc.click();
    }
    public void getAccountText_2Mtd(String expectedText){
        String actualText = getAccountText2_loc.getText();
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals("failed",expectedText,actualText);
    }
    public void continueButtonMtd1(){
        continueButton_loc.click();

        //BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.cssSelector("#dismiss-button")));
        Driver.getDriver().switchTo().frame("aswift_2");
        Driver.getDriver().findElement(By.cssSelector("#dismiss-button")).click();
        BrowserUtils.waitFor(2);
        Driver.getDriver().switchTo().defaultContent();
//        Alert alert=Driver.getDriver().switchTo().alert();
//        alert.dismiss();
    }
    public void continueButtonMtd2(){

        continueButton_loc.click();
//        BrowserUtils.waitFor(5);
//       Driver.getDriver().findElement(By.xpath("//div[@id='dismiss-button']")).click();
//       // Driver.getDriver().findElement(By.xpath("//span[@class='ns-ybm9b-e-16']")).click();
//        BrowserUtils.waitFor(5);

        //BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.cssSelector("#dismiss-button")));
        //Driver.getDriver().switchTo().frame("google_esf"); //google_esf//aswift_2//ad_iframe
        Driver.getDriver().switchTo().frame("aswift_2");
        //Driver.getDriver().switchTo().frame("ad_iframe");
        BrowserUtils.waitFor(1);
//        Driver.getDriver().findElement(By.cssSelector("#dismiss-button")).click();
//        BrowserUtils.waitFor(1);

        Alert alert=Driver.getDriver().switchTo().alert();
        alert.dismiss();
        Driver.getDriver().switchTo().defaultContent();
    }
    public void getLoggedTextMethod(String expectedVerify){

        String actualVerify = getLoggedText_loc.getText();
        System.out.println("expectedVerify = " + expectedVerify);
        System.out.println("actualVerify = " + actualVerify);
        Assert.assertEquals("failed", expectedVerify, actualVerify);
    }
    public void deleteAccountMethod(){
        deleteAccount_loc.click();
    }
    //Alert alert=driver.switchTo().alert();
    public void getDeletedMessageMethod(String expectedDeleteMsg){
        String actualDeleteMsg = getDeletedMessage_loc.getText();
        System.out.println("expectedDeleteMsg = " + expectedDeleteMsg);
        System.out.println("actualDeleteMsg = " + actualDeleteMsg);
        Assert.assertEquals("failed", expectedDeleteMsg, actualDeleteMsg);
    }
    public void lastContinueMethod(){
        lastContinueButton_loc.click();
    }

    public void correctEmailMtd(){
        correctEmail2_loc.sendKeys(ConfigurationReader.get("userEmail"));

//        Actions actions=new Actions(Driver.getDriver());  212. satırda kaldım.action class ile input yapamadım.
//        actions.click(correctEmail2_loc).sendKeys(ConfigurationReader.get("userEmail"))
//                .sendKeys(Keys.TAB).sendKeys(ConfigurationReader.get("password"));
    }
}

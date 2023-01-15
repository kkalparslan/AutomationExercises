package com.krafttech.step_definitions;

import com.krafttech.pages.BasePage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Register_StepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("The user should launch browser and navigate to url {string}")
    public void the_user_should_launch_browser_and_navigate_to_url(String url) {
        loginPage.navigateUrl(url);
    }

    /**
     * @Given("The user should launch browser and navigate to url") configuration properties den adresi almak istersek
     * feature da url vermemeiz gerekir
     * public void the_user_should_launch_browser_and_navigate_to_url() {
     * LoginPage loginPage=new LoginPage();
     * loginPage.navigateUrl();}
     */

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        loginPage.verifyHomePage();
    }
    @When("The user should click on Signup_Login button")
    public void the_user_should_click_on_signup_login_button() {
        loginPage.signupMtd();
    }

    @When("Verify {string} is visible")
    public void verify_is_visible(String message) {
        loginPage.getTextMessage(message);
    }

    @When("The user should enter name and email address")
    public void the_user_should_enter_name_and_email_address() {
        loginPage.writeNameAndEmailMtd();
        loginPage.clickAndSignupMethd();
    }

    @When("Verify that {string} is visible")
    public void verify_that_is_visible(String message) {
        loginPage.getAccountTextMtd(message);
    }

    @When("The user should fill details: Title, Name, Email, Password, Date of birth")
    public void the_user_should_fill_details_title_name_email_password_date_of_birth() {
        loginPage.fillDetailsMtd();
    }

    @When("The user should select checkboxes")
    public void the_user_should_select_checkboxes() {
        loginPage.signCheckBoxMtd();
    }

    @When("The user should fill addres information details")
    public void the_user_should_fill_addres_information_details() {
        loginPage.fillAddresInformationMtd();
        loginPage.fillAddress2Metd();
    }










}

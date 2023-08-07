package com.krafttech.step_definitions;

import com.krafttech.pages.LoginPage;
import io.cucumber.java.en.And;

public class PositifLogin_StepDefs {
    LoginPage loginPage = new LoginPage();

    @And("The user should enter correct email address and password")
    public void theUserShouldEnterCorrectEmailAddressAndPassword() {
        loginPage.correctEmailMtd();
    }
}

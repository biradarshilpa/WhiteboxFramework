package com.wbl.qa.pages;

import com.wbl.qa.basePage.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public static final Logger logger = LogManager.getLogger(LoginPage.class);

    @FindBy(xpath = "//h1[contains(text(),'Login')]")
    WebElement loginlogo;
    @FindBy(xpath = "//input[@id = 'username']")
    WebElement username;
    @FindBy(xpath = "//input[@id = 'password']")
    WebElement password;
    @FindBy(xpath = "//button[@id = 'login']")
    WebElement loginButton;
    @FindBy(xpath = "//button[@id = 'register']")
    WebElement registerButton;

    public LoginPage(){

        PageFactory.initElements(driver,this);
        logger.info("Initialized the Login page WebElements");

    }

    public String verifyLoginTitle(){
        logger.info("verifying the Login page  title");
      String actualT =  driver.getTitle();
      return actualT;
    }

    public boolean VerifyLoginLogo(){
        logger.info("verifying the Login Page logo");
      boolean b = loginlogo.isDisplayed();
      return b;
    }

    public boolean verifyLoginButton(){
      boolean b1 = loginButton.isEnabled();
      return b1;
    }

    public boolean verifyRegisterButton(){
        boolean b2 = registerButton.isEnabled();
        return b2;
    }

    public void clickOnRegisterButton(){
        logger.info("clicking on Registration button");
        registerButton.click();
    }

    public void verifyLogindata(String Uname,String pwd){
        logger.info("Sending the credentials to Login");
        username.sendKeys(Uname);
        password.sendKeys(pwd);
        loginButton.click();

    }



}

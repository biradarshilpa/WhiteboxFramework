package com.wbl.qa.pages;

import com.wbl.qa.basePage.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
    public static final Logger logger = LogManager.getLogger(RegisterPage.class);

    @FindBy(xpath = "//h1[contains(text() , 'Register')]")
    WebElement registerLogo;

    @FindBy(xpath = "//input[@name = 'username']")
    WebElement username;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement password;

    @FindBy(xpath = "//input[@name = 'fullname']")
    WebElement fullname;

    @FindBy(xpath = "//input[@name = 'phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@name = 'address']")
    WebElement address;

    @FindBy(xpath = "//input[@name = 'city']")
    WebElement city;

    @FindBy(xpath = "//select[@name = 'country']")
    WebElement country;

    @FindBy(xpath = "//input[@name = 'zip']")
    WebElement zip;

    @FindBy(xpath = "//button[@name ='register']")
    WebElement registerpagebutton;

    public RegisterPage(){

        PageFactory.initElements(driver,this);
        logger.info("Initialized the  Register page WebElements");
    }


    public boolean verifyRegisterLogo(){
        logger.info("verifying the Register logo");
       boolean b = registerLogo.isDisplayed();
       return b;

    }

    public void verifyRegisterDetails( String u, String p, String nm, String ph, String add, String cy, String z,String con)
    {
        logger.info("Sending the Registration details");
        username.sendKeys(u);
        password.sendKeys(p);
        fullname.sendKeys(nm);
        phone.sendKeys(ph);
        address.sendKeys(add);
        city.sendKeys(cy);
        zip.sendKeys(z);
        country.sendKeys(con);
        registerpagebutton.click();
    }






}

package com.wbl.qa.pages;

import com.wbl.qa.basePage.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public static final Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//img[@id = 'logo']")
    WebElement wbllogo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeBtn;

    @FindBy(xpath = "//a[@id = 'loginButton' and @href ='login.php']")
    WebElement loginBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
        logger.info("Initialized the Home page WebElements");
    }

    public String verifyHomeTitle(){
        logger.info("verifying the title");
       String title = driver.getTitle();
       return title;

    }

    public boolean verifyLogo(){
        logger.info("verifying the logo");
        boolean logo = wbllogo.isDisplayed();
        return logo;
    }

    public LoginPage VerifyLogin(){
        logger.info("clicking on login button");
      boolean login =  loginBtn.isDisplayed();
      loginBtn.click();
      return new LoginPage();


    }




}

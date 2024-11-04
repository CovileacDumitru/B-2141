package org.example.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormaPage {

    public static WebDriver driver;
    @FindBy(id = "firstName")
    WebElement firstNameEl;

    @FindBy(id = "lastName")
    WebElement lastNameEL;

    @FindBy(id = "userEmail")
    WebElement userEmailEL;

    public FormaPage(WebDriver driver) {
        FormaPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastNameEL(String lastNameParam) {
        lastNameEL.sendKeys(lastNameParam);
    }

    public void setUserEmailEL(String userEmailParam) {
        lastNameEL.sendKeys(userEmailParam);
    }
    }


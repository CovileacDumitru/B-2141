package org.example.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormaPage {

    public static WebDriver driver;
    public static JavascriptExecutor executor;
    @FindBy(id = "firstName")
    WebElement firstNameEl;

    @FindBy(id = "lastName")
    WebElement lastNameEL;

    @FindBy(id = "userEmail")
    WebElement userEmailEL;
    @FindBy(id = "gender-radio-1")
    WebElement genderEl;
    @FindBy(id = "userNumber")
    WebElement numberEl;
    @FindBy(id = "state")
    WebElement stateEl;

    public FormaPage(WebDriver driver) {
        FormaPage.driver = driver;
        executor = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
    public void setGender() {
        genderEl.sendKeys( "");
    }
    public void setStateEl(String stateParam) {
        closeAdv();
        stateEl.click();
    }
    public void setnumber(String numberParam) {
        numberEl.sendKeys(numberParam);
    }

    public void setFirstName(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastNameEL(String lastNameParam) {
        lastNameEL.sendKeys(lastNameParam);
    }

    public void setUserEmailEL(String userEmailParam) {
        userEmailEL.sendKeys(userEmailParam);
    }
    public void closeAdv() {
        try {
            executor.executeScript("var elem = document.evaluate(\"//footer\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
                    "elem.parentNode.removeChild(elem);");
        }
        catch (Exception ignored) {}
        try {
            executor.executeScript("var elem = document.getElementById('fixedban');" +
                    "elem.parentNode.removeChild(elem);");
        }
        catch (Exception ignored) {}


    }
    }


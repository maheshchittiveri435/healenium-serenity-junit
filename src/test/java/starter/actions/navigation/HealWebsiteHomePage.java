package starter.actions.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://elenastepuro.github.io/test_env/index.html")
public class HealWebsiteHomePage extends PageObject {


//    By txt_InputField = $(By.id("change_id"));
//    By btn_submit = $(By.id("Submit"));
//
    org.openqa.selenium.By txt_Input1 = By.id("change_id");
    By btn_Submit = By.id("Submit");
    By txt_Input2 = By.id("change_className");
    By txt_Input3 = By.id("change_below_element");
    By txt_Input4 = By.id("change_enabled");
    By txt_Input5 = By.id("change:name");
    By txt_Input6 = By.id("change_links");
    public void healTest(WebDriver driver, String input) {
        driver.get("https://elenastepuro.github.io/test_env/index.html");
        driver.findElement(txt_Input1).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input1).getAttribute("id") + " String is : " + input);
        driver.findElement(btn_Submit).click();
        driver.findElement(txt_Input1).clear();
        System.out.println("ID is: " + driver.findElement(txt_Input1).getAttribute("id") + " String is : " + input);
        driver.findElement(txt_Input1).sendKeys(input);
    }

    public HealWebsiteHomePage loadUrl(WebDriver driver){
        driver.get("https://elenastepuro.github.io/test_env/index.html");
        return this;
    }
    public HealWebsiteHomePage submitForm(WebDriver driver){
        driver.findElement(btn_Submit).click();
        return this;
    }

    public HealWebsiteHomePage fillInput1(WebDriver driver, String input){
        driver.findElement(txt_Input1).clear();
        driver.findElement(txt_Input1).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input1).getAttribute("id") + " String is : " + input);
        return this;
    }
    public HealWebsiteHomePage fillInput2(WebDriver driver, String input){
        driver.findElement(txt_Input2).clear();
        driver.findElement(txt_Input2).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input2).getAttribute("id") + " String is : " + input);
        return this;
    }
    public HealWebsiteHomePage fillInput3(WebDriver driver, String input){
        driver.findElement(txt_Input3).clear();
        driver.findElement(txt_Input3).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input3).getAttribute("id") + " String is : " + input);
        return this;
    }
    public HealWebsiteHomePage fillInput4(WebDriver driver, String input){
        driver.findElement(txt_Input4).clear();
        driver.findElement(txt_Input4).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input4).getAttribute("id") + " String is : " + input);
        return this;
    }

    public HealWebsiteHomePage fillInput4Disabled(WebDriver driver){

        System.out.println("txt_Input4.isEnabled() : " + driver.findElement(txt_Input4).isEnabled());
        return this;
    }
    public HealWebsiteHomePage fillInput5(WebDriver driver, String input){
        driver.findElement(txt_Input5).clear();
        driver.findElement(txt_Input5).sendKeys(input);
        System.out.println("ID is: " + driver.findElement(txt_Input5).getAttribute("id") + " String is : " + input);
        return this;
    }

    public HealWebsiteHomePage fillInput6(WebDriver driver){
        System.out.println("Link is displayed: " + driver.findElement(txt_Input6).isDisplayed());
        return this;
    }


}

package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.drivers.CustomDriver;
import starter.actions.navigation.HealWebsiteHomePage;
import starter.actions.navigation.NavigateTo;
import starter.actions.search.LookForInformation;
import org.junit.jupiter.api.parallel.Execution;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@ExtendWith(SerenityJUnit5Extension.class)
@Execution(CONCURRENT)
class WhenSearchingForTerms {
    CustomDriver customDriver;
    WebDriver serenityDriver;
    HealWebsiteHomePage healWebsiteHomePage;
    @CastMember
    Actor actor;

    @BeforeEach
    void setUp() throws MalformedURLException {
        customDriver = new CustomDriver();
        serenityDriver = customDriver.setCustomWebdriver();
        healWebsiteHomePage = new HealWebsiteHomePage();
    }

//    @Test
    @DisplayName("Should be able to search for red things")
    void searchForRedThings() {

        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.about("red"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("red")
        );
    }

    @Test
    @DisplayName("Should be able to search for green things")
    void searchForGreenThings() {
        actor.attemptsTo(
                NavigateTo.theSearchHomePage(),
                LookForInformation.about("green"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("green")
        );
    }

    @Test
    @DisplayName("Healenium test 1")
    void healTest() {
        healWebsiteHomePage.healTest(serenityDriver, "INPUT INTO THE FIELD");

        //Below steps are duplicate by just following hard coding approach

//        SelfHealingDriver driver = SelfHealingDriver.create(new ChromeDriver());
//        Serenity.getWebdriverManager().setCurrentDriver(driver);
//        Serenity.getWebdriverManager().getWebdriver().get("https://elenastepuro.github.io/test_env/index.html");
//        Serenity.getWebdriverManager().getWebdriver().findElement(By.id("change_id")).sendKeys("input before");
//        System.out.println("ID is: " + Serenity.getWebdriverManager().getWebdriver().findElement(By.id("change_id")).getAttribute("id"));
//        Serenity.getWebdriverManager().getWebdriver().findElement(By.id("Submit")).click();
//        System.out.println("ID is: " + Serenity.getWebdriverManager().getWebdriver().findElement(By.id("change_id")).getAttribute("id"));
//        Serenity.getWebdriverManager().getWebdriver().findElement(By.id("change_id")).sendKeys(" input after");
//        System.out.println("ID is: " + Serenity.getWebdriverManager().getWebdriver().findElement(By.id("change_id")).getAttribute("id"));

    }

    @Test
    @DisplayName("Healenium test 2")
    void healTest2() {
        healWebsiteHomePage.loadUrl(serenityDriver)
                .fillInput1(serenityDriver, "Mahesh")
                .fillInput2(serenityDriver, "Chittiveri")
                .fillInput3(serenityDriver, "Automation")
                .fillInput4(serenityDriver, "Serenity")
                .fillInput5(serenityDriver, "junit")
                .fillInput6(serenityDriver)
                .submitForm(serenityDriver)
                .fillInput1(serenityDriver, "MAHESH ")
                .fillInput2(serenityDriver, "CHITTI")
                .fillInput3(serenityDriver, "AUTO")
                .fillInput4Disabled(serenityDriver)
                .fillInput5(serenityDriver, "JUNIT")
                .fillInput6(serenityDriver);
    }
    @Test
    @DisplayName("Healenium test 3")
    void healTest3() {
        healWebsiteHomePage.loadUrl(serenityDriver)
                .fillInput1(serenityDriver, "Girish")
                .fillInput2(serenityDriver, "Chittiveri")
                .fillInput3(serenityDriver, "Automation")
                .fillInput4(serenityDriver, "Serenity")
                .fillInput5(serenityDriver, "junit")
                .fillInput6(serenityDriver)
                .submitForm(serenityDriver)
                .fillInput1(serenityDriver, "GIRISH ")
                .fillInput2(serenityDriver, "CHITTI")
                .fillInput3(serenityDriver, "AUTO")
                .fillInput4Disabled(serenityDriver)
                .fillInput5(serenityDriver, "JUNIT")
                .fillInput6(serenityDriver);
    }
    @Test
    @DisplayName("Healenium test 4")
    void healTest4() {
        healWebsiteHomePage.loadUrl(serenityDriver)
                .fillInput1(serenityDriver, "Suresh")
                .fillInput2(serenityDriver, "Chittiveri")
                .fillInput3(serenityDriver, "Automation")
                .fillInput4(serenityDriver, "Serenity")
                .fillInput5(serenityDriver, "junit")
                .fillInput6(serenityDriver)
                .submitForm(serenityDriver)
                .fillInput1(serenityDriver, "SURESH ")
                .fillInput2(serenityDriver, "CHITTI")
                .fillInput3(serenityDriver, "AUTO")
                .fillInput4Disabled(serenityDriver)
                .fillInput5(serenityDriver, "JUNIT")
                .fillInput6(serenityDriver);
    }

}

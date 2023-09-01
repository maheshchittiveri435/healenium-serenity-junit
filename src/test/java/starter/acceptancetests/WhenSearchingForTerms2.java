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

import java.net.MalformedURLException;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms2 {
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

    @Test
    @DisplayName("Healenium test 5")
    void healTest5() {
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
    @DisplayName("Healenium test 6")
    void healTest6() {
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
    @DisplayName("Healenium test 7")
    void healTest7() {
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

    @Test
    @DisplayName("Healenium test 10")
    void healTest10() {
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
    @DisplayName("Healenium test 9")
    void healTest9() {
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
    @DisplayName("Healenium test 8")
    void healTest8() {
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

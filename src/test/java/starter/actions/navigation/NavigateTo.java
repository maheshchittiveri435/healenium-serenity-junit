package starter.actions.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.actions.drivers.CustomDriver;

import java.net.MalformedURLException;

public class NavigateTo {
    public static Performable theSearchHomePage() {

       return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class));
    }

    public static Performable theHealHomePage() throws MalformedURLException {

        CustomDriver c= new CustomDriver();
        c.setCustomWebdriver();

        return Task.where("{0} opens the Healenium test home page",
                Open.browserOn().the(HealWebsiteHomePage.class));
    }

}

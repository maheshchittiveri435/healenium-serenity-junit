package starter.actions.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.testcontainers.containers.wait.strategy.Wait;

public class LookForInformation {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchForm.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable healInput(String searchTerm) {
        return Task.where("{0} inputs  '" + searchTerm + "'",

                Enter.theValue(searchTerm)
                        .into(SearchForm.INPUT_FIELD)
        );
    }

    public static Performable clickSubmit() {
        return Task.where("{0} performs submit ",
                Click.on(SearchForm.SUBMIT_BTN)
        );
    }
}

package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");
    static Target INPUT_FIELD = Target.the("input field").locatedBy("#change_id");
    static Target SUBMIT_BTN = Target.the("submit button").locatedBy("#Submit");

}

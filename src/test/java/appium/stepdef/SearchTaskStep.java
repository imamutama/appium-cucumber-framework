package appium.stepdef;

import appium.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchTaskStep extends BasePage {

    @When("user click search")
    public void userClickSearch() {
        home.clickBtnSearch();
    }

    @And("user input search task {string}")
    public void userInputSearchTask(String text) {
        home.inputSearch(text);
    }

    @When("user clear text search")
    public void userClearText() {
        home.clearSearch();
    }
}

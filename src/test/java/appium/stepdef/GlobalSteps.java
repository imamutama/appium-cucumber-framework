package appium.stepdef;

import appium.helper.Actions;
import appium.pages.BasePage;
import appium.pages.FormTaskPage;
import appium.pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlobalSteps extends BasePage {
    @Given("user click add create task")
    public void userTapsOnButton() throws Throwable {
        home.clickAddTask();
    }

    @Then("user should see detail information {string}")
    public void userShouldSeeDetailInformation(String text) {
        Actions.waitVisibilityText(text);
    }

    @When("user click button check box")
    public void userClickButtonCheckBox() {
        home.clickCheckBox();
    }

    @When("user clear text")
    public void userClearText() {
        formTaskPage.clearInputTask();
    }

    @When("user click on by {string} text")
    public void userClickOnByonText(String text) {
        Actions.clickByText(text);
    }

}

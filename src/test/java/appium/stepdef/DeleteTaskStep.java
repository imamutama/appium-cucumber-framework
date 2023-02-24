package appium.stepdef;

import appium.helper.Actions;
import appium.pages.BasePage;
import appium.pages.FormTaskPage;
import appium.pages.Home;
import io.cucumber.java.en.When;

public class DeleteTaskStep extends BasePage {
    @When("user click button delete")
    public void userClickButtonDelete() {
        formTaskPage.clickDeleteTask();
        formTaskPage.btnOk();
    }
}

package appium.stepdef;

import appium.helper.Actions;
import appium.pages.BasePage;
import appium.pages.FormTaskPage;
import appium.pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UpdateTaksStep extends BasePage {
    @Given("user create new task from quick task {string}")
    public void userCreateNewTaskFromQuickTask(String taskUpdate) {
        home.inputByQuick(taskUpdate);
        home.btnAddQuick();
    }

    @When("user update task from quick task {string}")
    public void userUpdateTaskFromQuickTask(String text) throws Exception {
        Actions.clickByText(text);
    }
}

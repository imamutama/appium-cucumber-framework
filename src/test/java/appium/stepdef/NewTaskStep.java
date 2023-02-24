package appium.stepdef;

import appium.pages.BasePage;
import appium.pages.FormTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NewTaskStep extends BasePage {



    @When("user input text task {string}")
    public void userInputTextTask(String text) {
        formTaskPage.inputTask(text);
    }

    @And("user input date task {string}")
    public void userInputDateTask(String date) {
        formTaskPage.inputDate();
        formTaskPage.getDate(date);
        formTaskPage.btnOk();
    }

    @And("user choose repeat task {string}")
    public void userChooseRepeatTask(String text) throws InterruptedException {
        formTaskPage.chooseRepeat(text);
    }

    @And("user choose add list task {string}")
    public void userChooseAddListTask(String text) throws InterruptedException {
        formTaskPage.chooseList(text);
    }

    @And("user save task")
    public void userSaveTask() {
        formTaskPage.clickSave();
    }

    @And("user input time task")
    public void userInputTimeTask() {
        formTaskPage.inputTime();
        formTaskPage.btnOk();
    }

    @And("user add new list task {string}")
    public void userAddNewListTask(String newList) {
        formTaskPage.clickAddNewList();
        formTaskPage.inputAddNewList(newList);
        formTaskPage.btnOk();
    }

}

package appium.pages;

import appium.helper.Actions;
import appium.helper.ConvertDate;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class FormTaskPage extends Actions {

    @AndroidFindBy(id = "com.splendapps.splendo:id/edtTaskName")
    private MobileElement input_task;

    @AndroidFindBy(id = "com.splendapps.splendo:id/edtDueD")
    private MobileElement input_date;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btn_ok;

    @AndroidFindBy(id = "com.splendapps.splendo:id/spinnerRepeat")
    private MobileElement btn_choose_repeat;

    @AndroidFindBy(id = "com.splendapps.splendo:id/spinnerLists")
    private MobileElement btn_add_list;

    @AndroidFindBy(id = "com.splendapps.splendo:id/fabSaveTask")
    private MobileElement btn_save_task;

    @AndroidFindBy(id = "com.splendapps.splendo:id/edtDueT")
    private MobileElement btn_time;

    @AndroidFindBy(id = "com.splendapps.splendo:id/btnAddList")
    private MobileElement btn_add_new_list;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private MobileElement input_add_new_list;

    @AndroidFindBy(id = "com.splendapps.splendo:id/action_delete_task")
    private MobileElement btn_delete_task;


    public FormTaskPage inputTask(String text) {
        sendKeys(this.input_task, text);
        return this;
    }

    public FormTaskPage inputDate() {
        click(this.input_date);
        return this;
    }

    public FormTaskPage inputTime() {
        click(this.btn_time);
        return this;
    }

    public FormTaskPage btnOk() {
        click(this.btn_ok);
        return this;
    }


    public FormTaskPage chooseRepeat(String txt) throws InterruptedException {
        chooseDropdown(this.btn_choose_repeat, txt);
        return this;
    }

    public FormTaskPage chooseList(String txt) throws InterruptedException {
        chooseDropdown(this.btn_add_list, txt);
        return this;
    }

    public FormTaskPage clickSave() {
        click(this.btn_save_task);
        return this;
    }

    public FormTaskPage getDate(String typDate) {
        switch (typDate) {
            case "today":
                clickByText(ConvertDate.getDateToday());
                break;
            case "yesterday":
                clickByText(ConvertDate.getDateYesterday());
                break;
            case "tomorrow":
                clickByText(ConvertDate.getDateTommorow());
                break;
        }
        return this;
    }

    public FormTaskPage clickAddNewList() {
        click(this.btn_add_new_list);
        return this;
    }

    public FormTaskPage inputAddNewList(String text) {
        sendKeys(this.input_add_new_list, text);
        return this;
    }

    public FormTaskPage clearInputTask() {
        clear(this.input_task);
        return this;
    }

    public FormTaskPage clickDeleteTask() {
        click(this.btn_delete_task);
        return this;
    }
}

package appium.pages;

import appium.helper.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class Home extends Actions {

    @AndroidFindBy(id = "com.splendapps.splendo:id/fabAddTask")
    public MobileElement btn_add_task;

    @AndroidFindBy(id = "com.splendapps.splendo:id/checkDone")
    private List<MobileElement> btn_check_box;

    @AndroidFindBy(id = "com.splendapps.splendo:id/etQuickTask")
    private MobileElement input_by_quick;

    @AndroidFindBy(id = "com.splendapps.splendo:id/ivAddQuickTask")
    private MobileElement btn_add_quick;

    @AndroidFindBy(id = "com.splendapps.splendo:id/task_list_item")
    private List<MobileElement> listItem;

    @AndroidFindBy(id = "com.splendapps.splendo:id/action_search")
    private MobileElement btn_search;

    @AndroidFindBy(id = "com.splendapps.splendo:id/search_src_text")
    private MobileElement input_search;

    public Home getListItem(String text) throws Exception {
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getText().contains(text)) {
                listItem.get(i).click();
            } else {
                throw new Exception("Invalid element");
            }
        }
        return this;
    }

    public Home inputByQuick(String text) {
        sendKeys(this.input_by_quick, text);
        return this;
    }

    public Home btnAddQuick() {
        click(this.btn_add_quick);
        return this;
    }

    public Home clickAddTask() {
        click(btn_add_task);
        return this;
    }

    public Home clickCheckBox() {
        this.btn_check_box.get(0).click();
        return this;
    }

    public Home clickBtnSearch() {
        click(this.btn_search);
        return this;
    }

    public Home inputSearch(String text) {
        sendKeys(this.input_search, text);
        return this;
    }

    public Home clearSearch(){
        clear(this.input_search);
        return this;
    }


}

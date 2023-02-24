package appium.pages;

public class BasePage {
    public Home home;
   public FormTaskPage formTaskPage;

    public BasePage() {
        home = new Home();
        formTaskPage = new FormTaskPage();
    }
}

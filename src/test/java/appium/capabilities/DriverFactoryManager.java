package appium.capabilities;

import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class DriverFactoryManager {

    private static AppiumDriver<?> Driver;
    private static AppiumDriverLocalService service;


    public static AppiumDriver<?> startDriverByMavenParameter(String mavenEnvironment) {

        if (Driver == null) {

            try {

                if (mavenEnvironment.contains("ANDROID")) {
                    Driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), AndroidDevicesCapabilities.valueOf(mavenEnvironment).getAndroidCapabilitiesFromPlataform());
                } else if (mavenEnvironment.contains("IPHONE")) {
                    System.out.println("not running ios");
                }

            } catch (IllegalArgumentException e) {
                AndroidDevicesCapabilities.showAvaliableAndroidDevices();
                System.exit(1);
            } catch (UnreachableBrowserException e) {
                System.exit(1);
            } catch (MalformedURLException e) {
                System.exit(1);
            }
        }

        return Driver;
    }

    public static AppiumDriver<?> getDriver() {
        return Driver;
    }

    public static void reLaunchApp() {
        if (Driver != null) {
            Driver.launchApp();
        }
    }

    public static void quitDriver() {
        if (Driver != null) {
            Driver.quit();
        }
    }

    public static String getPageHierarchy() {
        return Driver.getPageSource();
    }


}


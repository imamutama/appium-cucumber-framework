package appium.capabilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum AndroidDevicesCapabilities {


    ANDROID_EMULATOR("resources/capabilities/android-emulator.json"),
    ANDROID_REAL_DEVICE("resources/capabilities/android-real-device.json");


    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromPlataform() {
        DesiredCapabilities androidCapabilities = Load_capabilities.pathToDesiredCapabilitites(this.path);
        androidCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.splendapps.splendo");
        androidCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
        return androidCapabilities;
    }

    public static void showAvaliableAndroidDevices() {
        System.out.println("======= ANDROID DEVICES ====== ");
        for (AndroidDevicesCapabilities androidDevicesCapabilities : AndroidDevicesCapabilities.values()) {
            System.out.println(androidDevicesCapabilities.name());
        }
    }
}

# Software Development Engineer in Test

Appium maven with cucumber for Android

## Requirements

* Java 8
* Appium 1.22.3
* Maven
* Android Real Device or Emulator

## Running Tests

1. Start appium server: `$ appium`
2. Installation this [apk](https://m.apkpure.com/to-do-list/com.splendapps.splendo/download?from=details) on real device or emulator
3. Run android real device
   tests: `$ mvn clean test -Dcucumber.filter.tags="@here_tag" -Denv.PLATAFORM=ANDROID_REAL_DEVICE`
4. Run android emulator
   tests: `$ mvn clean test -Dcucumber.filter.tags="@here_tag" -Denv.PLATAFORM=ANDROID_EMULATOR`

### Notes :
1. For running real device your update udid in file android-real-device.json from package capibillities
2. For running emulator your install emulator verison 9.0
3. Example tag feature:
- @create-task
- @search-task
- @update-task
- @finish-task
- @delete-task

## Video Running Automation : 

https://user-images.githubusercontent.com/49465828/221190773-32fd2182-6809-4ed1-9455-075725708298.mp4










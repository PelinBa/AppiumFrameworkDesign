package org.pb.utils;

import io.appium.java_client.AppiumDriver;

public class AppiumUtils {

    //Bu class hem android sistemin hem de IOS sistemin aynı anda çalışmasını sağlıyor. Çünkü android ve ios için ortak parent class Appium Driver'dır.
    //Ios testi yapacak olursan bu class için bölüm 18 ders 83'e tekrardan bakabilirsin.

    AppiumDriver driver;

    public AppiumUtils(AppiumDriver driver) {
        this.driver = driver;
    }
}

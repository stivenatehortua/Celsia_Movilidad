package co.com.reto.app.celsiamovilidad.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverMobile {

    private DriverMobile(){

    }

    public static WebDriver whitCelsiaMovilidad(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid","116c5e4e");
        capabilities.setCapability("appPackage","boken.epsacelsia");
        capabilities.setCapability("appActivity","boken.epsacelsia.Login");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("deviceName","Xiaomi");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("platformName","ANDROID");

        try{
            return new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}

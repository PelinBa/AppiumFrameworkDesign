package org.pb.pageObjects.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.pb.utils.AndroidActions;

public class FormPage extends AndroidActions {

    private final AndroidDriver driver;

    public FormPage (AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (id = "android:id/text1")
    private WebElement countryDropDown;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/radioFemale")
    private WebElement genderOption;

    private final By button = AppiumBy.className("android.widget.Button");

    public void openDropDown () {
        countryDropDown.click();
    }

    public void setName () {
        nameField.sendKeys("Pelin");
    }

    public void setGender () {
        genderOption.click();
    }

    public void submitForm () {
        driver.findElement(button).click();
    }
}

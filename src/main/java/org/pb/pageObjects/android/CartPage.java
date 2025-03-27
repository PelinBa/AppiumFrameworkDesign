package org.pb.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.pb.utils.AndroidActions;

public class CartPage extends AndroidActions {

    private AndroidDriver driver;

    public CartPage (AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (id="android:id/button1")
    private WebElement closeButton;

    @AndroidFindBy (className="android.widget.CheckBox")
    private WebElement checkbox;

    @AndroidFindBy (id="com.androidsample.generalstore:id/btnProceed")
    private WebElement shoppingButton;


    public void clickCloseButton () {
        closeButton.click();
    }

    public void clickCheckbox () {
        checkbox.click();
    }

    public void clickShoppingButton () {
        shoppingButton.click();
    }
}

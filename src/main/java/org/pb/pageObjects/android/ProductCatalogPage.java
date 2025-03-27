package org.pb.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.pb.utils.AndroidActions;

public class ProductCatalogPage extends AndroidActions {

    private AndroidDriver driver;

    public ProductCatalogPage (AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (xpath = "(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]")
    private WebElement product1;

    @AndroidFindBy (xpath = "(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[2]")
    private WebElement product2;

    @AndroidFindBy (id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement basketButton;


    public void addProducts () {
        product1.click();
        scrollToText("Jordan 6 Rings");
        product2.click();
    }

    public void clickBasketButton () {
        basketButton.click();
    }
}

package org.pb;
import io.appium.java_client.AppiumBy;
import org.pb.pageObjects.android.CartPage;
import org.pb.pageObjects.android.FormPage;
import org.pb.pageObjects.android.ProductCatalogPage;
import org.pb.utils.AndroidActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerceTest_4_Hybrid extends BaseTest{

    @Test
    public void fillForm () throws InterruptedException {
        AndroidActions androidActions = new AndroidActions(driver);
        FormPage formPage = new FormPage(driver);
        ProductCatalogPage productCatalogPage = new ProductCatalogPage(driver);
        CartPage cartPage = new CartPage(driver);

        //Fill the form
        formPage.openDropDown();
        androidActions.scrollToText("Belgium");
        formPage.setName();
        formPage.setGender();
        formPage.submitForm();
        Thread.sleep(1000);

        //Add products and go to cart page
        productCatalogPage.addProducts();
        productCatalogPage.clickBasketButton();
        Thread.sleep(1000);

        //Verify the products in the cart page
        String firstProduct = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']")).getText();
        Assert.assertEquals(firstProduct, "Air Jordan 4 Retro");
        String secondProduct = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Jordan 6 Rings']")).getText();
        Assert.assertEquals(secondProduct, "Jordan 6 Rings");
        System.out.println("Products in the basket:" + "\n" + firstProduct + "\n" + secondProduct);

        //Cart page actions
        androidActions.longPressAction();
        cartPage.clickCloseButton();
        cartPage.clickCheckbox();
        cartPage.clickShoppingButton();
    }
}

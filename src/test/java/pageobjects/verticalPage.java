package pageobjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class verticalPage extends util {
    @AndroidFindBy(xpath = "//*[@text='Vertical swiping']")protected WebElement lblTitulo;

    public verticalPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertTrue(lblTitulo.isDisplayed());
    }

    public void encontrarOpcion(String opcion){
        String scroll="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+opcion+"\"))";
        driver.findElement(MobileBy.AndroidUIAutomator(scroll));
    }
}

package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class doublePage extends util {
    @AndroidFindBy(accessibility = "doubleTapMe")protected WebElement btnDouble;
    @AndroidFindBy(id = "android:id/message")protected WebElement lblMensaje;
    @AndroidFindBy(id = "android:id/button1")protected WebElement btnOK;

    public doublePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void dobleClickBoton(){
        wait.until(ExpectedConditions.visibilityOf(btnDouble));
        Point xyButton = btnDouble.getLocation();
        Dimension dimButton = btnDouble.getSize();

        int xbutton= xyButton.getX() +dimButton.getWidth()/2;
        int ybutton = xyButton.getY() + dimButton.getHeight()/2;

        action.tap(PointOption.point(xbutton,ybutton)).tap(PointOption.point(xbutton,ybutton)).perform();
    }

    public void validarMensaje(){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertTrue(lblMensaje.isDisplayed());
    }

    public void clickOK(){
        btnOK.click();
    }
}

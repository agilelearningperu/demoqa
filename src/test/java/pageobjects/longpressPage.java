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

public class longpressPage extends util {
    @AndroidFindBy(accessibility = "longpress")protected WebElement btnLongpress;
    @AndroidFindBy(id = "android:id/message")protected WebElement lblMensaje;
    @AndroidFindBy(id = "android:id/button1")protected WebElement btnOK;

    public longpressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void LongPress(){
        wait.until(ExpectedConditions.visibilityOf(btnLongpress));
        Point xyButtom= btnLongpress.getLocation();
        Dimension dimButtom= btnLongpress.getSize();

        int xbuttom= xyButtom.getX() + dimButtom.getWidth()/2;
        int ybuttom= xyButtom.getY() + dimButtom.getHeight()/2;

        action.longPress(PointOption.point(xbuttom,ybuttom)).perform();
    }

    public void validarMensaje(){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertTrue(lblMensaje.isDisplayed());
    }

    public void clickOK(){
        btnOK.click();
    }
}

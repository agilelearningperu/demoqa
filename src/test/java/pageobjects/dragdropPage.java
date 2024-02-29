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

public class dragdropPage extends util{
    @AndroidFindBy(accessibility = "dragMe")
    protected WebElement drag;
    @AndroidFindBy(accessibility = "dropzone")
    protected WebElement drop;
    @AndroidFindBy(accessibility = "success")
    protected WebElement lblMensaje;

    public dragdropPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void moverObjeto(){
        wait.until(ExpectedConditions.visibilityOf(drag));
        Point xyDrag = drag.getLocation();
        Dimension dimDrag = drag.getSize();

        int xdrag = xyDrag.getX() + dimDrag.getWidth()/2;
        int ydrag = xyDrag.getY() + dimDrag.getHeight()/2;

        Point xyDrop = drop.getLocation();
        Dimension dimDrop = drop.getSize();

        int xdrop = xyDrop.getX() + dimDrop.getWidth()/2;
        int ydrop = xyDrop.getY() + dimDrop.getHeight()/2;

        action.longPress(PointOption.point(xdrag,ydrag)).moveTo(PointOption.point(xdrop, ydrop)).release().perform();
    }

    public void validarMensaje(){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertTrue(lblMensaje.isDisplayed());
    }
}
package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;


public class menuPage extends util {
    @AndroidFindBy(accessibility = "chainedView")protected WebElement btnChained;
    @AndroidFindBy(accessibility = "slider1")protected WebElement btnSlider;
    @AndroidFindBy(accessibility = "verticalSwipe")protected WebElement btnSwipe;
    @AndroidFindBy(accessibility = "dragAndDrop")protected WebElement btnDragDrop;
    @AndroidFindBy(accessibility = "doubleTap")protected WebElement btnDoubleTap;
    @AndroidFindBy(accessibility = "longPress")protected WebElement btnLongPress;
    @AndroidFindBy(xpath = "//*[@text='Samples List']")protected  WebElement lblTitulo;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Wheel Picker\"))") protected WebElement scroll;

    public menuPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void validarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertTrue(lblTitulo.isDisplayed());
    }

    public void clickChainedView(){
        wait.until(ExpectedConditions.visibilityOf(btnChained));
        btnChained.click();
    }

    public void clickOpcionWheelPicker(){
//        String scroll="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+opcion+"\"))";
//        driver.findElement(MobileBy.AndroidUIAutomator(scroll)).click();
            scroll.click();
    }

    public void clickSlider(){
        wait.until(ExpectedConditions.visibilityOf(btnSlider));
        btnSlider.click();
    }

    public void clickVeticalSwipe(){
        wait.until(ExpectedConditions.visibilityOf(btnSwipe));
        btnSwipe.click();
    }

    public void clickDragDrop(){
        wait.until(ExpectedConditions.visibilityOf(btnDragDrop));
        btnDragDrop.click();
    }

    public void clickDoubleTap(){
        wait.until(ExpectedConditions.visibilityOf(btnDoubleTap));
        btnDoubleTap.click();
    }

    public void clickLongPress(){
        wait.until(ExpectedConditions.visibilityOf(btnLongPress));
        btnLongPress.click();
    }
}

package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class sliderPage extends util {
    @AndroidFindBy(accessibility = "slider") protected WebElement slider;

    public sliderPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void moverSlider(float valor){
        float porcentaje = valor/100;
        wait.until(ExpectedConditions.visibilityOf(slider));
        int xStart = slider.getLocation().getX();
        int yPoint= slider.getLocation().getY();
        int xEnd = (int)(xStart + slider.getSize().getWidth()*porcentaje);

        action.press(PointOption.point(xStart,yPoint)).moveTo(PointOption.point(xEnd, yPoint)).release().perform();
    }
}

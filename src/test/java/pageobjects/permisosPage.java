package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class permisosPage extends util {
    @AndroidFindBy(id = "com.android.permissioncontroller:id/continue_button") protected WebElement btnContinuar;
    @AndroidFindBy(id = "android:id/button1") protected WebElement btnOK;


    public permisosPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickContinuar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnContinuar));
        btnContinuar.click();
    }

    public void clickOK(){
        wait.until(ExpectedConditions.elementToBeClickable(btnOK));
        btnOK.click();
    }
}

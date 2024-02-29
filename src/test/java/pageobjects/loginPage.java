package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class loginPage extends util {
    @AndroidFindBy(accessibility = "username") protected WebElement txtUsuario;
    @AndroidFindBy(accessibility = "password") protected WebElement txtPassword;
    @AndroidFindBy(xpath = "//*[@text='LOG IN']") protected WebElement btnIngresar;
    @AndroidFindBy(id = "android:id/message") protected WebElement lblMensaje;

    public loginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void escribirUsuario(String user){
        wait.until(ExpectedConditions.visibilityOf(txtUsuario));
        txtUsuario.clear();
        txtUsuario.sendKeys(user);
    }

    public void escribirPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }

    public void clickIngresar(){
        btnIngresar.click();
    }

    public void validarLoginFallido(String msj){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertEquals(msj,lblMensaje.getText());
    }
}

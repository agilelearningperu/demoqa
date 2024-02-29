package pageobjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class googlePage extends util {
    @FindBy(name = "q")protected WebElement txtbuscador;

    public googlePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void buscarTexto(String texto){
        wait.until(ExpectedConditions.visibilityOf(txtbuscador));
        txtbuscador.sendKeys(texto);
        txtbuscador.sendKeys(Keys.ENTER);
    }
}

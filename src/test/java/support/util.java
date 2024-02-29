package support;

import definitions.hooks;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


public class util extends hooks {
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public static TouchAction action;

    public util() {
        driver = driverand;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        action = new TouchAction(driver);
    }

    public void evidencia() throws IOException {
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
        String name = formato.format(hoy)+"_mobile.jpg";
        String path="D:\\ALP - Agile Learning Perú\\Cursos\\Proyectos\\appiummodulo2\\target\\evidencias\\";
        File imagen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(imagen, new File(path+name));
    }
}

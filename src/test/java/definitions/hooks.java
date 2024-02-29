package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks {
    public static AndroidDriver driverand;
    public static IOSDriver driverios;
    private static String OS = "Android";

    @Before
    public static void setUp() throws MalformedURLException {
        if (OS.equals("Android")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulador");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//            capabilities.setCapability(MobileCapabilityType.APP, "D:\\ALP - Agile Learning Perú\\Cursos\\Proyectos\\appiummodulo2\\src\\test\\resources\\apk\\VodQA.apk");
//            capabilities.setCapability("appPackage","com.vodqareactnative");
//            capabilities.setCapability("appActivity","com.vodqareactnative.MainActivity");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            capabilities.setCapability("chromedriverExecutable", "D:\\ALP - Agile Learning Perú\\Cursos\\Proyectos\\appiummodulo2\\src\\test\\resources\\driver\\chromedriver.exe");


            driverand = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        }else if (OS.equals("IOS")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 10");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            capabilities.setCapability(MobileCapabilityType.APP, "");

            driverios = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        }
    }

    @After
    public static void tearDown(){
        if (OS.equals("Android")){
            driverand.quit();
        }else if (OS.equals("IOS")){
            driverios.quit();
        }
    }
}

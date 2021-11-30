package utilities;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.mobilePages.LivingTabTemperature;

public class MobileActions extends CommonOps{


    @Step("click")
    public static void click(WebElement element){
        element.click();
    }

    @Step("move to element")
    public static void moveToElement(WebElement element) {
       touch.tap(new TapOptions().withElement(ElementOption.element(LivingTabTemperature.getTempBtn()))).perform();
    }
}

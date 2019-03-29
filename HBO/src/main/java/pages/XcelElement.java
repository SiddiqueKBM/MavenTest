package pages;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.util.List;
//import reporting.TestLogger;

public class XcelElement extends CommonAPI {
    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public static WebElement getXcelElement;
    public void getXcelElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getXcelElement.click();
    }
}


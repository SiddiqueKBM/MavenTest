package keyworddriven;
import base.CommonAPI;
import base.Home;
import base.LoginPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import utilities.XlsReader;
import java.io.IOException;

public class Features extends CommonAPI {
    XlsReader objExcelFileReader;
    Home objHomePage;
    LoginPage objLoginPage;
    public void applianceItems() {
        objHomePage = PageFactory.initElements(driver, Home.class);
        objHomePage.homeServices();
        System.out.println("Appliance test pass");
    }
    public void bathroomItems() throws InterruptedException {
        objHomePage = PageFactory.initElements(driver, Home.class);
        objHomePage.storeFinder();
        System.out.println("Bathroom test pass");
    }
    public void invalidEmail() {
        objLoginPage = PageFactory.initElements(driver, LoginPage.class);
        objHomePage = PageFactory.initElements(driver, Home.class);
        objHomePage.goToLoginPage();
        objLoginPage.enterInvalidEmail();
        System.out.println("InvalidEmail test pass");
    }
    public void select(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "applianceItems":
                applianceItems();
                break;
            case "bathroomItems":
                bathroomItems();
                break;
            case "invalidEmail":
                invalidEmail();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
}


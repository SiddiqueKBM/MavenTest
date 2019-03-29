package pages;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {
    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public static WebElement searchlink;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement searchBox;
    @FindBy(xpath = "//ul[@class='components/Search--searchHelp']/li[.='Search for series or movie titles, people, or characters']")
    public static WebElement velidation;
    public void clicksearchlink(){
        searchlink.click();
    }
    public void textVerification() throws InterruptedException {
        Thread.sleep(3000);
        String verifyText=velidation.getText();
        if (verifyText.equalsIgnoreCase("Search for series or movie titles, people, or characters")){
            System.out.println("Sign In is displayed");
        }
        else System.out.println("Sign In is not displayed");
    }
    public void sendInput(){
        searchBox.sendKeys("Game of Throne");
    }

}

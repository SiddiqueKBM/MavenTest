package Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;

public class TestSearchPage extends SearchPage {
    SearchPage searchPage;
    @BeforeMethod
    public void initializeElement(){
        searchPage = PageFactory.initElements(driver,SearchPage.class);
    }
    @Test
    public void linkClick(){
        searchPage.clicksearchlink();
    }
    @Test
    public void textVelidation() throws InterruptedException {
        searchPage.clicksearchlink();
        searchPage.textVerification();
    }
    @Test
    public void searchTVShow() throws InterruptedException {
        searchPage.clicksearchlink();
        searchPage.sendInput();
        Thread.sleep(2000);
    }
}

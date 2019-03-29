package Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends HomePage{
    HomePage homepage;
    @BeforeMethod
    public void initializeElement(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void testLogo(){ homepage.clickLebel(); }
    @Test
    public void linkClick(){
        homepage.clicksearchlink();
    }
    @Test
    public void searchTVShow() throws InterruptedException {
        homepage.clicksearchlink();
        homepage.sendInput();Thread.sleep(2000); }
    @Test
    public void searchForSeries(){homepage.FindSeries();}
    @Test
    public void hboMovies(){homepage.FindMovies();}
    @Test
    public void newsFWslide(){homepage.rightSlide();}
    @Test
    public void newsFW_BKslide(){homepage.leftSlide();}
    @Test
    public void hboImageVerification() throws InterruptedException {homepage.imageVerification();}
    @Test
    public void playTrailer(){homepage.playVideo();}
    @Test
    public void controlVideo() throws InterruptedException {homepage.playVideo1();}
    @Test
    public void getHBO(){homepage.getService();}
    @Test
    public void followInFacebook(){homepage.followLink(); }
    @Test
    public void g0HBOService(){homepage.getService(); }
    @Test
    public void searchForSerie(){homepage.FindSeries();}
    @Test
    public void hboMovie(){homepage.FindMovies();}
    @Test
    public void newFWslide(){homepage.rightSlide();}
    @Test
    public void newFW_BKslide(){homepage.leftSlide();}
    @Test
    public void hboImageVerifications() throws InterruptedException {homepage.imageVerification();}
    @Test
    public void playTrailers(){homepage.playVideo();}
    @Test
    public void controlVideos() throws InterruptedException {homepage.playVideo1();}
    @Test
    public void gettHBO(){homepage.getService();}
    @Test
    public void followingInFacebook(){homepage.followLink(); }
    @Test
    public void getHBOService(){homepage.getService(); }
}

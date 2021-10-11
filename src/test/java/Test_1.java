import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_1 {

    @Test
    public void testFirst() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Allita\\IdeaProjects\\chromedriver.exe";
        String url = "https://www.cuddledown.com/";
        String expectedResult = "https://www.cuddledown.com/";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

        driver.close();
        driver.quit();



    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class browsertest {

    public static void main(String [] args){
        String projectpath = System.getProperty("user.dir");

        System.out.println("path is"+ projectpath);

        System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();



      driver.get("https://www.youtube.com/watch?v=nCJoia7wosc&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=1&t=59s");
    }
}

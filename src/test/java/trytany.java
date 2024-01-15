import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trytany {

    public static void main(String[]args){


        WebDriverManager.chromedriver() .setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=8vWTgyoG0nc&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=6");
        driver.close();
        driver.quit();
    }
}

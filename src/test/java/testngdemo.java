import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
    static WebDriver driver = new ChromeDriver();
@BeforeTest
public static void setup(){String projectpath = System.getProperty("user.dir");

    System.out.println("path is"+ projectpath);

    System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
    }


@Test

public static void test(){
    driver.get("https://google.com");
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys("abc");
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.RETURN);
}
@AfterTest

public static void teardown(){

    driver.close();
    System.out.println("Done");
}

}

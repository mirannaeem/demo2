package POMpackage;
import POMpackage.elementsmethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testmethods {

    private static WebDriver driver = null;

    public static void main(String args[]){
        googlesearch();


    }

    public static void googlesearch(){

        String projectpath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //enter test in searchtextbox
        elementsmethods.searchtextbox(driver).sendKeys("abc");

        //Press on search buttoon
        elementsmethods.searchbutton(driver).sendKeys(Keys.RETURN);

        System.out.println("Done");
    }
}

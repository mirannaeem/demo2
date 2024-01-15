package POMpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementsmethods {

    private static WebElement element = null;
    public static WebElement searchtextbox(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));

    return element;
    }

    public static WebElement searchbutton(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
return element;
    }
}

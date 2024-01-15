package POMimpl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class objectpage {
    WebDriver driver= null;
    By searchtextbox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea");
    By searchbutton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    public objectpage(WebDriver driver){
        this.driver = driver;

    }
    public void settxtsearchbox (String text){
        driver.findElement(searchtextbox).sendKeys(text);
    }
    public void clickSearchbutton(){
        driver.findElement(searchbutton).sendKeys(Keys.RETURN);
    }
}


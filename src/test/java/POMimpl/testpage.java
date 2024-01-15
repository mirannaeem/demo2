package POMimpl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpage {
    public static void main(String args[]){
googlesearch();


    }

    public static void googlesearch(){
        String projectpath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        objectpage obj = new objectpage(driver);
        obj.settxtsearchbox("abc");
        obj.clickSearchbutton();

    }

}


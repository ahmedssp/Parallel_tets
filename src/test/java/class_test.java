import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class class_test {
    protected WebDriver d;
    protected WebDriverWait w;
    @BeforeMethod
    public void Sutup(){
        System.out.println("WE are in before method");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        d=new ChromeDriver(getChromeOptions());
//        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        d.get("https://google.com");}
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return options;}
    @AfterMethod
    public void Qiut() throws InterruptedException {
        System.out.println("WE are in After method");
        d.close();}
    @Test
    public void M_TC1_1(){System.out.println("M_TC1_1");}
    @Test
    public void M_TC1_2() {System.out.println("M_TC1_2");}
    @Test
    public void M_TC1_3 () {System.out.println("M_TC1_3");}
}

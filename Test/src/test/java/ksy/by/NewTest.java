package ksy.by;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



 public class NewTest  {
     static WebDriver driver;

     @BeforeMethod
     public void openBrowser(){
         System.setProperty("webdriver.chrome.driver", "D://New folder//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.tut.by/");
     }

    @Test
    public void openMail(){

        WebElement Entrance = driver.findElement(By.className("enter"));
        Entrance.click();
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        login.sendKeys("qaqaTest");
        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("11111111");
        WebElement buttonEntrance = driver.findElement(By.cssSelector(".button.auth__enter"));
        buttonEntrance.click();
        WebElement userMail = driver.findElement(By.className("uname"));
        userMail.click();
        WebElement mailOfUser = driver.findElement(By.xpath("//a[contains(text(), 'Почта')]"));
        mailOfUser.click();
        WebElement checkMessages = driver.findElement(By.className("mail-NestedList-Item-Info-Link-Text"));
        System.out.println();
        System.out.println("Количество сообщений на почте :" + checkMessages.getText());

    }

    @AfterMethod
     public void closeBrowser(){
        driver.quit();
    }
}

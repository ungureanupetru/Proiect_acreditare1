import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
        public void validLoginTest(){
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://qa5.fasttrackit.org:8008/");

                driver.findElement(By.cssSelector("#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.login-woocommerce > a")).click();
                driver.findElement(By.id("username")).sendKeys("ungureanu.petru.alexandru@gmail.com");
                driver.findElement(By.id("password")).sendKeys("1234567890");
                driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > label")).click();
                driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();
                wait(2);
        }

        public static void wait(int seconds) {
                try {
                        Thread.sleep(seconds * 1000L);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

        }
}
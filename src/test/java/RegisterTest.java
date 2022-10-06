import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa5.fasttrackit.org:8008/");

        driver.findElement(By.cssSelector("#mastheads > div.top-header.clearfix > div > div.headertwo-wrap > div.login-woocommerce > a")).click();
        driver.findElement(By.id("reg_email")).sendKeys("ungureanu.petru.alexandru@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys(("1234567890"));
        driver.findElement(By.cssSelector("#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")).click();
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

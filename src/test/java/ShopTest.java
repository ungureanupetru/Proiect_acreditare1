import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopTest {
    public void validShopTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa5.fasttrackit.org:8008/");

        driver.findElement(By.id("menu-item-73")).click();
        driver.findElement(By.cssSelector("#primary > div > div.wc-products > ul > li.post-34.product.type-product.status-publish.has-post-thumbnail.product_cat-music.first.instock.downloadable.virtual.purchasable.product-type-simple > div.collection_desc.clearfix > div > a")).click();
        wait(2);

        driver.findElement(By.cssSelector("#primary > div > nav > ul > li:nth-child(2) > a")).click();
        wait(2);

        driver.findElement(By.cssSelector("#primary > div > div.wc-products > ul > li.post-32.product.type-product.status-publish.has-post-thumbnail.product_cat-tshirts.first.instock.shipping-taxable.purchasable.product-type-simple > div.collection_combine > div > div > div > a")).click();
        driver.findElement(By.cssSelector("#tab-title-additional_information > a")).click();
        wait(2);

        driver.findElement(By.cssSelector("#tab-title-reviews > a")).click();
        wait(2);

        driver.findElement(By.cssSelector("#commentform > div > p > span > a.star-5")).click();
        driver.findElement(By.id("comment")).sendKeys("Imi doream de foarte multa vreme acest produs, stiu ca este foarte calitativ din cauza ca l-am mai avut odata dar pe alta culoare");
        driver.findElement(By.id("author")).sendKeys("Ungureanu Petru-Alexandru");
        driver.findElement(By.id("email")).sendKeys("ungureanu.petru.alexandru@gmail.com");
        driver.findElement(By.cssSelector("#submit")).click();
        wait(5);

        driver.quit();
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
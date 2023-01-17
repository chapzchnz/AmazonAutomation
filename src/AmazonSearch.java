import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Go to the Amazon website
        driver.get("https://www.amazon.com/");

        // Find the search box element and enter a search term
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");

        // Find the search button element and click it
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Find the delivery to  latvia  and click it by xpath
        driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]")).click();




    }
}








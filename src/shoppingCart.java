import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shoppingCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[1]/div[3]/button[1]")).click();
Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[2]/div[3]/button[1]")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@class='products']/div[4]/div[3]/button[1]")).click();
driver.findElement(By.xpath("//div[4]/div[3]/button[1]")).click();
	}

}

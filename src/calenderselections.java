import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderselections {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXG']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight']")).click();
         driver.findElement(By.cssSelector(".ui-state-highlight")).click();
	}

}

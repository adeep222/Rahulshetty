import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicdropdown {

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
		//driver.findElement(By.xpath("//a[contains(text(),' Bagdogra (IXB)')]")).click();
		//driver.findElement(By.xpath("(//a[@value='IXG'])[2]")).click();
		//if you do not give index a message saying cannot scroll to view will be displayed
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXG']")).click();
	//above parent child relationship xpath - relative xpath (Not parent child travesal mechanism) is used to find the child. Without parent 2 matcing nodes are returned, but with parent reference the respective child is returned	
	}

}

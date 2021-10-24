import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class handlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		// get the text and display the alrt text
		String alerttext = driver.switchTo().alert().getText();
		Assert.assertEquals("Hello , share this practice page and share your knowledge", alerttext);
		System.out.println("The text displayed in the alert is : " + alerttext);
		driver.switchTo().alert().accept();
		// cancel the confirmation alert as below
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

}

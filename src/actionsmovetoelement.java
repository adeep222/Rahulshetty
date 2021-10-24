import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsmovetoelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	}

}

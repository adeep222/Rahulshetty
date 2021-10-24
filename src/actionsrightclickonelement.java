import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsrightclickonelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		
	//use the contextclick method to right click on an element
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
	}

}

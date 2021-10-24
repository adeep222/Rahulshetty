import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclickandentercaps {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("maps").build().perform();
//In case you want to perform the above action and also select the entered text
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("maps").doubleClick().perform();
	}

}

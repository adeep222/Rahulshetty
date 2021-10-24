import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class deleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).sendKeys("testing");
		//driver.findElement(By.cssSelector("[class='gNO89b']")).click();
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("maps").build().perform();
//In case you want to perform the above action and also select the entered text
		a.moveToElement(driver.findElement(By.cssSelector("[class='gLFyf gsfi']"))).sendKeys(Keys.ENTER).build().perform();
		//delete all cookies to make sure all the cache has been cleared/deleted. Also in case you want to chk if session ID is deleted the user should be logged out 
		//and then clicking on any link the user shd be redirected to login screen once session id is cleared
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("testing - Google Search");
		
	}

}

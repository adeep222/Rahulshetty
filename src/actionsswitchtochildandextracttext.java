import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsswitchtochildandextracttext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		//String emailid=driver.findElement(By.xpath("//a[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		//System.out.println(emailid);
		String emailid=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].split(" ")[1];		
	    //System.out.print(emailid);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}

}

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.classfile.Opcode.Set;

public class footerLinksClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println("The total links in the footer is: " +footer.findElements(By.tagName("li")).size());//concept of limiting the webdriver scope to identify the items in footer only
	/*Write a test to identify the links in a particular section in the footer  */
	WebElement columndriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println("The no of links in the first column is: "+columndriver.findElements(By.tagName("a")).size());
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	{
		String clickOnlink=Keys.chord(Keys.CONTROL,Keys.ENTER);//These are the Keyboard events
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnlink);
		//System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	}
java.util.Set<String> tabs=driver.getWindowHandles();
Iterator<String> it=tabs.iterator();
while(it.hasNext())
{
driver.switchTo().window(it.next());
System.out.println(driver.getTitle());
}
}
	}




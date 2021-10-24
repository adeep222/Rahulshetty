import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class footerLinkscount {

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
		columndriver.findElements(By.tagName("a")).get(i).click();
		driver.navigate().back();
		Thread.sleep(6000);
	}
	}

}

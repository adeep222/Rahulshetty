import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class tableGridsumupvalues {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			js.executeScript("document.querySelector('[class=tableFixHead]').scrollTop=5000");
			List<WebElement>allopts=driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']//tr/td[4]"));
			int sum=0;
for(int i=0;i<allopts.size();i++)
{
     sum=sum+Integer.parseInt(allopts.get(i).getText());
}
System.out.println("Ths sum of all the values in the table is: " +sum);
int expectedvalue=Integer.parseInt(driver.findElement(By.cssSelector("[class=totalAmount]")).getText().split(":")[1].trim());
Assert.assertEquals(sum, expectedvalue);

		}
		
	

}

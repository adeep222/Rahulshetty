
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderdaymonthselection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		//Thread.sleep(3000);
		/*The following code is used to select a month from the list of months */
		List<WebElement> months=driver.findElements(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		/*above since there are multiple elements identify the parent so that the element is looked only within that parent */
		int monthscount=months.size();
		System.out.println("The months count is" +monthscount);
		/*for(int i=0;i<monthscount;i++)
		{
			System.out.println(months.get(i).getText());
		}*/
		for(int i=0;i<monthscount;i++)
		{
			while(!months.get(i).getText().contains("September"))
			{
				driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			}
		} 
		
		/*while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}*/
		
		/* The following code is used to select a date from the list of dates */
		//driver.findElement(By.xpath("//td[@class='day'][contains(text(),'27')]")).click();
	List<WebElement> days=driver.findElements(By.cssSelector("td[class='day']"));
int dayscount=days.size();
for(int i=0;i<dayscount;i++)
{
	if(days.get(i).getText().equalsIgnoreCase("28"))
	{
		days.get(i).click();
	}
}


	}

}

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class allbrokenlinkswithassertion {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(int i=0;i<links.size();i++)
		{
			String url=links.get(i).getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("GET");
			conn.connect();//you make a call to the url and you get a response back
			int responsecode=conn.getResponseCode();
			if(responsecode>400)
			{
				System.out.println("The broken link is: "+url+ " and the response code is: " +responsecode);
				Assert.assertTrue(false);
				
			}
			if(responsecode<400)
			{
				System.out.println("The proper link is: "+url+ " and the response code is: " +responsecode);
				Assert.assertTrue(true);
			}
		
	}
	}

}

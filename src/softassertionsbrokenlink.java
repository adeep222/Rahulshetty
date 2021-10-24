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
import org.testng.asserts.SoftAssert;

public class softassertionsbrokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new  SoftAssert();//soft asserting. using this the script with continue with the test and will not stop

		for(int i=0;i<links.size();i++)
		{
			String url=links.get(i).getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("GET");
			conn.connect();//you make a call to the url and you get a response back
			int responsecode=conn.getResponseCode();
		System.out.println("The response code is " +responsecode);
			a.assertTrue(responsecode<400, "The link that is broken is : " +url+ " and the repsonse code is : " +responsecode);
			
		
	}
		a.assertAll();//if any failures are stored then assert all with fail ur script otherwise it will pass the script
	}

}

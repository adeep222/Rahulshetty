import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href"));
		String url =driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		//open connection method has to be called which is in URL class
		//the return type of the method id HttpURLconnection
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		//now make the request using Head http request type. Making a call to that URL using the Head request method
		conn.setRequestMethod("GET");
		conn.connect();//you make a call to the url and you get a response back
		int responsecode=conn.getResponseCode();
		System.out.println("The response Code is :" +responsecode);
		
	}

}

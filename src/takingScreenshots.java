import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class takingScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("seleniumPractise");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Now we shd get the screenshot to the desktop from the src, so use File Utils which has a method to copy the file from Src to local machine
		//FileUtils.copyFile(src, new File("C:\\downloads")); //do not create it in C drive as sometimes access will be denied. Admin permissions would be needed
		FileUtils.copyFile(src, new File("D:\\Selenium screenshots"));
	}

}

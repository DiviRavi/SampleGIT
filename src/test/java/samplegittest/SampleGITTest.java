package samplegittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleGITTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new FirefoxDriver();  // opens firefox browser; Webdriver is an interface
		wd.manage().window().maximize();     // to maximize the browser window
		wd.get("https://www.google.com/?gws_rd=ssl");   // search url in browser then copy and paste means redirected url address
		
			
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); //src is an object; typecasting b/w interface(TakesScreenshot); file is o/p import
		
		//to copy the screenshot; create a  screenshot folder for entire project
		FileUtils.copyFile(src, new File("C:\\seleniumworkspace\\WebDriverProj\\ScreenShot\\Google.jpg"));
	int i=1/1;
	}
	
		
}

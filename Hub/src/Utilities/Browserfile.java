
package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfile{
	
	public static WebDriver para;
	public static WebDriver Browserfact(String browsername,String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\selenium\\chromedriver.exe");
	para=new ChromeDriver();
	para.get(url);
	para.manage().window().maximize();
	return para;
	}
	
}
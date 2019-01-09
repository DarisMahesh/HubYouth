
package TestNGfile;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Codefile.Pagecode;
import TestDataengine.Testexcel;
import Utilities.Browserfile;




@Test
public class Testscript{
	
	ExtentReports report;//global variables
	ExtentTest logger; 
	
 public static WebDriver driver; 

@Test(dataProvider="Test",priority=0)
public void Login(String user1,String pass1) throws Exception {
	  report= new ExtentReports("C:\\Users\\ADMIN\\Documents\\selenium\\Reports\\youth.html");
	  logger=report.startTest("VerifyLogin"); 
	 Pagecode obj=PageFactory.initElements(driver, Pagecode.class);
	 obj.Signin(user1, pass1);
	 logger.log(LogStatus.INFO, "Login the application successfully");
}

@Test(priority=1)
public void course() throws InterruptedException {
	 
	logger=report.startTest("Explore Opened successfully");
	Pagecode obj=PageFactory.initElements(driver,Pagecode.class);
	WebElement element = driver.findElement (By.xpath ("//i[@class='fa fa-bars icn_bars']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript ("arguments[0].click();" , element);
	Thread.sleep(8000);
	obj.explore("primary");
	Thread.sleep(8000);
	//Select  salTitle =  new Select(driver.findElement(By.id("//*[@id=\"YH_explore_filter_form\"]/div/div/div[1]/div[1]/input")));
    //salTitle.selectByVisibleText("Videos");
	logger.log(LogStatus.INFO, "Explore checked successfully");
}

@Test(priority=2)
public void jobs() throws InterruptedException
{
	Pagecode obj = PageFactory.initElements(driver,Pagecode.class);
	obj.Fulltime("christmas");
	
}

@Test(priority=3)
public void Filter() throws InterruptedException, FindFailed
{
	logger=report.startTest("Started to check All Job Fields"); 
	//logger.log(LogStatus.INFO, "Started to check All Job Fields");
	Pagecode intry = PageFactory.initElements(driver, Pagecode.class);
	intry.findjobs();
	String winHandleBefore = driver.getWindowHandle();
	Screen screen=new Screen();
	Pattern close =new Pattern("C:\\Users\\ADMIN\\Documents\\Sikuli jars\\sikuli\\cancel.png");
	screen.click(close);
	screen.wait(close,5000);
	 driver.navigate().back();
	 Thread.sleep(8000);
	intry.Shiftjobs();
//JavascriptExecutor js = ((JavascriptExecutor) driver);
//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//js.executeScript("scroll(0, -250);");
((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
logger.log(LogStatus.INFO, "All Kind of Jobs displayed successfully");
logger.log(LogStatus.INFO, "Started to check  Get Direction & Recent Jobs");
intry.Recentjobs();
logger.log(LogStatus.INFO, "Get Direction successfully");

}




@BeforeClass
public void before() {
	  driver=Browserfile.Browserfact("chrome","http://demo1.youthhub.com");
	  }


@AfterMethod
public void afterMethod(ITestResult result) {
	  if (result.getStatus() == ITestResult.FAILURE) {
	  logger.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	  } else if (result.getStatus() == ITestResult.SKIP) {
	  logger.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	  } else {
	 logger.log(LogStatus.PASS, "Test passed");
	 report.endTest(logger);
	  }
}
	     
	  
	  @AfterTest
	  public void endReport()
	  {
	  report.flush();
	  report.close();
	  }

@DataProvider
public Object[][] Test(){
   Testexcel RR = new Testexcel("C:\\Users\\ADMIN\\eclipse-workspace\\Hub\\src\\Testdata\\Test.xlsx");	
   int rows = RR.getrowcount(0);
   Object  [][] data = new Object [rows][2];
   for(int i=0;i<rows;i++)
   {
  	 data[i][0] = RR.getData(0,i,0);
  	 data[i][1] = RR.getData(0,i,1);		 
  	 } 
   return data;
}


}






















































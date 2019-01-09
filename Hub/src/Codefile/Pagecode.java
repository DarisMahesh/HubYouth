
package Codefile;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Pagecode{
	
	WebDriver para;
static Logger log =  Logger.getLogger(Pagecode.class.getName());
	
	{ 
		PropertyConfigurator.configure("C:\\Users\\ADMIN\\eclipse-workspace\\Hub\\src\\Log4j\\Log4j.properties");
	}

	public static WebDriver driver;
	public Pagecode (WebDriver ipara)
	{
	this.para =ipara;
	}
	@FindBy(name="identity") WebElement id;
	@FindBy(name="password") WebElement pss;
	@FindBy(xpath="//button[text()='Login' and @type='submit' and @class='btn login_btn d-sm-none d-none d-lg-inline-block']") WebElement lg;
	@FindBy(xpath="//a[contains(@href,'http://demo2.tradezap.com/explore')]") WebElement exp;
    @FindBy(xpath="//input[@class='form-control input_box YB_explore_search search_name']") WebElement title;
    @FindBy(xpath="//select[@class='form-control input_box select_box search_project']") WebElement rat;
    @FindBy(xpath="//button[@class='btn_filter btn YB_explore_filter search_project']") WebElement filter;
    @FindBy(xpath="//button[@class='btn_filter btn YB_explore_filter search_project']") WebElement filt;
    @FindBy(xpath="//select[@class='form-control input_box select_box search_project']") WebElement rating;
    @FindBy(xpath="//a[@class='nav-link YB_tab']") WebElement myexp;
    @FindBy(xpath="//a[@class='mt-3 text-dark head-line' and @title='TestExplore']") WebElement text;
    @FindBy(xpath="//i[@class='fa fa-bars icn_bars']") WebElement menubar;
    @FindBy(xpath="//*[@id=\"mySidenav\"]/div/div/a[4]/div/div") WebElement part;
    @FindBy(xpath="//input[@class='form-control input_box YB_job_title_search']") WebElement filttitle;
    @FindBy(xpath=" //select[@class='form-control input_box select_box YB_indu_cate']") WebElement catagory;
    @FindBy(xpath="//button[@class='btn_filter btn YB_job_filter']") WebElement jobfilter;
    @FindBy(xpath="//select[@class='form-control input_box select_box YB_indu_subcate']") WebElement subcate;
    @FindBy(xpath="//select[@class='form-control input_box select_box YB_region']") WebElement jobregion;
    @FindBy(xpath="//select[@class='form-control input_box select_box YB_city']") WebElement city;
    @FindBy(xpath="//select[@name='job_salary_type']") WebElement salarytype;
    @FindBy(xpath="//select[@name='salary_from']") WebElement salaryfrm;
    @FindBy(xpath="//select[@name='salary_to']") WebElement salaryto;
    //@FindBy(xpath="//a[@class='nav-link show active']") WebElement active;
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[2]/div/a") WebElement Favourite; 
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[3]/div/a") WebElement time;
    @FindBy(xpath="//*[@id=\"YB_jobs_list_1\"]/div[1]/div/div[1]/div[1]/h6/a") WebElement indutry;
    @FindBy(xpath="//img[@src='http://images.youthhub.co.nz/profile/thumbnail/5bf2577b5639a1542608763.png']") WebElement health;
    @FindBy(xpath="//a[contains(@href,'http://demo1.youthhub.com/job') and @class='col-12 active']") WebElement view;
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[4]/div/a") WebElement party;
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[5]/div/a") WebElement contract;
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[6]/div/a") WebElement Voluntary;
    @FindBy(xpath="//*[@id=\"myCarousel\"]/ul/li[7]/div/a") WebElement Entrylevel;
    @FindBy(xpath="//a[contains(@href,'http://demo1.youthhub.com/job/9852365') and @class='job_name']") WebElement rec;
    @FindBy(xpath="//*[@id=\"filter\"]/div/div[2]/div[2]") WebElement recjob;
    @FindBy(xpath="//a[@class='text_theme float-right']") WebElement recback;
    @FindBy(xpath="//a[contains(@href,'http://demo1.youthhub.com/job/3152366') and @class='job_name']") WebElement lib;
    //@FindBy(xpath="//button[@class='btn_apply btn my-2 YB_applynow']") WebElement apply;
    @FindBy(xpath=" //a[@class='location_drtn float-right font-weight-normal YB_get_map']") WebElement getdirection;
    @FindBy(xpath="//label[@for='changemode-transit']") WebElement transit;
    @FindBy(xpath="//label[@for='changemode-walking']") WebElement walking;
    @FindBy(xpath="//*[@id=\"YB_job_direction\"]/div/div/div[1]/button") WebElement recclose;
    
     
 public void Signin(String user,String pass) {
	id.sendKeys(user);
	log.info("username sends successfully");
	pss.sendKeys(pass);
	log.info("password sends successfully");
	lg.click();
	log.info("application logins successfully");
	//exp.click();
	//log.info("Explore opened successfully");
}

public void explore(String search) throws InterruptedException
{
	exp.click();
	Thread.sleep(8000);
	title.click();
	Thread.sleep(8000);
	title.sendKeys(search);
	Thread.sleep(8000);
	title.clear();
	Thread.sleep(8000);
	rat.click();
	Thread.sleep(8000);
	 Select sortby = new Select(rat);
	 sortby.selectByIndex(1);
	 Thread.sleep(8000);  
	 filter.click();
	 Thread.sleep(8000);
	 Select sortby1 = new Select(rating);
	 sortby1.selectByIndex(0);
	 Thread.sleep(8000);
     //Select  salTitle =  new Select(driver.findElement(By.id("//input[@class='fstQueryInput fstQueryInputExpanded']")));
     //salTitle.selectByVisibleText("Videos");
	 myexp.click();
	 Thread.sleep(8000);
	 text.click();
	 Thread.sleep(8000);
	 
     
}

public void Fulltime(String txt) throws InterruptedException
{
	menubar.click();
	Thread.sleep(8000);
	part.click();
	Thread.sleep(8000);
	filttitle.sendKeys(txt);
	//Thread.sleep(8000);
	filttitle.clear();
	Select sortby2=new Select(catagory);
	sortby2.selectByIndex(7);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby3=new Select(subcate);
	sortby3.selectByIndex(3);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby4=new Select(jobregion);
	sortby4.selectByIndex(1);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby5=new Select(city);
	sortby5.selectByIndex(5);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby6=new Select(city);
	sortby6.selectByIndex(0);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby7=new Select(jobregion);
	sortby7.selectByIndex(0);
	jobregion.click();
	//Thread.sleep(8000);
	Select sortby8=new Select(subcate);
	sortby8.selectByIndex(0);
	//Thread.sleep(8000);
	Select sortby9=new Select(catagory);
	sortby9.selectByIndex(0);
	//Thread.sleep(8000);
	Select sortby10=new Select(salarytype);
	sortby10.selectByIndex(2);
	//Thread.sleep(8000);
	jobfilter.click();
	//Thread.sleep(8000);
	Select sortby11=new Select(salaryfrm);
	sortby11.selectByIndex(2);                        
	//Thread.sleep(8000);
	Select sortby12=new Select(salaryto);
	sortby12.selectByIndex(5);
	//Thread.sleep(8000);
	jobfilter.click();
	Select sortby13=new Select(salarytype);
	sortby13.selectByIndex(0);
	//Thread.sleep(8000);
	Select sortby14=new Select(salaryfrm);
	sortby14.selectByIndex(0);
	//Thread.sleep(8000);
	Select sortby15=new Select(salaryto);
	sortby15.selectByIndex(13);
	//Thread.sleep(8000);
	jobfilter.click();
	Thread.sleep(8000);
	
	
} 

public void findjobs() throws InterruptedException
{
	menubar.click();
	Thread.sleep(8000);
	part.click();
	Thread.sleep(8000);
	Favourite.click();
	Thread.sleep(8000);
	//active.click();
	time.click();
	Thread.sleep(8000);
	indutry.click();
	Thread.sleep(8000);
	health.click();
	Thread.sleep(8000);
	
		
}


public void jobc() throws FindFailed, InterruptedException {
	
	

}
 public void Shiftjobs() throws InterruptedException
 {
	
	   // view.click();
	//	Thread.sleep(8000);
		party.click();
		Thread.sleep(10000);
		contract.click();
		Thread.sleep(8000);
		Voluntary.click();
		Thread.sleep(8000);
		Entrylevel.click();
		Thread.sleep(8000);
 }

 public void Recentjobs() throws InterruptedException
 {
	 rec.click();
	 Thread.sleep(8000);
	 recjob.click();
	 Thread.sleep(8000);
	 recback.click();
	 Thread.sleep(8000);
	 lib.click();
	 Thread.sleep(8000);
	 getdirection.click();
	 Thread.sleep(8000);
	 transit.click();
	 Thread.sleep(8000);
	 walking.click();
	 Thread.sleep(8000);
	 recclose.click();
	 Thread.sleep(8000);
 }


	

}
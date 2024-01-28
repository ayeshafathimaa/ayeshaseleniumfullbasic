package AssigntDemoshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addproducttoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step1:Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	  //step2:validate demo web page is displayed or not
	    String loginPageTitle=driver.getTitle();
	    if(loginPageTitle.equals("Demo Web Shop"))
	    {
	    	System.out.println("demo web shop  page is displayed");
	    }
	    else
	    {
	    	System.out.println("Fail....");
	    
	    }
	    //step3:click on login
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	    //step4:verify login page is displayed
	    String bookspage1 = driver.getTitle();
	    if(bookspage1.equals("Demo Web Shop. Login")) {
	    	System.out.println("pass");
	    	
	    }
	    else {
	    	System.out.println("fail");
	    /
	    /
	    /
	    
	  //step4:click on digital download
	    driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
	    String pagetitle = driver.getTitle();
	    //step5:verify digital download page is displayed
	    if(pagetitle.equals("Demo Web Shop. Digital downloads")) 
	    {
	    	System.out.println("pass");
	    	
	    }
	    else 
	    {
	    	System.out.println("fail");
	    }
	    Thread.sleep(2000);
	    List<WebElement> allproductname = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement  productname:allproductname) {
			Thread.sleep(2000);
			productname.click();
				}
		
		 
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		List<WebElement> allproductname1 = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		/
		/
		/
		/
		
		
		
		
		for(WebElement  productname:allproductname1) {
			Thread.sleep(2000);
			productname.click();
				}
		 Thread.sleep(2000);		 
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		
		//step6:Performing logout
	    driver.findElement(By.xpath("//a[text()='Log out']")).click();
	    //step7:validate demo web page is displayed
	    String loginPageTitle2=driver.getTitle();
	    if(loginPageTitle2.equals("Demo Web Shop"))
	    {
	    	System.out.println("demo web shop  page is displayed");
	    }
	    else
	    {
	    	System.out.println("Fail....");
	     }

	}
}
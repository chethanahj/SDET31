import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionTest {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("realme phone");
		
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		
		//WebElement ele=  driver.findElement(By.xpath("//div[text()=\"realme C31 (Dark Green, 32 GB)\"]/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
		// String price =ele.getText();
		// System.out.println(price);
		List<WebElement> allPrice = driver .findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		    
		for(WebElement sortPrice : allPrice)
		{
		  String price =sortPrice.getText();		
		String p =price.substring(1);  
		System.out.println(p);
		//int value=Integer.parseInt(p);
		System.out.println(Integer.parseInt(p));
//		if(value>=5000 && value<=12000)
//		{
//			System.out.println(value);
//		}
		//if value>=10000 && value
		
		}
		 driver.close();  
		  
		//driver.findElement(By.xpath("//div[text()='realme c35 mobile']")).click();
		}
	
	
}

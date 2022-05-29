import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleCatch {

	public static void main(String[] args)throws Exception {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();


driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.icc-cricket.com/");
driver.findElement(By.linkText("ICC T20 World Cup")).click();

		
	}

}

package webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commondata.CommonData;

public class AddToCart {
	
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		CommonData cd = new CommonData();
		
		
		
		driver.get(cd.url21smarthome);
		
		driver.manage().window().maximize();;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__layout\"]/div/section/div[4]/div/div[1]/button/i")));
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div[4]/div/div[2]/div/form/div/div/div[1]/input")).sendKeys("xf49@njit.edu");
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div[4]/div/div[2]/div/form/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div[4]/div/div[2]/div/button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/footer/div[1]/div[3]/form/div/div/div[1]/input")).sendKeys("xf49@njit.edu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/footer/div[1]/div[3]/form/div/div/div/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div[4]/div/div[2]/div/button")).click();
		Thread.sleep(3000);
//		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[3]/section/div[2]/form/div/div[1]/div/div")));
//		Thread.sleep(3000);
//		dropdown.deselectByVisibleText("Euro Plug");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[3]/section/div[2]/form/div/div[2]/div/div/div/div/input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[3]/section/div[2]/form/div/div[2]/div/div/div/div/input")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[3]/section/div[2]/button/span")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/section[3]/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[1]/div[2]/form/div/div/div[1]/input")).sendKeys(cd.email);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[1]/div[1]/div/div/div[1]/input")).sendKeys("jj");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[1]/div[2]/div/div/div[1]/input")).sendKeys("watt");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("hello");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[3]/div/div/input")).sendKeys("hello");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[4]/div/div[1]/input")).sendKeys("hello");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[5]/div[3]/div/div/div[1]/input")).sendKeys("07029");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/section[2]/div/section/form/div[6]/div/div[1]/input")).sendKeys("9175621370");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[1]/div/input")).sendKeys("save10");
		
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[1]/button")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/footer/button")).click();
		
		
		
	}

}

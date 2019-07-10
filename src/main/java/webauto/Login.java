package webauto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commondata.CommonData;
import commondata.LoginData;

public class Login {
	
	public void test() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		LoginData ld = new LoginData();
		
		List<String> urlList = new ArrayList<String>();
		
		urlList.add(ld.urlLoginDhohoo);
		urlList.add(ld.urlLoginYeahBra);
		urlList.add(ld.urlLoginBlendPlus);
		urlList.add(ld.urlLoginKiperLine);
		urlList.add(ld.urlLoginAbeatis);
		//urlList.add(ld.urlLogin21Smarthome);
		urlList.add(ld.urlLoginWiseho);
		urlList.add(ld.urlLoginWessme);
		
		for(String urllist:urlList) {
			
		driver.get(urllist);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/section/section/div/form/div[1]/div/div/input")).sendKeys("fengxuming1992@outlook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/section/section/div/form/div[2]/div/div/input")).sendKeys("123456789");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/section/section/div/form/button")).click();
		Thread.sleep(3000);
		

		}
	}

}
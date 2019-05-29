package webauto;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commondata.CommonData;
import commondata.ForgetPasswordData;

public class ForgetPassword {
	
	public void test() throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	CommonData CD = new CommonData();
	ForgetPasswordData FPD = new ForgetPasswordData();
	
	List<String> urlList = new ArrayList<String>();
	
	urlList.add(FPD.urlForgetPasswordDhohoo);
	urlList.add(FPD.urlForgetPasswordYeahBra);
	urlList.add(FPD.urlForgetPasswordBlendPlus);
	urlList.add(FPD.urlForgetPasswordKiperLine);
	
	for(String urllist : urlList) {
		
		driver.get(urllist);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/section/div/form/div/div/div[1]/input")).sendKeys(CD.email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/section/div/form/button")).click();
		Thread.sleep(3000);
		
	}
	

	

	}
	
	
	
}

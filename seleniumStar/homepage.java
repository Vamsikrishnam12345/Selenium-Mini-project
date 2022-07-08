package seleniumStar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		 String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		d.get("file:///C:/Practice/project/star%20book%20store/index.html");
		Thread.sleep(2000);
		d.close();
//		driver.findElement(By.tagName("a")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("Cart")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Books")).click();



			
	}

}
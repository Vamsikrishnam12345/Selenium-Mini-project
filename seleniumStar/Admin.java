package seleniumStar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		 String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		  d.get("file:///C:/Practice/project/star%20book%20store/Admin.html");
		  d.findElement(By.id("user")).sendKeys("admin");
		  Thread.sleep(2000);
		  d.findElement(By.id("pwd")).sendKeys("admin");
		  Thread.sleep(2000);
		  d.findElement(By.className("btn")).click();
		  Thread.sleep(2000);
		  Alert adminalert=d.switchTo().alert();
		  adminalert.accept();
		  Thread.sleep(2000);
		  d.close();
	}

}

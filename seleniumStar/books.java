package seleniumStar;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class books {

	public static void main(String[] args) throws InterruptedException {
		 String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		  d.get("file:///C:/Practice/project/star%20book%20store/books.html");
		  d.findElement(By.id("a2c")).click();
		  d.findElement(By.id("qty")).clear();
		  d.findElement(By.id("qty")).sendKeys("2");
		  Thread.sleep(2000);
		  d.findElement(By.id("a2c1")).click();
		 Thread.sleep(2000);
		
		 Thread.sleep(2000);
		  d.findElement(By.id("purch")).click();
		  Thread.sleep(2000);
		  Alert balert=d.switchTo().alert();
		  balert.accept();
		  d.close();

	}

}

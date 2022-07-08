package seleniumStar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddBooks {

	public static void main(String[] args) throws InterruptedException {
		 String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		  d.get("file:///C:/Practice/project/star%20book%20store/addbooks.html");
		  d.findElement(By.id("bookname")).sendKeys("Clean Code");
		  d.findElement(By.id("price")).sendKeys("200");
		  Thread.sleep(2000);
		  d.findElement(By.id("img")).sendKeys("C:\\Practice\\project\\star book store");
		  Thread.sleep(2000);
		  d.findElement(By.id("add-btn")).click();
		  d.close();
				 

	}

}

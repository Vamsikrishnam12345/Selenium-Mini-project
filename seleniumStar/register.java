package seleniumStar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
public class register {
	
	public static void main(String[] args) throws InterruptedException {
		String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
        //d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("file:///C:/Practice/project/star%20book%20store/student.html");
		d.findElement(By.className("loginbtn")).click();
		d.findElement(By.className("toggle-btn2")).click();
		d.findElement(By.id("fname")).sendKeys("Vamsi");
		d.findElement(By.id("laname")).sendKeys("Krishna");
		d.findElement(By.id("email")).sendKeys("vamsispy988@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Vamsikrishna1");
		d.findElement(By.id("con")).sendKeys("Vamsikrishna1");
		d.findElement(By.id("gender1")).click();
		d.findElement(By.id("check")).click();
		WebElement selected= d.findElement(By.id("check"));
		boolean a= selected.isSelected();
	d.findElement(By.id("res")).click();	
	}
}
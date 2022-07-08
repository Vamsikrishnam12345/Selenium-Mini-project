package seleniumStar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userlogin {

	public static void main(String[] args) throws InterruptedException {
		String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path1);
		  WebDriver d=new ChromeDriver();
		d.get("file:///C:/Practice/project/star%20book%20store/student.html");
		d.findElement(By.className("loginbtn")).click();
		d.findElement(By.className("login-page"));
		d.findElement(By.className("toggle-btn1"));
        d.findElement(By.id("e-mail")).sendKeys("aisha23@gmail.com");
		d.findElement(By.id("pass-id")).sendKeys("Aishakhan23");
		d.findElement(By.className("check-box")).isSelected();
		d.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
	}

}
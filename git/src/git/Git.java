package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Git {
	@Test
	public void f() {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aishwarya Abishek\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("juki");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
      

}
}

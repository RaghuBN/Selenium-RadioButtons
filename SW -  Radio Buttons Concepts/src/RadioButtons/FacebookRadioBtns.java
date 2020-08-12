package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookRadioBtns {
	@Test
	public void TestRadioBtn() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
		Thread.sleep(5000);
		
		int radiobtn = driver.findElements(By.xpath("//input[@name='sex']")).size();
		System.out.println("Number Of Radio Buttons..... " + radiobtn );
        driver.quit();
	}
}
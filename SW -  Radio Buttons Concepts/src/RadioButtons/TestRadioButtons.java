package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRadioButtons {

	@Test
	public void RadioButtons() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/bnuft/Desktop/Selenium%20Radio%20Button.html");
        
        int a = driver.findElements(By.xpath("//input[@name='group1']")).size();  
        System.out.println(a);  
        
        for(int i=1;i<=a;i++)  
        {  
            driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();  
        }  
	}
}

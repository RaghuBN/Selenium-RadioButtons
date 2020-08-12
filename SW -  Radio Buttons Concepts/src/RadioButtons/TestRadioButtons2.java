/*Example:

    Create the FireFox instance and load the HTML form in the browser.
    Set the Webdriver implicit wait to 10 seconds.
    Get the total count of checkboxes and radio buttons.
    Select all of the checkboxes and radio buttons.
    Close the Firefox instance.
    
    */



package RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRadioButtons2 {
@Test
public void TestRadioBtn() throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("D:/LTI Selenium Samples/RadioButtons.html");
	// Set timeout value.
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Get the count of all available checkboxes.
    List<WebElement> list = driver.findElements(By.tagName("input"));

    // Below code will select all of the check boxes and radio buttons.
    for (int i = 0; i < list.size(); i++) {
       // Checking the check box
       if (list.get(i).getAttribute("type").trim()
             .equalsIgnoreCase("checkbox")) {

          // Show the Checkbox count with value.
          System.out.println("CheckBox = " + i + " "
                + list.get(i).getAttribute("value").trim());

          // Select the check box if not already selected.
          if (!(list.get(i).isSelected())) {
             list.get(i).click();
          } else {
             // De-select the check boxes.
             list.get(i).click();
          }
       } // Checking the Radio buttons.
       else if (list.get(i).getAttribute("type").trim()
             .equalsIgnoreCase("radio")) {

          // Show the size of radio buttons.
          System.out.println("Radio  = " + i + " "
                + list.get(i).getAttribute("value").trim());

          // Select the radio button if not already selected.
          if (!(list.get(i).isSelected())) {
             list.get(i).click();
          }
       }

       // Pause so that you can see the results.
       Thread.sleep(5000);
    }

    // close the FireFox browser instance.
    driver.close();
 }
}


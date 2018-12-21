package clm.maven.selenium.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RTCDemo {
	
	@Test
	public static void Test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\My_Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://clm.rat.itshost.se/ccm";
		driver.get(url);
		WebElement Logintitle = driver.findElement(By.className("jazz-team-server"));
		Assert.assertEquals(Logintitle,"jazz-team-server");
		//String Title = driver.getTitle();
		//driver.close();
		
	}

}

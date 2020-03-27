package azurePipeline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/kunal.ukande/git/SeleniumProject/DemoPerficientGDCFramework/lib/chromedriver.exe");

		driver = new ChromeDriver();

		/*
		 * Change in URL
		 */
		driver.get("https://my-web-app1.azurewebsites.net/mvn-hello-world/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void webelement() {
		/*
		 * CHange in h1 tag text
		 */
		String text = driver.findElement(By.xpath("//h1[text()='GO CORONA GO']")).getText();

		if (text.equalsIgnoreCase("GO CORONA GO")) {
			System.out.println(text);
		} else {
			System.out.println("h1 Tag Text is different");
		}

	}

	public void quitBrowser() {
		/*
		 * Browser close
		 */
		driver.quit();
	}

	public static void main(String[] args) {

		TestCase01 azure = new TestCase01();

		azure.openBrowser();

		azure.webelement();
		
		azure.quitBrowser();

	}

}

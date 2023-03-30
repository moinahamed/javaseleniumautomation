package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\javaseleniumautomation\\all_necessary_files\\chromedriver.exe");
		//open the browser
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\javaseleniumautomation\\all_necessary_files\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\javaseleniumautomation\\all_necessary_files\\IEDriverserver.exe");
//		WebDriver driver2 = new InternetExplorerDriver();
		// navigates to the web site
		driver.get("https://www.ecoders.in");
		// navigates to web address
		
		driver.navigate().to("https://ecoders.in");
		
		// get the title
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		Thread.sleep(2500);
		//page source
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		// sleep for 2 seconds
		Thread.sleep(2500);
		// close the browsers
		driver.quit();



	}

}

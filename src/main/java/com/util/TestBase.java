package com.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static  Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\prctice of java\\Selenium\\BDD_Cucmber_POM\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fis);
			}
		catch(IOException e) {
			e.getMessage();
		}
	}
	public static void init(){
		
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\frameworks\\Selenium Practice\\chromedriver_win32\\chromedriver79\\chromedriver.exe");
			driver= (WebDriver) new ChromeDriver();
		}
	
				else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","D:\\Softwares\\frameworks\\Selenium Practice\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=(WebDriver) new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD_TIME, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLISIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
}
	
	/*public void getScreenShot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileUtils.copyFile(src, dest);
		
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}*/

}
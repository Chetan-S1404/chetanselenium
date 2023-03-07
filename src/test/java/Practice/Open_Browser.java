package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {

	public static void browser() {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\chetan\\eclipse-workspace\\framework\\src\\main\\resources\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		//return back from GitHub
		//2nd Push from Local

	}

	

}

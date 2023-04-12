package seleniumGrid;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.beust.jcommander.Parameters;

public class Test1 {
public WebDriver driver;

@Parameters({"browser"})
@Test
public void demo(String browsername) {
	if(browsername.equals("chrome")) {
		driver=new ChromeDriver();
	}
	
	else 
	{
		driver=new FirefoxDriver();	
	}
}
}

package GoogleTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.library.base;

public class TestPage extends base{

	@Test
	public void testGoogle() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hello");
	}
}

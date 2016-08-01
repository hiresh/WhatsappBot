import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WhatsappScrapper {
	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		/*
		 * b = webdriver.Firefox() b.get('http://web.whatsapp.com') input() elem
		 * =
		 * b.find_element_by_xpath('//span[contains(text(),"Your friend name")]'
		 * ) elem.click() elem1 = b.find_elements_by_class_name('input') while
		 * True: elem1[1].send_keys('Your whatsapp is hacked')
		 * b.find_element_by_class_name('send-container').click()
		 */
		
		driver.navigate().to("http://web.whatsapp.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//gives the time to scan the qr code
		driver.findElement(By.xpath("//span[contains(text(),'Saahu!')]")).click();
		List<WebElement> list=driver.findElements(By.className("input"));
		while(true){
		list.get(1).sendKeys("you are coward and dumb, Loser");
		driver.findElement(By.className("send-container")).click();
		}
		
		
	}

}

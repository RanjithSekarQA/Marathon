package marathon;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSearch {

	public static void main(String[] args) {
		ChromeDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("https://www.redbus.in/");
		chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		chromeBrowser.manage().window().maximize();
		WebElement from = chromeBrowser.findElement(By.xpath("//input[@id='src']"));

		//from.click();
		from.sendKeys("chennai");
		chromeBrowser.findElement(By.xpath("//li[@class='selected']/i")).click();
		chromeBrowser.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		chromeBrowser.findElement(By.xpath("//li[@class='selected']/i")).click();
		chromeBrowser.findElement(By.xpath("//input[@id='onward_cal']"));
		chromeBrowser.findElement(By.xpath("//td[text()='17']")).click();
		chromeBrowser.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		//WebElement busCount = chromeBrowser.findElement(By.xpath("//span[contains(@class,'busFound')]"));
		WebElement busCount = chromeBrowser.findElement(By.xpath("//span[@class='f-bold busFound']"));
		
		String buses = busCount.getText();
		System.out.println("To no of buses found = " + buses);
		chromeBrowser.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		WebElement name = chromeBrowser.findElement(By.xpath("//div[@class='clearfix row-one']//div[@class='travels lh-24 f-bold d-color']"));
		String busName = name.getText();
		System.out.println("2nd Bus Name is : " + busName);
		
		String title =chromeBrowser.getTitle();
		System.out.println("Title of the page is : " + title);
		
		
		//chromeBrowser.close();
		
	}

}

package teckassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Y410P\\Desktop\\selenium-server-4.7.2\\chromedriver\\chromedriver.exe");
		WebDriver D=new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login.");
		
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Customer Login')]")).click(); //click button customer login
		Thread.sleep(500);
		WebElement element = D.findElement(By.xpath("//select [@id='userSelect']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Hermoine Granger"); //select in dropdown
		
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Login')]")).click(); //click button login
		
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Transaction')]")).click(); //click button transaction
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Reset')]")).click(); //Reset
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Back')]")).click(); //Back
		
		//credit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Deposit')]")).click(); //click button deposit
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("50000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//debit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click(); //click button withdraw
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("3000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//debit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click(); //click button withdraw
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("2000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//credit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Deposit')]")).click(); //click button deposit
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("5000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//debit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click(); //click button withdraw
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("10000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//debit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click(); //click button withdraw
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("15000"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		//credit
		Thread.sleep(500);
		D.findElement(By.xpath("//button[contains(text(),'Deposit')]")).click(); //click button deposit
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1500"); //input textbox
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Transaction')]")).click(); //click button transaction to check
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Back')]")).click(); //Back
		
		Thread.sleep(5000);
		D.close();
		
		
		
		
		
		
		
	}
}
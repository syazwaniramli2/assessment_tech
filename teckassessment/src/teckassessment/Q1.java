package teckassessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Y410P\\Desktop\\selenium-server-4.7.2\\chromedriver\\chromedriver.exe");//declaration  of Chrome  browser > chrome driver
		WebDriver D=new ChromeDriver();// declaration of driver
		D.manage().window().maximize();// max screen the browser
		D.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login.");// navigate to the URL
		Thread.sleep(1000); // buffering time set
		
		D.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();//login as Bank Manager Login
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();//click add customer
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Christopher");//fill in textbox 'First Name'
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Connely");//fill in textbox 'Last Name'
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");//fill in textbox 'post code'
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();//click button add customer
		Thread.sleep(500);
		
		Alert alert=D.switchTo().alert();
		alert.accept();//click ok for pop up
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Jackson");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Frank");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Frank");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Christopher");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("A897N450");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Christopher");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Minka");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("M098Q585");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Connely");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Jackson");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
				
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Minka");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Jackson");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("A897N450");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Jackson");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Connely");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Lawrence");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Zimmerman");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Mariotte");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Tova");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("L789C349");
		Thread.sleep(500);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(500);
		alert.accept();
		
		
		Thread.sleep(1000);
		D.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();//click button customers
		
		
	
		Thread.sleep(3000);
		
		D.findElement(By.xpath("//td[text()='Jackson']//following-sibling::td/button[text()='Delete']")).click();
		
		Thread.sleep(5000);
		
		D.findElement(By.xpath("//td[text()='Christopher']//following-sibling::td/button[text()='Delete']")).click();
		
		Thread.sleep(3000);
		
		D.close();
		
			
		
		
		
	}

}

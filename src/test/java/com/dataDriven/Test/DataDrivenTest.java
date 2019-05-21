package com.dataDriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GautamRaj\\Desktop\\PageObjectExtended(1)\\PageObjectExtended\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\GautamRaj\\Desktop\\PageObjectExtended(1)\\PageObjectExtended\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		int rows= reader.getRowCount("RegTestData");
		reader.addColumn("RegTestData", "Status");
		
		for(int i=2; i<=rows; i++) {
			
		String firstName = reader.getCellData("RegTestData", "firstname", i);
		System.out.println(firstName);
		String lastName = reader.getCellData("RegTestData", "lastname", i);
		System.out.println(lastName);
		String email = reader.getCellData("RegTestData", "email", i);
		System.out.println(email);
		String passWord = reader.getCellData("RegTestData", "password", i);
		System.out.println(passWord);
		System.out.println(reader.getRowCount("RegTestData"));
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("register")).click();
		
		//entering first name
		driver.findElement(By.xpath("//input[@id = 'firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id = 'lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id = 'PASSWORD']")).sendKeys(passWord);
		//driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

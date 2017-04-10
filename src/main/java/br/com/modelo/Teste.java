package br.com.modelo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Teste {
	
	public static void main(String[] args) {
		

		Teste teste = new Teste();
		teste.logar();
	}

	@BeforeClass
	public void logar(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/yamanuser/chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://app2.clarizen.com/Clarizen/Pages/Service/Login.aspx?ReturnUrl=%2fClarizen%2fTeamSpace%2fTimesheet");
		
		drive.findElement(By.id("txtLogin")).sendKeys("ronaldo.silva@yaman.com.br");
		drive.findElement(By.id("txtPassword")).sendKeys("wx0985a1986");
		drive.findElement(By.id("lbtLogin")).click();
	}
}

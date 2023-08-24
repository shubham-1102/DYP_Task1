package com.selenium.dyp;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class socialMedia {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hdhondge\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\hdhondge\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://saucelabs.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[11]/div[1]/div[2]/div[1]/div[3]/a/span/img"));
		Thread.sleep(3000);
		e.click();
		WebElement ef = driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/div/div/div/div[1]/button"));
		Thread.sleep(3000);
		ef.click();
}
}

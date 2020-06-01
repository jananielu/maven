package org.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void launch (String s) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\SampleMaven\\div\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(s);}
public static void ti() {
	String t = driver.getTitle();
	System.out.println(t);}
public static void fill(WebElement w,String s) {
	w.sendKeys(s);}
public static void kilk(WebElement w) {
	w.click();
}}
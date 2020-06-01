package org.adacting;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	 static WebDriver driver;
public static void launch(String s){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PattonAdmin\\eclipse-workspce selenium task\\SampleMaven\\div\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(s);}
public static void fill(WebElement w,String s){
	w.sendKeys(s);
}
public static void klick(WebElement w) {
	w.click();}
public static void select(WebElement w,String s) {
	Select a = new Select(w);
	 List<WebElement> all = a.getOptions();
	 for (int i=0;i<all.size();i++) {
		 WebElement each = all.get(i);
		 String name = each.getText();
	if(name.equals(s)) {
		a.selectByVisibleText(s);
		}}}
public static  String getvalue(WebElement w){
	
	String n = w.getAttribute("value");
	return n;
	
}
}



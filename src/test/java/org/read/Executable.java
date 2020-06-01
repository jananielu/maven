package org.read;

public class Executable extends BaseClass {
public static void main(String[] args) {
	launch("https://www.facebook.com/");
	driver.manage().window().maximize();
	LoginPage l = new LoginPage();
	fill(l.getUser(),"jananielumalai@gmail.com");
	fill(l.getPass(),"123456");
	kilk(l.getBtn().get(0));
	
}
}

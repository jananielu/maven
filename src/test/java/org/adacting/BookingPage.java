package org.adacting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
public BookingPage() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="first_name")
private WebElement fname;
@FindBy(id="last_name")
private WebElement lname;
@FindBy(id="address")
private WebElement add;
@FindBy(id="cc_num")
private WebElement creditnum;
@FindBy(id="cc_type")
private WebElement credittype;
@FindBy(id="cc_exp_month")
private WebElement exmnth;
@FindBy(id="cc_exp_year")
private WebElement exyear ;
@FindBy(id="cc_cvv")
private WebElement cvvnum;
@FindBy(id="book_now")
private WebElement bookbtn;
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCreditnum() {
	return creditnum;
}
public WebElement getCredittype() {
	return credittype;
}
public WebElement getExmnth() {
	return exmnth;
}
public WebElement getExyear() {
	return exyear;
}
public WebElement getCvvnum() {
	return cvvnum;
}
public WebElement getBookbtn() {
	return bookbtn;
}
}

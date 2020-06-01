package org.adacting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationPage extends BaseClass {
public ConformationPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="hotel_name")
private WebElement hname ;
@FindBy(id="location")
private WebElement locateid;
@FindBy(id="first_name")
private WebElement firsname ;
@FindBy(id="address")
private WebElement add;
public WebElement getHname() {
	return hname;
}
public WebElement getLocateid() {
	return locateid;
}
public WebElement getFirsname() {
	return firsname;
}
public WebElement getAdd() {
	return add;
}

}
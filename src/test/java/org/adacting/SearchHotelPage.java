package org.adacting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement locat;
	@FindBy(id="room_nos")
	private WebElement roomnum;
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	@FindBy(id="datepick_in")
	private WebElement checkoutdate;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="Submit")
	private WebElement searchbtn;
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getLocat() {
		return locat;
	}
	public WebElement getRoomnum() {
		return roomnum;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdult() {
		return adult;
	}
}

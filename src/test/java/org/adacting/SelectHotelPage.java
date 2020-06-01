package org.adacting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);}
	
		@FindBy(id="radiobutton_4")
		private WebElement radiobtn;
		@FindBy(id="continue")
		private WebElement cbtn;
		public WebElement getRadiobtn() {
			return radiobtn;
		}
		public WebElement getCbtn() {
			return cbtn;
		}
		
	}
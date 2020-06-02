package org.adacting;

public class AdactExecutable extends BaseClass {
	public static void main(String[] args) {
		launch ("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		AdactLogin a = new AdactLogin();
		fill(a.getUser(),"jananielumalai");
		fill(a.getPass(),"kirish8818");
		klick(a.getLogin().get(0));
		SearchHotelPage h = new SearchHotelPage();
		select(h.getLocat(),"Paris");
		select(h.getRoomnum(),"2 - Two");
		fill(h.getCheckindate(),"28/04/2020");
		fill(h.getCheckoutdate(),"29/04/2020");
		select(h.getAdult(),"3 - Three");
		klick(h.getSearchbtn());
        SelectHotelPage p =new SelectHotelPage();
		klick(p.getRadiobtn());
		klick(p.getCbtn());
	    BookingPage b = new BookingPage();
		fill(b.getFname(),"Janani");
		fill(b.getLname(),"Elumalai");
		fill(b.getAdd(),"no.14 NarayanaSwamy Street,Sholinganallur,Chennai.");
		fill(b.getCreditnum(),"8608306147228844");
		select(b.getCredittype(),"VISA");
		select(b.getExmnth(),"May");
		select(b.getExyear(),"2021");
		fill(b.getCvvnum(),"224");
		klick(b.getBookbtn());
		ConformationPage c = new ConformationPage();
		System.out.println("FirstName:"+getvalue(c.getFirsname()));
		System.out.println("Address:"+getvalue(c.getAdd()));
		System.out.println("lastName:"+getvalue(c.getHname()));
		System.out.println("CreditNumber:"+getvalue(c.getAdd()));

		
	}
}
package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Bookhotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel slh;
	private Bookhotel bh;

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		
	}

	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}

	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSlh() {
		slh=new SelectHotel(driver);
		return slh;
	}

	public Bookhotel getBh() {
		bh=new Bookhotel(driver);
		return bh;
	}

	
}

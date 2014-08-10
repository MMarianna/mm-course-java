package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {

	@Test
	public void deleteSomeContact() {
		app.getNavigationHelper().openMainPage();
		// first user's row = 2
		app.getContactHelper().gotoContactPage(2);
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToHomePage();
	}

}

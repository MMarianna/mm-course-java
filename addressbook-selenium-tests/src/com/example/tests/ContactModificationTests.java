package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		// first user's row = 2
		app.getContactHelper().gotoContactPage(2);
		ContactData contact = new ContactData();
		contact.firstName = "New name";
		app.getContactHelper().fillContactForm(contact);
		app.getNavigationHelper().submitModification(app);
		app.getContactHelper().returnToHomePage();
	}
}

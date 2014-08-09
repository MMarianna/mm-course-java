package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test
	public void testNonEmptyContactCreation() throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactCreation();
		ContactData contact = new ContactData();
		contact.firstName = "FirstName";
		contact.lastName = "LastName";
		contact.address = "Dnipropetrovsk";
		contact.homePhone = "+380562111111";
		contact.mobilePhone = "+380972222222";
		contact.workPhone = "+380563333333";
		contact.email = "test1@mail.ru";
		contact.email2 = "test2@gmail.com";
		contact.birthDay = "15";
		contact.birthMonth = "July";
		contact.birthYear = "1980";
		contact.groupName = "group 1";
		contact.address2 = "Address2";
		contact.phone2 = "+380562444444";
		app.getContactHelper().fillContactForm(contact);
		app.getNavigationHelper().submitCreation(app);
		app.getContactHelper().returnToHomePage();
	}

}

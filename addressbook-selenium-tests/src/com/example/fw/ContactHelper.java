package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.homePhone);
		type(By.name("mobile"), contact.mobilePhone);
		type(By.name("work"), contact.workPhone);
		type(By.name("email"), contact.email);
		type(By.name("email2"), contact.email2);
		selectByText(By.name("bday"), contact.birthDay);
		selectByText(By.name("bmonth"), contact.birthMonth);
		type(By.name("byear"), contact.birthYear);
		// selectByText(By.name("new_group"), contact.groupName);
		type(By.name("address2"), contact.address2);
		type(By.name("phone2"), contact.phone2);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void submitContactModification() {
		click(By.name("update"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

	// first user's row = 2
	public void gotoContactPage(int index) {
		click(By.xpath("//tr[" + (index + 2) + "]/td[7]/a"));
	}

	public void deleteContact() {
		click(By.xpath("//input[@value='Delete']"));
	}

	public List<ContactData> getContacts() {
		int startStringLength = "Select (".length();
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver
				.findElements(By.name("selected[]"));
		// fills contacts list
		for (WebElement checkbox : checkboxes) {
			ContactData contact = new ContactData();
			String title = checkbox.getAttribute("title");
			contact.firstName = title.substring(startStringLength,
					title.indexOf(" ", startStringLength));
			contact.lastName = title.substring(
					title.indexOf(" ", startStringLength) + 1, title.length()
							- ")".length());
			// adds created element into our list
			contacts.add(contact);

		}
		return contacts;
	}

}

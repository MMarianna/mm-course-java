package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public static boolean CREATION = true;
	public static boolean MODIFICATION = false;

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	private List<ContactData> cachedContacts;

	// -------Higher level methods---------//

	public List<ContactData> getContacts() {

		if (cachedContacts == null) {
			rebuildCache();
		}
		return cachedContacts;

	}

	private void rebuildCache() {
		cachedContacts = new ArrayList<ContactData>();
		List<WebElement> rows = driver.findElements(By
				.xpath("//table[@id='maintable']/tbody/tr[@name='entry']"));
		// fills contacts list
		for (WebElement row : rows) {
			String firstName = row.findElement(By.xpath(".//td[3]")).getText();
			String lastName = row.findElement(By.xpath(".//td[2]")).getText();
			// adds created element into our list
			cachedContacts.add(new ContactData().withFirstName(firstName)
					.withLastName(lastName));

		}
	}

	public ContactHelper createContact(ContactData contact) {
		initContactCreation();
		fillContactForm(contact, CREATION);
		submitContactCreation();
		returnToHomePage();
		rebuildCache();
		return this;
	}

	public ContactHelper modifyContact(int index, ContactData contact) {
		gotoContactPage(index);
		fillContactForm(contact, MODIFICATION);
		submitContactModification();
		returnToHomePage();
		rebuildCache();
		return this;
	}

	public ContactHelper deleteContact(int index) {
		gotoContactPage(index);
		submitContactDeletion();
		returnToHomePage();
		rebuildCache();
		return this;
	}

	// --------------------------------------------------------------------------------------

	public ContactHelper initContactCreation() {
		click(By.linkText("add new"));
		return this;
	}

	public ContactHelper fillContactForm(ContactData contact, boolean formType) {
		type(By.name("firstname"), contact.getFirstName());
		type(By.name("lastname"), contact.getLastName());
		type(By.name("address"), contact.getAddress());
		type(By.name("home"), contact.getHomePhone());
		type(By.name("mobile"), contact.getMobilePhone());
		type(By.name("work"), contact.getWorkPhone());
		type(By.name("email"), contact.getEmail());
		type(By.name("email2"), contact.getEmail2());
		selectByText(By.name("bday"), contact.getBirthDay());
		selectByText(By.name("bmonth"), contact.getBirthMonth());
		type(By.name("byear"), contact.getBirthYear());
		if (formType == CREATION) {
			selectByText(By.name("new_group"), contact.getGroupName());
		} else {
			if (driver.findElements(By.name("new_group")).size() != 0) {
				throw new Error(
						"Group selector exists in contact modification form");
			}
		}
		type(By.name("address2"), contact.getAddress2());
		type(By.name("phone2"), contact.getPhone2());
		return this;
	}

	public ContactHelper submitContactCreation() {
		click(By.name("submit"));
		cachedContacts = null;
		return this;
	}

	public ContactHelper submitContactModification() {
		click(By.name("update"));
		cachedContacts = null;
		return this;
	}

	public ContactHelper returnToHomePage() {
		click(By.linkText("home page"));
		return this;
	}

	// first user's row = 2
	public ContactHelper gotoContactPage(int index) {
		click(By.xpath("//tr[" + (index + 2) + "]/td[7]/a"));
		return this;
	}

	public void submitContactDeletion() {
		click(By.xpath("//input[@value='Delete']"));
		cachedContacts = null;
	}

}

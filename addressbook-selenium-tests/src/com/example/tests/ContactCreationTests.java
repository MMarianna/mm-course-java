package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test
	public void testNonEmptyContactCreation() throws Exception {
		openMainPage();
		initContactCreation();
		ContactData contact = new ContactData();
		contact.firstName = "FirstName";
		contact.lastName = "LastName";
		contact.address1 = "Dnipropetrovsk";
		contact.homePhone1 = "+380562111111";
		contact.mobilePhone = "+380972222222";
		contact.workPhone = "+380563333333";
		contact.email1 = "test1@mail.ru";
		contact.email2 = "test2@gmail.com";
		contact.bDay = "15";
		contact.bMonth = "July";
		contact.bYear = "1980";
		contact.groupName = "group 1";
		contact.address2 = "Address2";
		contact.homePhone2 = "+380562444444";
		fillContactForm(contact);
		submitCreation();
		returnToHomePage();
	}

	private void initContactCreation() {
		driver.findElement(By.linkText("add new")).click();
	}

	private void fillContactForm(ContactData contact) {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(contact.firstName);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(contact.lastName);
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys(contact.address1);
		driver.findElement(By.name("home")).clear();
		driver.findElement(By.name("home")).sendKeys(contact.homePhone1);
		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys(contact.mobilePhone);
		driver.findElement(By.name("work")).clear();
		driver.findElement(By.name("work")).sendKeys(contact.workPhone);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(contact.email1);
		driver.findElement(By.name("email2")).clear();
		driver.findElement(By.name("email2")).sendKeys(contact.email2);
		new Select(driver.findElement(By.name("bday")))
				.selectByVisibleText(contact.bDay);
		new Select(driver.findElement(By.name("bmonth")))
				.selectByVisibleText(contact.bMonth);
		driver.findElement(By.name("byear")).clear();
		driver.findElement(By.name("byear")).sendKeys(contact.bYear);
		new Select(driver.findElement(By.name("new_group")))
				.selectByVisibleText(contact.groupName);
		driver.findElement(By.name("address2")).clear();
		driver.findElement(By.name("address2")).sendKeys(contact.address2);
		driver.findElement(By.name("phone2")).clear();
		driver.findElement(By.name("phone2")).sendKeys(contact.homePhone2);
	}

	private void returnToHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

}

package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {

	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	}

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	}

	@DataProvider
	public Iterator<Object[]> randomValidGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		// fill list
		for (int i = 0; i < 5; i++) {
			GroupData group = new GroupData();
			group.name = generateRandomGroupString();
			group.header = generateRandomGroupString();
			group.footer = generateRandomGroupString();
			list.add(new Object[] { group });
		}
		return list.iterator();
	}

	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		// fill list
		for (int i = 0; i < 5; i++) {
			ContactData contact = new ContactData();
			contact.firstName = generateRandomContactString();
			contact.lastName = generateRandomContactString();
			contact.address = generateRandomContactString();
			contact.address2 = generateRandomContactString();
			contact.homePhone = generateRandomContactString();
			contact.phone2 = generateRandomContactString();
			contact.mobilePhone = generateRandomContactString();
			contact.workPhone = generateRandomContactString();
			contact.email = generateRandomContactString();
			contact.email2 = generateRandomContactString();
			contact.birthDay = "15";
			contact.birthMonth = "July";
			contact.birthYear = "1980";
			contact.groupName = "[none]";
			list.add(new Object[] { contact });
		}
		return list.iterator();
	}

	public String generateRandomString(int freq) {
		Random rnd = new Random();
		if (rnd.nextInt(freq) == 0) {
			return "";
		} else {
			return "test" + rnd.nextInt();
		}
	}

	public String generateRandomContactString() {
		return generateRandomString(10);
	}

	public String generateRandomGroupString() {
		return generateRandomString(3);
	}

}

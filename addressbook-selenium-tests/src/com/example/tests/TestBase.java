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
			GroupData group = new GroupData()
					.withName(generateRandomGroupString())
					.withHeader(generateRandomGroupString())
					.withFooter(generateRandomGroupString());
			list.add(new Object[] { group });
		}
		return list.iterator();
	}

	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		// fill list
		for (int i = 0; i < 5; i++) {
			ContactData contact = new ContactData()
					.withFirstName(generateRandomContactString())
					.withLastName(generateRandomContactString())
					.withAddress(generateRandomContactString())
					.withAddress2(generateRandomContactString())
					.withHomePhone(generateRandomContactString())
					.withPhone2(generateRandomContactString())
					.withMobilePhone(generateRandomContactString())
					.withWorkPhone(generateRandomContactString())
					.withEmail(generateRandomContactString())
					.withEmail2(generateRandomContactString())
					.withBirthDay("15").withBirthMonth("July")
					.withBirthYear("1980").withGroupName("[none]");
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

package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address1;
	public String address2;
	public String homePhone1;
	public String homePhone2;
	public String mobilePhone;
	public String workPhone;
	public String email1;
	public String email2;
	public String bDay;
	public String bMonth;
	public String bYear;
	public String groupName;

	public ContactData(String firstName, String lastName, String address1,
			String address2, String homePhone1, String homePhone2,
			String mobilePhone, String workPhone, String email1, String email2,
			String bDay, String bMonth, String bYear, String groupName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.address2 = address2;
		this.homePhone1 = homePhone1;
		this.homePhone2 = homePhone2;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.email1 = email1;
		this.email2 = email2;
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
		this.groupName = groupName;
	}

	public ContactData() {

	}
}
package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address;
	public String address2;
	public String homePhone;
	public String phone2;
	public String mobilePhone;
	public String workPhone;
	public String email;
	public String email2;
	public String birthDay;
	public String birthMonth;
	public String birthYear;
	public String groupName;

	public ContactData() {
	}

	public ContactData(String firstName, String lastName, String address,
			String address2, String homePhone, String phone2,
			String mobilePhone, String workPhone, String email, String email2,
			String birthDay, String birthMonth, String birthYear,
			String groupName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.address2 = address2;
		this.homePhone = homePhone;
		this.phone2 = phone2;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.email = email;
		this.email2 = email2;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.groupName = groupName;
	}
}
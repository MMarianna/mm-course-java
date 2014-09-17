package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	private String firstName;
	private String lastName;
	private String address;
	private String address2;
	private String homePhone;
	private String phone2;
	private String mobilePhone;
	private String workPhone;
	private String email;
	private String email2;
	private String birthDay;
	private String birthMonth;
	private String birthYear;
	private String groupName;

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

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return "ContactData [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", address2=" + address2
				+ ", homePhone=" + homePhone + ", phone2=" + phone2
				+ ", mobilePhone=" + mobilePhone + ", workPhone=" + workPhone
				+ ", email=" + email + ", email2=" + email2 + ", birthDay="
				+ birthDay + ", birthMonth=" + birthMonth + ", birthYear="
				+ birthYear + ", groupName=" + groupName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return (this.firstName + this.lastName).toLowerCase().compareTo(
				(other.firstName + other.lastName).toLowerCase());
	}

	public ContactData withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactData withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ContactData withAddress(String address) {
		this.address = address;
		return this;
	}

	public ContactData withAddress2(String address2) {
		this.address2 = address2;
		return this;
	}

	public ContactData withHomePhone(String homePhone) {
		this.homePhone = homePhone;
		return this;
	}

	public ContactData withPhone2(String phone2) {
		this.phone2 = phone2;
		return this;
	}

	public ContactData withMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
		return this;
	}

	public ContactData withWorkPhone(String workPhone) {
		this.workPhone = workPhone;
		return this;
	}

	public ContactData withEmail(String email) {
		this.email = email;
		return this;
	}

	public ContactData withEmail2(String email2) {
		this.email2 = email2;
		return this;
	}

	public ContactData withBirthDay(String birthDay) {
		this.birthDay = birthDay;
		return this;
	}

	public ContactData withBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
		return this;
	}

	public ContactData withBirthYear(String birthYear) {
		this.birthYear = birthYear;
		return this;
	}

	public ContactData withGroupName(String groupName) {
		this.groupName = groupName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getAddress2() {
		return address2;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getPhone2() {
		return phone2;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public String getEmail() {
		return email;
	}

	public String getEmail2() {
		return email2;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public String getGroupName() {
		return groupName;
	}

}
package com.example.tests;

public class ContactData implements Comparable<ContactData> {
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

}
package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

	@Test
	public void testNonEmptyGroupCreation() throws Exception {
		openMainPage();
		gotoGroupsPage();
		initGroupCreation();
		GroupData group = new GroupData();
		group.name = "name 1";
		group.header = "header 1";
		group.footer = "footer 1";
		fillGroupForm(group);
		submitGroupCreation();
		returnToGroupsPage();
	}

}

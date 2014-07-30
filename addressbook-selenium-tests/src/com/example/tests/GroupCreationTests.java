package com.example.tests;

import org.openqa.selenium.By;
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
		submitCreation();
		returnToGroupsPage();
	}

	private void gotoGroupsPage() {
		driver.findElement(By.linkText("groups")).click();
	}

	private void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	}

	private void fillGroupForm(GroupData group) {
		driver.findElement(By.name("group_name")).clear();
		driver.findElement(By.name("group_name")).sendKeys(group.name);
		driver.findElement(By.name("group_header")).clear();
		driver.findElement(By.name("group_header")).sendKeys(group.header);
		driver.findElement(By.name("group_footer")).clear();
		driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	}

	private void returnToGroupsPage() {
		driver.findElement(By.linkText("group page")).click();
	}

}

package com.kuda.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kuda.base.TestBase;

public class Login extends TestBase {
	@Test(description = "This TestCase will perform invalid login", priority = 1)
	public void invalidLogin() throws IOException, InterruptedException {
		//type email
		click("emailField_XPATH");
		type("emailField_XPATH","email");
		//type password
		click("passwordField_ID");
		type("passwordField_ID","password");
		//click login button
		click("loginBtn_XPATH");
		//Validate response message
		String actualMsg = getText("failedLoginMSg_XPATH");
		String expectedMsg = "Username or password is invalid";
		Assert.assertEquals(actualMsg, expectedMsg, "Incorrect Message is returned");
		
		
		 
		   
	}

}

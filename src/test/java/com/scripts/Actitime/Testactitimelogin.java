package com.scripts.Actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Actitime.BaseTest;
import com.pages.Actitime.POMActitimeLoginPage;

public class Testactitimelogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPage loginpage=new POMActitimeLoginPage(driver);
		loginpage.loginmethod();
		
	}

}

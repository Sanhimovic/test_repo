package test_scripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_class;
import generic.Generic_Excel;
import pom_scripts.Pom_loginFacebook;

public class TestScript_Login extends Base_class
{
	@Test
	public static void test() throws EncryptedDocumentException, IOException
	{
		String user = Generic_Excel.getData("Sheet1", 0, 0);
		String pass = Generic_Excel.getData("Sheet1", 1, 0);
		
		Pom_loginFacebook fb=new Pom_loginFacebook(driver);
		fb.username(user);
		fb.password(pass);
		fb.loginbtn();
		Assert.fail();
	}
}
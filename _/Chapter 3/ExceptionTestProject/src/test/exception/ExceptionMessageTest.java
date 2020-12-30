package test.exception;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionMessageTest {
	/**
	 * Verifies the exception message based on the exact error message thrown.
	 * @throws Exception
	 */
	@Test(expectedExceptions={IOException.class},expectedExceptionsMessageRegExp="Pass Message test")
	public void exceptionMsgTestOne() throws Exception{
		throw new IOException("Pass Message test");
	}
	
	/**
	 * Verifies the exception message using the regular exception.
	 * This test verifies that the exception message contains a test "Message" in it.
	 * @throws Exception
	 */	
	@Test(expectedExceptions={IOException.class},expectedExceptionsMessageRegExp=".* Message .*")
	public void exceptionMsgTestTwo() throws Exception{
		throw new IOException("Pass Message test");
	}
	
	/**
	 * Verifies the exception message based on the exact error message thrown.
	 * This is to show that TestNg fails a test when the exception message does not match.S
	 * @throws Exception
	 */	
	@Test(expectedExceptions={IOException.class},expectedExceptionsMessageRegExp="Pass Message test")
	public void exceptionMsgTestThree() throws Exception{
		throw new IOException("Fail Message test");
	}

}

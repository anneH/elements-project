/**
 * File Name: TC101.java<br>
 * Hesemann, Anne<br>
 * Created: Sep 6, 2017
 */
package com.sqa.ah.core;

import org.testng.annotations.*;

/**
 * TC101 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Hesemann, Anne
 * @version 1.0.0
 * @since 1.0
 */
public class TC101 extends AdactinTest {

	/**
	 * @param baseurl
	 */
	public TC101(String baseurl) {
		super("http://adactin.com/HotelApp");
		// TODO Auto-generated constructor stub
	}

	@Override
	@Test
	public void testAdactin() throws InterruptedException {
		Thread.sleep(10000);
	}
}

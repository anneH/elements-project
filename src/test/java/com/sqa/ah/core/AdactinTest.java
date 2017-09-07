/**
 * File Name: WSTest.java<br>
 * Hesemann, Anne<br>
 * Created: Sep 6, 2017
 */
package com.sqa.ah.core;

import org.testng.annotations.*;

/**
 * AdactinTest //ADDD (description of class)
 *
 * @author Hesemann, Anne
 * @version 1.0.0
 * @since 1.0
 */
public class AdactinTest extends BasicTest {

	/**
	 * @param baseurl
	 */
	public AdactinTest(String baseurl) {
		super("http://adactin.com/HotelApp");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testAdactin() throws InterruptedException {
		Thread.sleep(10000);
	}
}

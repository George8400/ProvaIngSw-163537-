package com.ingsw.MyListUtil;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	
	public static MyListUtil list;
	
	
	@BeforeClass
	public static void init() {
		list = new MyListUtil();
	}
	
	@Before
	public void printDateBeforeEachTest() {
		DateTime date = new DateTime();
		System.out.println("Data inizio test: " + date.getDayOfWeek() + "/" + date.getMonthOfYear() + "/" + date.getYear() + 
				"  Ora: " + date.getHourOfDay() + ":" + date.getMinuteOfHour() + ":" + date.getMillisOfSecond());
	}
	@After
	public void printDateAfterEachTest() {
		DateTime date = new DateTime();
		System.out.println("Data inizio test: " + date.getDayOfWeek() + "/" + date.getMonthOfYear() + "/" + date.getYear() + 
				"  Ora: " + date.getHourOfDay() + ":" + date.getMinuteOfHour() + ":" + date.getMillisOfSecond() + "\n");
	}
	
	
	@Test
	public void ordinaCrescenteWorks() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2,10,5,4,9,3));
		
		assertEquals(Arrays.asList(2,3,4,5,9,10), list.ordinaCrescente(numbers));

	}
	
	@Test
	public void ordinaDecrescenteWorks() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2,10,5,4,9,3));
		
		assertEquals(Arrays.asList(10,9,5,4,3,2), list.ordinaDecrescente(numbers));
		
	}
	
}

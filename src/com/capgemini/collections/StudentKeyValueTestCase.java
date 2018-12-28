package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class StudentKeyValueTestCase {
	private StudentKeyValue value1, value2, value3;

	@Before
	public void setUp() {
		value1 = new StudentKeyValue();
		value2 = new StudentKeyValue();
		value3 = new StudentKeyValue();
	}

	@Test
	public void checkingKeyValuePairs() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("harish", "mango");
		map.put("mahesh", "banana");
		map.put("ramesh", "apple");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey());
		}
	}
}

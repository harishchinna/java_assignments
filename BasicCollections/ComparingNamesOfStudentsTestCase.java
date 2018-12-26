package com.capgemini.collections;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

public class ComparingNamesOfStudentsTestCase {
	private Student student;

	@Before
	public void setUp() {
		student = new Student();

	}

	@Test
	public void displayingNamesInTheGivenOrder() {
		List<String> list = new ArrayList<String>();
		list.add("Harish");
		list.add("Puram");
		list.add("bhanu");
		list.add("zebra");
		list.add("akhil");
		Iterator<String> iterator = list.iterator();
		for (String name : list) {
			System.out.println(name);
		}

	}

}

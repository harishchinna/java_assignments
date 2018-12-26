package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestcaseForCollectionSchool {
	private School school1,school2,school3,school4;
	@Before
	public void setUp()
	{
		school1=new School("Kakatiya","Nandigama","Krishna",1);
		school2=new School("Kakatiya","Nandigama","Krishna",1);
		school3=new School("ST Ann's","Narasaraopet","Guntur",1);
		school4=new School("Kakatiya","Nandigama","Krishna",2);
	}

	@Test
	public void testCaseOneForCellPhones() {
		Set<Object> set = new HashSet<Object>();
		set.add(school1);
		set.add(school2);
		set.add(school3);
		set.add(school4);
		Iterator<Object> iterator = set.iterator();
		System.out.println("Set objects");
		for (Object o : set) {

			System.out.println(o + "\n");
		}
	}

	@Test
	public void displayingValuesOfCellPhones() {
		List<Object> list = new ArrayList<Object>();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		list.add(school4);
		Iterator<Object> iterator = list.listIterator();
		System.out.println("List objects");
		for (Object o : list) {
			System.out.println(o + "\n");
		}
	}
}

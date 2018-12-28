package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestCaseForCollectionTelevision {
	private Television tv1,tv2,tv3,tv4;
	@Before
	public void setUp()
	{
		tv1=new Television("sony","plasma",true,100000);
		tv2=new Television("Vu","plasma",false,60000);
		tv3=new Television("sony","plasma",true,90000);
		tv4=new Television("sony","plasma",false,100000);
	}

	@Test
	public void testCaseOneForCellPhones() {
		Set<Object> set = new HashSet<Object>();
		set.add(tv1);
		set.add(tv2);
		set.add(tv3);
		set.add(tv4);
		Iterator<Object> iterator = set.iterator();
		System.out.println("Set objects");
		for (Object o : set) {

			System.out.println(o + "\n");
		}
	}

	@Test
	public void displayingValuesOfCellPhones() {
		List<Object> list = new ArrayList<Object>();
		list.add(tv1);
		list.add(tv2);
		list.add(tv3);
		list.add(tv4);
		Iterator<Object> iterator = list.listIterator();
		System.out.println("List objects");
		for (Object o : list) {
			System.out.println(o + "\n");
		}
	}

}

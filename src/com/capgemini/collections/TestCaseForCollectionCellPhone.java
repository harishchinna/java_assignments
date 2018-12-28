package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestCaseForCollectionCellPhone {
	private CellPhone cell1,cell2,cell3,cell4;
	@Before
	public void setUp()
	{
		cell1=new CellPhone("MI","Note4","Nice Mobile","Marshmallow",10000);
		cell2=new CellPhone("Apple","IphoneX","Rich Mobile","IOS",100000);
		cell3=new CellPhone("MI","Note4","Nice Mobile","Marshmallow",13000);
		cell4=new CellPhone("MI","Note4","Cheap And Best","Marshmallow",10000);

	}

	@Test
	public void testCaseOneForCellPhones() {
		Set<Object> set = new HashSet<Object>();
		set.add(cell1);
		set.add(cell2);
		set.add(cell3);
		set.add(cell4);
		Iterator<Object> iterator = set.iterator();
		System.out.println("Set objects");
		for (Object o : set) {

			System.out.println(o + "\n");
		}
	}

	@Test
	public void displayingValuesOfCellPhones() {
		List<Object> list = new ArrayList<Object>();
		list.add(cell1);
		list.add(cell2);
		list.add(cell3);
		list.add(cell4);
		Iterator<Object> iterator = list.listIterator();
		System.out.println("List objects");
		for (Object o : list) {
			System.out.println(o + "\n");
		}
	}
}

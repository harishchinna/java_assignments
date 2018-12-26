package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class CheckingNamesInAscendingOrder {
	private StudentListInAscendingOrder student;
	@Before
	public void setUp()
	{
		student=new StudentListInAscendingOrder();
	}

	@Test
	public void displayingNamesInAscendingOrder() {
		TreeSet<String> set=new TreeSet<String>();
		set.add("harish");
		set.add("ram");
		set.add("prudhvi");
		set.add("naga");
		set.add("vamsi");
		set.add("hussain");
		//Iterator<String> list=set.iterator();
		for(String names : set)
		{
			System.out.println(names);
		}
	}

}

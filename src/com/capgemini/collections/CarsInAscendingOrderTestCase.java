package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarsInAscendingOrderTestCase {
	private CarsInAscendingOrder car1,car2,car3,car4;
	@Before
	public void setUp()
	{
		car1 = new CarsInAscendingOrder("Honda", "city", 2018, 1000000);
		car2 = new CarsInAscendingOrder("Skoda", "Rapid", 2017, 11000000);
		car3 = new CarsInAscendingOrder("Jaguar", "sv", 2019, 5000000);
		car4 = new CarsInAscendingOrder("Ferrari", "city", 2016, 800000);
	}

	@Test
	public void checkingInAscendingOrderTestCase() {
		List<CarsInAscendingOrder> list=new ArrayList<CarsInAscendingOrder>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		Collections.sort(list);
		for(CarsInAscendingOrder car : list)
		{
			System.out.println(car.getBrand()+"" );
		}
	}

}

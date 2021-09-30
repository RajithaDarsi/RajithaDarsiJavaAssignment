package com.broadride.Assignements4;

import java.util.Hashtable;
import java.util.Enumeration;
public class ViewOfKeysFromHashtable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();

		ht.put("Fruit", "Apple");

		ht.put("Vegetable", "Onions");

		ht.put("Flower", "Rose");

		Enumeration e = ht.keys();

		while (e.hasMoreElements()) {

		System.out.println(e.nextElement());
	}

}}

package com.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {
		//Creating a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		//Adding key, values to the HashMap
		map.put("Diganta", 14314);
		map.put("Anwesha", 17654);
		map.put("Anirban", 567823);
		map.put("Utsab", 85000);
		map.put("Sayan", 36980);
		map.put("Diganta", 15615);
		//printing the HashMap
		System.out.println("Printing the Map: "+map);
		
		//Retrieving the key and values
		String key = "Diganta";
		System.out.println("\nKey: " +key+ " Value: " +map.get(key) +"\n");
		
		/*
		 * Iteration over HasMap
		 */
		//Iterating over HashMap using for-each loop
		System.out.println("Iterating or looping map using java5 foreach loop");
		int index = 0;
		for(String mapKey : map.keySet()) {
			index++;
			System.out.println("Index: " +index+ ", Key: " +mapKey+ ", Value: " +map.get(mapKey));
		}
		
		//Iteration over HashMap using KeySetIterator
		System.out.println("\nIterating Map in Java using KeySet Iterator");
		Set<String> keySet = map.keySet();
		Iterator<String> keySetIterator  = map.keySet().iterator();
		while(keySetIterator.hasNext()) {
			String key1 = keySetIterator.next();
			System.out.println("Index: " +index+ ", Key: " +key1+ ", Value: " +map.get(key1));			
		}
		
		//Iteration over HashMap using EntrySet and for-each loop
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		System.out.println("\nIterating HashMap in Java using EntrySet and java5 for loop");
		for(Entry entry : entrySet) {
			System.out.println("Index: " +index+ ", Key: " +entry.getKey()+ ", Value: " +entry.getValue());
		}
		
	}

}

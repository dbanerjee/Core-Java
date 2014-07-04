package com.practice.serialization;

/* 
 * Serialization Demo 
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Diganta";
		p.city = "Kolkata";
		p.cmp.setCompanyName("Lexmark");
		try {
			//Open Stream
			FileOutputStream fout = new FileOutputStream("./data/person.txt");
			//Write to Stream
			ObjectOutputStream out = new ObjectOutputStream(fout);
			//Close Stream
			out.writeObject(p);
			out.close();
			fout.close();
			
		} catch( IOException e) {
			e.printStackTrace();
		}
	}
}

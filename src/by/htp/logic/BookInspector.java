package by.htp.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import by.htp.entity.Book;

public class BookInspector {
	public static ArrayList<Book> b;

	public static ArrayList<Book> initArrayListBook(ArrayList<Book> b) throws FileNotFoundException {

		String s;
		String[] str = new String[3];
		Scanner in = new Scanner(new File("books.txt"));
		Book mybook;
		while (in.hasNext()) {
			mybook = new Book();
			s = in.nextLine();
			str = s.split(" ", 3);
			mybook.setName(str[0]);
			mybook.setAuthor(str[1]);
			mybook.setAge(str[2]);
			b.add(mybook);
		}
		in.close();
		return b;
	}

	
	  public static void output(ArrayList<Book> b) { 
		 
		  for (Book x : b)
	  System.out.println(x.getName() + " " + x.getAuthor() + " " + x.getAge());
	  }
	

	public static void findBook(String s, ArrayList<Book> b) {
		
		for (Book x : b) {
			if (x.getName().equals(s)) {
				System.out.println(x.getName() + " " + x.getAuthor() + " " + x.getAge()); return;
			} else {
				System.out.println("нет такой книги ");
			}

		}

	}
}
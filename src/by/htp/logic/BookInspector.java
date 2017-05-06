package by.htp.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import by.htp.entity.Book;

public class BookInspector {

	public static ArrayList<Book> books = new ArrayList<Book>();

	public static void initArrayListBook() throws FileNotFoundException {

		String[] str = new String[3];
		Scanner in = new Scanner(new File("books.txt"));
		Book mybook;
		while (in.hasNext()) {
			mybook = new Book();
			str = in.nextLine().split(" ", 3);
			mybook.setName(str[0]);
			mybook.setAuthor(str[1]);
			mybook.setAge(str[2]);
			books.add(mybook);
		}
		in.close();

	}

	public static void printArrayBook() {

		for (Book x : books)
			System.out.println(x.getName() + " " + x.getAuthor() + " " + x.getAge());
	}

	
	public static void findBook(String s) {
		int i = 0;
		for (Book x : books) {
			if (x.getName().equals(s)) {
				System.out.println(x.getName() + " " + x.getAuthor() + " " + x.getAge());
				i++;
			}
		}
		if (i == 0)
			System.out.println("нет такой книги ");
	}



public static void sortByName() {
	Book temp;
	for (int i=0; i<books.size(); i++)
		for (int j=0; j<books.size()-1; j++) {
		if ( books.get(j).getName().compareTo (books.get(j+1).getName())>0)  {
			temp = books.get(j);
			books.set(j, books.get(j + 1));
			books.set((j + 1), temp);
		}
		}
			
	}
}


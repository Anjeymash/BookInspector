package by.htp.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import by.htp.entity.Book;


public class BookInspector {

	public static ArrayList<Book> books = new ArrayList<Book>();

	public static void initArrayListBook() throws FileNotFoundException {

		String[] str = new String[3];
		Scanner in = new Scanner(new File("books.txt"));
		Book mybook;
		while (in.hasNext()) {
			str = in.nextLine().split(" ", 3);
			mybook = new Book(str[0], str[1], str[2]);
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
		Collections.sort(books, new BookSortByTitle());
	}

}

class BookSortByTitle implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		String t1 = o1.getName();
		String t2 = o2.getName();

		return t1.compareTo(t2);
	}

}

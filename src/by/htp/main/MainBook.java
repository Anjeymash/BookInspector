package by.htp.main;


import java.io.FileNotFoundException;
import java.util.ArrayList;


import by.htp.entity.Book;
import by.htp.logic.BookInspector;

public class MainBook {
	  public static void main(String[] args) throws FileNotFoundException {
          ArrayList<Book> books = new ArrayList<Book>();
         BookInspector.initArrayListBook(books);
         //BookInspector.output(books);
         BookInspector.findBook("Java", books);
         }

        

}//

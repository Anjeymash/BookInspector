package by.htp.main;


import java.io.FileNotFoundException;


import by.htp.logic.BookInspector;

public class MainBook {
	  public static void main(String[] args) throws FileNotFoundException {
         System.out.println("\n Несортированный список книг ");
         BookInspector.initArrayListBook();
         BookInspector.printArrayBook();
         System.out.println("\n Поиск книги с названием Java");
         BookInspector.findBook("Java");
         System.out.println("\n Отсортированный список книг");
         BookInspector.sortByName();
         BookInspector.printArrayBook();
         }

     }

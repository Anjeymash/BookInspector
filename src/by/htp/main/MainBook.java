package by.htp.main;


import java.io.FileNotFoundException;


import by.htp.logic.BookInspector;

public class MainBook {
	  public static void main(String[] args) throws FileNotFoundException {
         System.out.println("\n ��������������� ������ ���� ");
         BookInspector.initArrayListBook();
         BookInspector.printArrayBook();
         System.out.println("\n ����� ����� � ��������� Java");
         BookInspector.findBook("Java");
         System.out.println("\n ��������������� ������ ����");
         BookInspector.sortByName();
         BookInspector.printArrayBook();
         }

     }

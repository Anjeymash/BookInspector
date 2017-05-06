package by.htp.entity;

public class Book {

	
	private String name;
	private String author;
	private String age;

	public Book(String name, String author, String age){
	        this. name = name;
	        this.author = author;
	        this.age = age;

	}
		
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}
//

}
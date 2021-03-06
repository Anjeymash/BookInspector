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

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
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
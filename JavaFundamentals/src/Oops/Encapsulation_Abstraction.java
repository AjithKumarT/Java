package Oops;

public class Encapsulation_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book b=new Book();
        Author author= new Author("Ajith", "ajith@gmail.com", 'M');
        b.setAuthor(author);
        b.setName("LifeOfPi");
        b.setPrice(300);
        b.setQty(11);
        System.out.println("details "+b.getName()+" " +b.getAuthor().getName()+" "+b.getAuthor().getEmail()+" "+b.getAuthor().getGender()+" "+b.getPrice()+" "+b.getQty());
	}

}
class Author{
	//Encapsulation
	private String  name;
	private String email;
	private char gender;
	Author(String name, String email, char gender){
		this.name= name;
		this.email= email;
		this.gender= gender;
	}
	//Abstraction
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
class Book{
	//Encapsulation
	private String name;
	private Author author;
	private double price;
	private int qty;
	//Abstraction
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}

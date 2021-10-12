/*
class Author{
    private String name;
    private String emailId;
    private char gender;

    public Author(String name , String emailId , char gender){
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }

    //Getter and Setter method for name 
	public String getName(){
		return this.name;
	}
	public void setName(String name ){
		this.name = name;
	}

	//Getter and Setter method for emailId
	public String getEmailId(){
		return this.emailId;
	}
	public void setEmailId(String emailId ){
		this.emailId = emailId;
	}

	//Getter and Setter method for gender
	public char getGender(){
		return this.gender;
	}
	public void setGender(char gender){
		this.gender = gender;
	}  
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int quantity;

	public Book(String name , Author author, double price , int quantity){
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	//displayAuthorDetails method returns void
	public void displayAuthorDetails(){
		System.out.println("Displaying author details");
		System.out.println("Author name: " + author.getName());
		System.out.println("Author email: " + author.getEmailId());
		System.out.println("Author gender: "+ author.getGender());
	}

	//Getter and Setter method for name
	public String getName(){
		return this.name;
	}
	public void setName(String name ){
		this.name = name;
	}

	//Getter and Setter method for author
	public Author getAuthor(){
		return this.author;
	}
	public void setAuthor(Author author){
		this.author = author;
	}

	//Getter and Setter method for price
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price = price;
	}

	//Getter and Setter method for quantity
	public int getQuantity(){
		return this.quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
}

class AggregationAssignment2{
	public static void main(String[] args) {
		// Declare Author object
		Author author1 = new Author("Joshua Bloch", "joshua@email.com", 'M');

		// Declare Book object
		Book book1 = new Book("Effective Java", author1, 45, 15);
		book1.displayAuthorDetails();
	}
}

*/

//commented code so that it wont have conflict with other assignments

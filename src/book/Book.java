package book;

public class Book {

	private String name;
	private String author;
	private String bookId;
	private double price;

	public Book(String name, String author, String bookId, double price) {
		super();
		this.name = name;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public String getBookId() {

		return bookId;
	}

	public void setBookId(String bookId) {
		String defaultBookId = "0123456789";
		
		if (bookId.length() != 10)
			this.bookId = defaultBookId;
		
		for(int i= 0; i < bookId.length(); i++) {
			if (!Character.isDigit(bookId.charAt(i))) {
				this.bookId = defaultBookId;
				return;
			}
		}
		this.bookId = bookId;
	}

	public void applyDiscount(double discountPercentage) {
		if (0 <= discountPercentage && discountPercentage <= 100)
			price = price - discountPercentage * price/100;
	}

    public String toString(){
        String res = "--------------------\n" +
                "Book name: " + this.getName() + "\n" +
                "Book author: " + this.getAuthor() + "\n" +
                "Book price: " + String.valueOf(this.getPrice()) + "\n" +
                "ISBN: " + this.getBookId() + "\n";
        return res;
}
	
}

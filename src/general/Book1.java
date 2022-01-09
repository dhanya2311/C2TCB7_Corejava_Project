package general;

public class Book1

{

	public String title;

	public String author;

	public int year;

	public String publisher;

	public int price;

	public Book1(String title, String author, int year, String publisher, int price)

	{
		this.title = title;

		this.author = author;

		this.year = year;

		this.publisher = publisher;

		this.price = price;

	}

	public void getTitle()
	
	{

		System.out.println("Title of Book: " + title);

	}

	public void getAuthor()

	{

		System.out.println("Author of Book: " + author);

	}

	public void getYear()

	{

		System.out.println("Year: " + year);

	}

	public void getPublisher()

	{

		System.out.println("Publisher of Book: " + publisher);

	}

	public void getPrice()

	{

		System.out.println("Price of Book: " + price);

	}

	public void setTitle(String title)

	{

		this.title = title;

	}

	public void setAuthor(String author)

	{

		this.author = author;

	}

	public void setYear(int year)

	{

		this.year = year;

	}

	public void setPublisher(String publisher)

	{

		this.publisher = publisher;

	}

	public void setCost(int price)

	{

		this.price = price;

	}

	public void show()

	{

		getTitle();

		getAuthor();

		getYear();

		getPublisher();

		getPrice();

	}

}
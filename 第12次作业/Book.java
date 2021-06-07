package 第12次作业;

public class Book{
	private String BookNumber;
	private String BookName;
	private double BookPrice;
	private String Publisher;
	
	public void setBook(String BookNumber,String BookName,double BookPrice,String Publisher) {
		this.BookNumber = BookNumber;
		this.BookName = BookName;
		this.BookPrice = BookPrice ;
		this.Publisher = Publisher;
	}
	public Book(String BookNumber,String BookName,double BookPrice,String Publisher) {
		this.BookNumber = BookNumber;
		this.BookName = BookName;
		this.BookPrice = BookPrice ;
		this.Publisher = Publisher;
	}
	
	public String getNum(){
		return BookNumber;
	}
	public String getNam(){
		return BookName;
	}
	public double getPri(){
		return BookPrice;
	}
	public String getPub(){
		return Publisher;
	}
}



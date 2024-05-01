package entity.exercise1;

public class News implements INews {
//	Properties
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rates;

//	Constructor

	public News() {

	}

	public News(String title, String publishDate, String author, String content, int[] rates) {
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.rates = rates;
	}

//	Method get, set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	// Method toString
	@Override
	public String toString() {
//		return "News [title=" + title + ", publishDate=" + publishDate + ", author=" + author
//				+ ", content=" + content + ", averageRate=" + averageRate + "]";
		System.out.printf("%-15s %-15s %-15s %-15s %15.2f%n", this.title, this.publishDate, this.author, this.content,
				this.averageRate);
		return null;
	}

//	Method Override INews
	@Override
	public void Display() {
		System.out.println("Titile: " + this.title);
		System.out.println("PublishDate: " + this.publishDate);
		System.out.println("Author: " + this.author);
		System.out.println("Content : " + this.content);
		System.out.println("AverageRate : " + this.averageRate);
	}

	@Override
	public float Calculate() {
		int sum = 0, count = 0;
		for (int i : this.rates) {
			sum += i;
			count++;
		}
		this.averageRate = (float) sum / count;
		return this.averageRate;
	}

}

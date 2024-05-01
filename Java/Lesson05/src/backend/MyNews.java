package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.exercise1.News;

public class MyNews {
	private List<News> newsList;

	public MyNews() {
		this.newsList = new ArrayList<>();
	}

	public void insertNews() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the news information");
		System.out.print("\tEnter title: ");
		String title = sc.nextLine();
		System.out.print("\tEnter publish date: ");
		String publishDate = sc.nextLine();
		System.out.print("\tEnter author: ");
		String author = sc.nextLine();
		System.out.print("\tEnter content: ");
		String content = sc.nextLine();
		System.out.println("Enter 3 reviews");
		System.out.print("\tEnter the first review: ");
		int firstReview = sc.nextInt();
		System.out.print("\tEnter the seconde review: ");
		int secondReview = sc.nextInt();
		System.out.print("\tEnter the third review: ");
		int thirdReview = sc.nextInt();
		int[] arrReview = { firstReview, secondReview, thirdReview };

		News news = new News(title, publishDate, author, content, arrReview);
		newsList.add(news);
		sc.close();
	}

	public void viewListNews() {
		System.out.printf("%-15s %-15s %-15s %-15s %15s%n", "Title", "Publish Date", "Author", "Content",
				"Average Rate");
		for (News n : newsList) {
//			System.out.println(n);
			n.toString();
		}
	}

	public void averageRate() {
		for (News n : newsList) {
			System.out.println("Average rate: " + n.Calculate());
		}
		this.viewListNews();
	}

	public void menu() {
		System.out.println("\n===================================My News==================================");
		String leftAlignFormat = "| %-72s |%n";
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format("|                               Please choose                               |%n");
		System.out.format("+--------------------------------------------------------------------------+%n");
		System.out.format(leftAlignFormat, "1. Insert news");
		System.out.format(leftAlignFormat, "2. View list news");
		System.out.format(leftAlignFormat, "3. Average rate");
		System.out.format(leftAlignFormat, "4. Exit");
		System.out.format("+--------------------------------------------------------------------------+%n");
	}
}

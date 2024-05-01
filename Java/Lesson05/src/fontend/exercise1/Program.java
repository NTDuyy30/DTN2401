package fontend.exercise1;

import java.util.Scanner;

import backend.MyNews;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyNews myNews = new MyNews();
		byte choice = -1;
		while (true) {
			myNews.menu();
			choice = sc.nextByte();
			switch (choice) {
			case 1:
				myNews.insertNews();
				break;
			case 2:
				myNews.viewListNews();
				break;
			case 3:
				myNews.averageRate();
				break;
			case 4:
				return;
			default:
				System.out.println("Mời bạn nhập lại trong khoảng 1 - 4");
			}
		}
	}
}

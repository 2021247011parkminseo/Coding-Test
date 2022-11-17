package CodingTest;

import java.util.Scanner;

public class No_1789 {
	// 시간 초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long sum = 0;
		int count = 0;
		for(int N = 1; ; N++) {
			sum += N;
			count++;
			if(sum > S) {
				break;
			}
		}
		System.out.println(count - 1);
	}
}
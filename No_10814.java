package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;

public class No_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		int length = Long.valueOf(Optional.ofNullable(N).orElse(0L)).intValue();
		String arr1[][] = new String[length][2];
		
		for(int i = 0; i < length; i++) {
			String input [] = br.readLine().split(" ");
			arr1[i][0] = input[0]; // 나이
			arr1[i][1] = input[1]; // 이름
		}
		
		Arrays.sort(arr1, new Comparator<String[]>() {
			@Override
			public int compare(String[] a1, String[] a2) {
				if(a1[0] == a2[0]) {
					return 1;
				}
				else {
					return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
				}
			}
		});
		
		for(int j = 0; j < length; j++) {
			System.out.println(arr1[j][0] + " " + arr1[j][1]);
		}
	}
}
package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_2810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String seat = br.readLine();
		char ch[] = seat.toCharArray();
		int cup_holder = 1; // 가장 앞 좌석의 컵 홀더
		
		if(ch.length > num || ch.length < num) {
			System.exit(1);
		}
		
		for(int i = 1; i < ch.length; i++) {
			if(ch[i - 1] == 'L' && ch[i] == 'L') {
				ch[i - 1] = 'l';
				for(int j = i; j < ch.length - 1; j++) {
					ch[j] = ch[j + 1];
				}
				ch[ch.length - 1] = '0';
			}
		}
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == '0') {
				break;
			}
			cup_holder++;
		}
		
		String ch2 = new String(ch);
		String arr2[] = ch2.split("");
		
		for(int i = 0; i < arr2.length; i++) {
			if(Arrays.asList(arr2).contains("l")) { // l이 배열 내에 들어있다면
				System.out.println(cup_holder);
				break;
			}
			else {
				System.out.println(cup_holder - 1);
				break;
			}
		}
	}
}

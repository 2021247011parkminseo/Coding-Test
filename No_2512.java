package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class No_2512 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		int length = Long.valueOf(Optional.ofNullable(num).orElse(0L)).intValue();
		// long형을 int형으로 변환
		long arr[] = new long[length];
		long sum = 0;
		long ans = 0;
		String input [] = br.readLine().split(" ");
		
		for(int i = 0; i < length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		
		long money = Long.parseLong(br.readLine());
		long start = 0;
		long end = arr[length - 1];
		
		while(start <= end) { // 이진 탐색
			long m = (start + end) / 2; // 내야할 세금 정함
			sum = 0;
			for(int j = 0; j < length; j++) {
				if(arr[j] > m) { // m보다 낼 돈이 많으면, m만큼의 돈만 냄
					sum += m;
				}
				else if(arr[j] <= m) { // m보다 낼 돈이 적거나 같으면, 갖고 있는 돈만큼 냄
					sum += arr[j];
				}
			}
			if(sum > money) { // 내야할 세금보다 총액이 더 많을 때
				end = m - 1; // end = m - 1로 하여 총액을 줄이도록함
			}
			else if(sum <= money) {
				start = m + 1; // start = m + 1로 하여 총액을 늘리도록함
				if(ans > m){ // 최대한도를 결정
                    continue;
                }
                else {
                    ans = m;
                }
			}
		}
		System.out.println(ans); // 반복문을 빠져 나오면 출력
	}
}
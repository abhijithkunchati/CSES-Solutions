import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		long n = Long.parseLong(s);
		s = br.readLine();
		String[] strarr= s.split(" ");
		long ans = 0;
		for(int i=1; i<n;i++)
		{  
			ans = ans ^ i ^ Long.parseLong(strarr[i-1]);
		}
		bw.write((ans^n)+" ");
		bw.flush();
		
	}
	
		
}




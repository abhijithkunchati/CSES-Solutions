import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int ans = 0;
		int temp = 0;
		char lastChar = ' ';
		for( int i=0; i<str.length();i++)
		{
		  char currChar = str.charAt(i);
		  if(lastChar == currChar) temp++;
		  else{
			temp = 1;
		  }
		  lastChar = currChar;
		  ans = Integer.max(ans, temp);
		}
		bw.write(ans+"");
		bw.flush();
		
	}
		
}




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
		int n = Integer.parseInt(str);
		String arr[] = br.readLine().split(" ");
		long ans = 0;
		int lastMin = -1;
		for(int i=0;i<n;i++)
		{
			int curr = Integer.parseInt(arr[i]);
			if(curr<lastMin)
			{
				ans+= (lastMin-curr);
			}
			lastMin = Integer.max(lastMin, curr);
		}
		bw.write(ans+"");
		bw.flush();
		
	}
		
}




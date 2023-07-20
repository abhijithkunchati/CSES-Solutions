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
		int k = n/2;
		int j = n/2+1;
		if(n==1)
		{	bw.write("1");
			bw.flush();
			return;
		}
		if(n<4){
			bw.write("NO SOLUTION");
			bw.flush();
			return;
		}
		int i = 1;
		while(i<=k||j<=n)
		{
			if(j<=n) bw.write(j+" ");
			if(i<=k) bw.write(i+" ");
			i++;
			j++;
		}
		bw.flush();
		
	}
		
}

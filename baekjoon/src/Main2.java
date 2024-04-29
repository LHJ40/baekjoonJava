import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main2 {
	public static void main(String args[]) throws IOException {
		ab a=new ab(1);
		ab b=new ab(1);
		a=b;
		a.n=2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		long q;
		int w=2147483647;
		q=(long)w+1;
		System.out.println(q);
		
	}
}
class ab{
	int n;
	
	
	
	public ab(int n) {
		super();
		this.n = n;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		ab ab=(ab)obj;
		return ab.n==this.n;
	}

	@Override
	public String toString() {
		return "ab [n=" + n + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Boj_1053 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String W=sc.nextLine();
		int n=W.length()/2;
		
		LinkedList<Character> a= new LinkedList<>();
		LinkedList<Character> b= new LinkedList<>();
		for(char i:W.substring(0, n).toCharArray()) {
			a.add(i);
		}
		for(char i:W.substring(W.length()-n, W.length()).toCharArray()) {
			b.push(i);
		}
		System.out.println(a);
		System.out.println(b);
		
		
	}

}

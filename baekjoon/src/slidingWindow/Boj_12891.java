package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_12891 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int S=Integer.parseInt(st.nextToken());
		int P=Integer.parseInt(st.nextToken());
		int check=0;
		int count=0;
		String DNA=br.readLine();
		st=new StringTokenizer(br.readLine());
		Map<Character, int[]> map=new HashMap<Character, int[]>(4){{
			put('A',new int[2]);
			put('C', new int[2]);
			put('G', new int[2]);
			put('T', new int[2]);
		}};
		map.get('A')[0]=Integer.parseInt(st.nextToken());
		map.get('C')[0]=Integer.parseInt(st.nextToken());
		map.get('G')[0]=Integer.parseInt(st.nextToken());
		map.get('T')[0]=Integer.parseInt(st.nextToken());
		
		Queue<Character> queue=new ArrayDeque<Character>();
		
		for(int i=0; i<P; i++) {
			queue.add(DNA.charAt(i));						
			if(map.containsKey(DNA.charAt(i))) {
				map.get(DNA.charAt(i))[1]++;
			}
		}
		for( Character key:map.keySet()){
			if(map.get(key)[0]<=map.get(key)[1]) {				
				check++;
			}
			}
		if (check==4) {count++;}
	
		
		for(int i=P; i<S; i++) {	
			char a=queue.poll();
			if(map.containsKey(a)) {
				map.get(a)[1]--;
			}
			queue.add(DNA.charAt(i));
			if(map.containsKey(DNA.charAt(i))) {
				map.get(DNA.charAt(i))[1]++;
			}
			check=0;
			for( Character key:map.keySet()){
				if(map.get(key)[0]<=map.get(key)[1]) {
					check++;
				}
				}
			if (check==4) {count++;}
		}
		
		System.out.println(count);

	}
}

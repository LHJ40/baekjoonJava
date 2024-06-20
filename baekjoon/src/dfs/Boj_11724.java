package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_11724 {
	static boolean visited[];
	static List<Integer> line[];
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		visited=new boolean[N+1];
		line=new ArrayList[N+1];
//		 -new ArrayList<Integer>[N+1];로 배열 만들 수 없는 이유-
//		 Java의 배열(제네릭과 달리)에는 런타임 시 해당 구성 요소 유형에 대한 정보가 포함되어 있기 때문입니다. 
//		 따라서 배열을 생성할 때 구성 요소 유형을 알아야 합니다. 
		
		for(int i=1; i<N+1; i++) {
			line[i]=new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st= new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			line[u].add(v);
			line[v].add(u);
			
		}
		int count=0;
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
		
		}
	static void dfs(int i) {
		if(visited[i])return;	
		visited[i]=true;
		
		for(int j:line[i]) {
			dfs(j);
		}
	}
}

package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178 {
	static int N;
	static int M;
	static int[] dx=new int[]{0,1,0,-1};
	static int[] dy=new int[]{1,0,-1,0};
	static int[][] maze;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		maze=new int[N][];
		
		for(int i=0; i<N; i++) {
			char[] chars=br.readLine().toCharArray();
			int[] ints=new int[M];
			Arrays.setAll(ints, x -> Character.getNumericValue(chars[x]));
			maze[i]=ints;
		}
		System.out.println(bfs(0,0,1));
		
	}
	static int bfs(int i, int j, int q) {
		Queue<int[]> queue=new LinkedList<>();
		queue.offer(new int[] {i,j,q});
		maze[i][j]=0;
		while(!queue.isEmpty()) {
			int now[]=queue.poll();
			
			for(int p=0; p<4; p++) {
				int x=now[0]+dx[p];
				int y=now[1]+dy[p];
				int z=now[2]+1;
				//now[2]++; (X) 증감연산자사용주의
				if(x==N-1&&y==M-1)return z;
				if(x>=0&&y>=0&&x<N&&y<M) {
					if(maze[x][y]==1) {
						maze[x][y]=0;
						queue.offer(new int[] {x,y,z});
					}
				}
			}
		}
		return 1;
		
	}

}

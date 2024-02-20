import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	 
	static boolean end;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		backtrack(arr,0);
				
	}
	static void backtrack(int[][] arr, int idx) {
		if (idx==81) {
			end=true;
			StringBuilder sb= new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			return;
			}
		int row=idx/9;
		int column=idx%9;
		if(arr[row][column]!=0) {
			backtrack(arr,idx+1);
		}else {
			for(int i=1; i<=9; i++) {
				arr[row][column]=i;
				if(isValidSudoku(arr,row,column)) {
					backtrack(arr,idx+1);
					if(end)return;
				}
			}
			arr[row][column]=0;
		}
		
	}
 
	static boolean isValidSudoku(int[][] arr, int row, int column) {
		for(int i=0; i<9; i++) {
			if(i==column)continue;
			if(arr[row][i]==arr[row][column])return false;	

		}
		for(int i=0; i<9; i++) {
			if(i==row)continue;		
			if(arr[i][column]==arr[row][column])return false;	
		}
		int start_row=row/3*3;
		int start_column=column/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(start_row+i==row&&start_column+j==column)continue;
				if(arr[start_row+i][start_column+j]==arr[row][column])return false;		
			}
		}
		return true;
 
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test1 {

    public void solution(int n){
        String[][] arr = new String[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = " ";
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[0][i] = "#";
        }

        int numberOfSharp = n-1;
        int y = 2;
        int x = 0;
        boolean flag = true;

        while(numberOfSharp > 0){

            if(flag){
                for(int i = 0; i < numberOfSharp; i++){
                    arr[n-x-1-i][n-x-1] = "#";
                    arr[n-x-1][n-x-1-(i+1)] = "#";
                }
                x += 2;
                flag = false;
            }else{
                for(int i = 0; i < numberOfSharp; i++){
                    arr[y+i][x-2] = "#";
                    arr[x][i+y-1] = "#";
                }
                y += 2;
                flag = true;
            }
            numberOfSharp -= 2;

        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        return;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        test1 mainClass = new test1();
        mainClass.solution(Integer.parseInt(input));
    }
}

public class RURottenTomatoes {
    public static void main(String args[] ){
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int arr[][] = new int [row][col];
        int k = 2;
        int sum = 0;
        int max = 0;
        int index = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                sum = sum + arr[j][i];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(index);

    }
    
}

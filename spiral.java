
class spiral_algo{
    
    int top;
    int bottom;
    int left;
    int right;
    

    
    spiral_algo(int value){
    top = 0;
    bottom = value-1;
    left = 0;
    right = value-1;  
    int direction = 0; // 0 = -> , 1 = V , 2 = <- , 3 = ^
    int number = 0;
    int[][] arr = new int[value][value];
    while ( top <= bottom && left <= right){
        
        if(direction == 0){
            for(int i = left; i <= right; i++){
                number++;
                arr[top][i] = number;}
            top++;
        }
        else if(direction == 1){
            for(int i = top; i <= bottom; i++){
            number++;
                arr[i][right] = number;}
            right--;
        }
        else if(direction == 2){
            for(int i = right; i >= left; i--){
            number++;
                arr[bottom][i] = number;}
            bottom--;
        }
        else if(direction == 3){
            for(int i = bottom; i >= top; i--){
            number++;
                arr[i][left] = number;}
            left++;
        }
        direction = (direction + 1)%4;  // change direction after each round
    }
    
        for(int j = 0; j < value; j++){
            for(int k =0 ; k < value; k++){
                System.out.printf("%4d",arr[j][k] );
    
            }
        System.out.println();

    }

}



}








public class spiral {
    public static void main(String[] args) {
        spiral_algo s = new spiral_algo(5);
        
    }
    
}
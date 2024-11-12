public class lab1{
    public static void main(String[] args) {
        int[] ar = {12, 45, 14, 13, 2, 45};
        int temp=ar[0];
        for(int i =1; i< ar.length;i++ ){
            if(ar[i]<=temp){
                temp = ar[i];

            }

        

        }
        System.out.println("Smallest element:"+temp);
    }
}

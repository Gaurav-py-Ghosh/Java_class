public class lab2 {
    public static void main(String[] args) {
        int[] ar={-2,4,-5,-8};
        int temp=ar[0];
        for(int i =1; i< ar.length;i++ ){
            if(ar[i]>=temp){
                temp = ar[i];

            }

        

        }
        System.out.println("Largest element:"+temp);
    }
    }
    


// 3. Check if an array is sorted or not
import java.util.*;
class third{
    public static void main(String[]args){
        int num[]={9,7,1,2,0,10};
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1])
                System.out.println("The array is not sorted");
                return;
        }
        System.out.println("The array is sorted");
    }
}
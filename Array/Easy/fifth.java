// 5. Reverse an array
import java.util.*;
class fifth {
    public static void main(String args[]){
         int num[]={9,7,1,2,0,10};
         Arrays.sort(num);
         System.out.println("The reversed array is ");
         for(int i=num.length-1;i>=0;i--){
             System.out.print(num[i]+" ");
         }
    }
}
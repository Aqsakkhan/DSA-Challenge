// 2. Find the second largest element
import java.util.*;
class second{
    public static void main(String[]args){
         int num[]={9,7,1,2,0,10};
         Arrays.sort(num);
         System.out.println("The second largest number is "+num[num.length-2]);
    }
}
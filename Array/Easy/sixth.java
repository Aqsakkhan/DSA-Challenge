// 6. Count frequency of elements in an array
import java.util.*;
class sixth{
    public static void main(String[] args) {
      int num[] = {2,3,5,5,9,10,11,11,12};
      int count = 1;

      for(int i = 1; i < num.length; i++){
          if(num[i] == num[i-1]){
          count++;
         } else {
        System.out.println("Frequency of " + num[i-1] + " is " + count);
        count = 1;
    }
}
System.out.println("Frequency of " + num[num.length - 1] + " is " + count);
        }
        
         
    }

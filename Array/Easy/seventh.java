// 7. Find the missing number (1 to N)
import java.util.*;
class seventh{
    public static void main(String args[]){
        int num[]={0,1,2,4};
        int n=num.length+1;
        int sum=(n*(n-1))/2;
        for(int i=0;i<num.length;i++){
            sum-=num[i];
        }
        System.out.println("The missing number is "+sum);
    }
}
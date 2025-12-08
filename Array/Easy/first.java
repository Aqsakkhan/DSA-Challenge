// 1. Find the largest element in an array
class first{
    public static void main(String[] args){
        int[] num={7,6,9,0,5};
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The largest number is "+max);
    
    }
}
public class _16EnhancedForLoop1 {


    public static void main(String[] args){
        int[] nums=new int[4];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=99;

//        // using Normal for loop
//
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i] +" ");
//        }

    // Using Enhance for Loop/ For Each  Loop

        for(int n:nums){
            System.out.print(n+" ");
        }


    }




}

//DAY 1
//the code gives an array with zeroes moved to last and the remaining are brought front 
//with the same order as the given array
import java.util.Scanner;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            else if(zeroes>0){
                int temp=nums[i];
                nums[i]=0;
                nums[i-zeroes]=temp;
            }
        }
    }
    public static void main(String args[]){
        MoveZeroes mz=new MoveZeroes();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        mz.moveZeroes(nums);
        System.out.println("The array after moving zeroes is :");
        for(int i=0;i<n;i++){
            System.out.println(nums[i]+" ");
        }
    }
}

import java.util.*;
public class ContainsDuplic217{
    public boolean ContainsDuplic217(int[] nums){

        HashSet<Integer> set =new HashSet<>();

        for( int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }


    public static void main(String args[]){
        ContainsDuplic217 sol =new ContainsDuplic217();
        int nums[] = { 1,1,2,3,4,5,1,2,3};
        System.out.println(sol.ContainsDuplic217(nums));
    }
}
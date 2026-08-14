import java.util.*;
public class UnionOfTwoArr {
    public static int[] unionArray(int[] nums1,int[] nums2){

        ArrayList<Integer> ans=new ArrayList<>();

        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size() - 1)!=nums1[i])ans.add(nums1[i]);
                i++;
            }
            else if(nums1[i] > nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size() - 1)!=nums2[j])ans.add(nums2[j]);
                j++;
            }
            else{
                if(ans.isEmpty() || ans.get(ans.size() - 1)!=nums1[i])ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        while(i < nums1.length){
            if(ans.isEmpty() || ans.get(ans.size() - 1)!=nums1[i])ans.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            if(ans.isEmpty() || ans.get(ans.size() - 1)!=nums2[j])ans.add(nums2[j]);
            j++;
        }
        return ans.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String args[]){
        int[] nums1={1,2,2,4};
        int[] nums2={2,3,4,5};

        int[] result=unionArray(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
// Problem URL: https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int i = 0,j = 0;
        for(int index = 0 ; index <nums1.length+nums2.length;index++) {
            if( i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])){
                mergedList.add(nums1[i]);
                i++;
            } else if(j < nums2.length) {
                mergedList.add(nums2[j]);
                j++;
            }
        }
        if(!mergedList.isEmpty()){
            Integer[] mergedArray = mergedList.toArray(new Integer[mergedList.size()]);
            System.out.println(mergedList);
            int mid = mergedArray.length/2;
            return (mergedArray.length %2 == 0)? (float)(mergedArray[mid] + mergedArray[mid-1])/2 : mergedArray[mid];
        }
        return 0;
    }
}
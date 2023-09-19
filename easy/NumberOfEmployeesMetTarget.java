// Problem URL: https://leetcode.com/problems/number-of-employees-who-met-the-target/

public class NumberOfEmployeesMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0;i<hours.length;i++){
            if(hours[i] >= target)
                count++;
        }
        return count;
    }
}

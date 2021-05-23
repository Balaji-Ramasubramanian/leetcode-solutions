// Problem URL: https://leetcode.com/problems/k-closest-points-to-origin/

// Algorithm:
/*
Step1: Find all the distances of the given pairs and store that in an array
Step2: Sort the distance array and find the kth element of the array (Which is the max allowed distance value of given points)
Step3: Return all the points which has less than or equal distance than the max allowed value
*/

class KClosestPointsToOrigin {
   public int[][] kClosest(int[][] points, int k) {
        int [] dist = new int[points.length];
        // Get all the distance of the given points
        for(int i =0;i<points.length;i++) {
            int x = points[i][0];
            int y = points[i][1];
            dist[i] = (x*x) + (y*y);
        }
        // Find the kth distance of the sorted array(Which is max allowed distance in given points)
        Arrays.sort(dist);
        int maxAllowedDist = dist[k-1];
        
        int[][] result = new int[k][2];
        int counter = 0;

        // Add the points which having less than or equal distance than the max allowed distance value
        for(int i=0; i<points.length && counter<k; i++){
            int x = points[i][0];
            int y = points[i][1];
            if(maxAllowedDist >= ((x*x) + (y*y))){
                result[counter][0] = x;
                result[counter][1] = y;
                counter++;
            }
        }
        return result;
    }
}
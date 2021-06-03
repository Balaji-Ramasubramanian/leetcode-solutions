// Problem URL: https://leetcode.com/problems/find-median-from-data-stream/

class MedianFinder {
     ArrayList<Integer> arr; int l;
        public MedianFinder() {
            arr  = new ArrayList<Integer>();
            l = 0;
        }

        public void addNum(int num) {
            if( l> 0 && arr.get(l-1) <= num) {
                arr.add(num);
            } else if(l>0){
                int i=0;
                for (i = l - 1; (i >= 0 && arr.get(i) > num); i--){
                    if(i== l-1) {
                        arr.add(arr.get(i));
                    } else {
                        arr.set(i+1, arr.get(i));
                    }
                }
                arr.set(i+1, num);
            } else {
                arr.add(num);
            }
            l++;
        }

        public double findMedian() {
            int m = l/2;
            if(l %2 ==0){
               return (double)(arr.get(m) + arr.get(m-1))/2;
            }
            return arr.get(m);
        }
}
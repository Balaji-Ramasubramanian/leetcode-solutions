// Problem URL: https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
class  MinimumFlips {
    public int minFlips(int a, int b, int c) {
        int result =0;
        for(int i =0;i<32;i++){ //check 32 bit int
            boolean x=false,y=false,z=false;
            if((c & (1<< i)) >0) z = true;
            if((b & (1<< i)) >0) y = true;
            if((a & (1<< i)) >0) x = true;
            if(z){
                    if(!( x||y)){
                    result +=1;
                }
            } else {
                if(x & y){
                    result +=2;
                } else if(x|y){
                    result +=1;
                }
            }
        }
        return result;
    }
}


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        //int len=0;
        int start=0, end=0;
        //int starts=S.length()-1;
       // int ends=S.length()-1;
       int m=0;
       int n=0;
       int diffmax=0;
        for(int i=0; i<S.length();i++){
        int len1= Findpal(S, i, i+1);
        int len2= Findpal(S, i, i);
        int len= Math.max(len1, len2);
        if(end-start<len){
            start=i-(len-1)/2;
            end= i+len/2;
            if(len==1){
                 start=0;
                end=0;
            }
            int diff=end-start;
            if(diff>diffmax){
                diffmax=diff;
                m=start;
                n=end;
            }
            //if(starts<start&& ends<end){
              //  starts=start;
                //ends=end;
           // }
            //System.out.println(start+ " "+ end );
        }
        }
        return S.substring(m, n+1);

    }
       static int Findpal(String S, int i, int j){
            while(i>=0 && j<S.length()&& S.charAt(i)==S.charAt(j)){
                i--;
                j++;
            }
            return (j-i-1);
        }
  

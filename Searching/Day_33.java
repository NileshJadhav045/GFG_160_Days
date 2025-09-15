import java.util.Arrays;

public class Day_33 {
    public static int aggressiveCows(int[] stalls, int k) {
    
        Arrays.sort(stalls);
        
        int res=0;
        
        int lo=1;
        int hi=stalls[stalls.length-1] - stalls[0];
        
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(check(stalls, k, mid)){
                res = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        
        return res;
    }
    
    static boolean check(int arr[], int k, int dist){
        int count=1;
        int prev = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]-prev>=dist){
                prev = arr[i];
                count++;
            }
        }
        
        return count>=k;
    }
    public static void main(String[] args) {
        int stalls[] = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));    
    }
}
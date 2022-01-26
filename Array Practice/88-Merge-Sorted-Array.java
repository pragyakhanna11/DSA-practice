class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int j = 0, i=0, k=0;
        while(i<m &&j<n){
            if(nums1[i]>nums2[j]){
                arr[k] = nums2[j];
                j++;
                k++;
            }else{
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }if(i<m){
            while(i<m){
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }else if(j<n){
            while(j<n){
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }else{
            // arr[k] = i>j?nums2[j]:nums1[i];
            if(i>j){
                while(j<n){
                arr[k] = nums2[j];
                j++;
                k++;
            }
            }else{
                while(i<m){
                  arr[k] = nums1[i];
                  i++;
                  k++;
              }
            }
        }
        for(int l = 0; l<m+n; l++){
            nums1[l] = arr[l];
        }
        return;
    }
}


//more optimised Solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p3 = m+n-1;
        
        
        while(p2>=0){
           
            if(p1>=0 && nums1[p1]>=nums2[p2]){
                nums1[p3]=nums1[p1];
                p3--;
                p1--;
            }else{
                nums1[p3]=nums2[p2];
                p3--;
                p2--;
            }
        } 
}
}

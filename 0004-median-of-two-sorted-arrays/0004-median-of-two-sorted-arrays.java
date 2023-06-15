class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            int[] temp =nums1;
            nums1=nums2;
            nums2=temp;
        }

        int lo=0;
        int hi=nums1.length;
        int te= nums1.length+nums2.length;

        while(lo<=hi){
            int aleft= (lo+hi)/2;
            int bleft= (te+1)/2-aleft;

            int alml= (aleft==0) ? Integer.MIN_VALUE : nums1[aleft-1];
            int al= (aleft==nums1.length) ? Integer.MAX_VALUE : nums1[aleft];
            int blml = (bleft==0) ? Integer.MIN_VALUE : nums2[bleft-1];
            int bl = (bleft == nums2.length) ? Integer.MAX_VALUE : nums2[bleft];

            if (alml<=bl && blml<=al){
                double median=0.0;

                if(te%2==0){
                    int lmax=Math.max(alml,blml);
                    int rmin= Math.min(al,bl);

                    median= (lmax+rmin)/2.0;
                }
                else{
                    int lmax=Math.max(alml,blml);
                    median= lmax;
                }

                return median;
            }

            else if(alml>bl){
                hi=aleft-1;
            }
            else if(blml>al){
                lo=aleft+1;
            }
        }
        return 0;

    }
}
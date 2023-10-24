class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                k++;
            }
        
        }
        Arrays.sort(arr, Collections.reverseOrder());


/*
for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=nums.length-1;j>=1;j--)
            {
                if(nums[j]>nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
*/


       
        return k;
    }
}






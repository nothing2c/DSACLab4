public class MyArray {

    public static int binSearch(int[] nums, int key)
    {
        int low = 0;
        int high = nums.length -1;
        return binSearchRecur(nums, key, low, high);
    }

    private static int binSearchRecur(int[] nums, int key, int low, int high)
    {
        if(low == high)
            return nums[low];

        else
        {
            int middle = (high - low) / 2;

            if(middle > key)
            {
                low = middle;
                binSearchRecur(nums, key, low, high);
            }

            else if(middle < key)
            {
                high = middle;
                binSearchRecur(nums, key, low, high);
            }

            if(middle == key)
            {
                return key;
            }

            else
                return -1;
        }
    }
}

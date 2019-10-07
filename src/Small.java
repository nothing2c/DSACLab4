public class Small {

    public static int findSmallest(int[] nums, int lastIndex)
    {
        return findSmallRecur(nums, lastIndex);
    }

    private static int findSmallRecur(int[] nums, int lastIndex)
    {
        if(lastIndex == 0)
            return nums[lastIndex];

        else
        {
            int smallest = findSmallRecur(nums, lastIndex - 1);

            if(smallest < nums[lastIndex])
            {
                return smallest;
            }
            else
                return nums[lastIndex];
        }
    }
}

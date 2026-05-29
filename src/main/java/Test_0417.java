public class Test_0417 {
    public static void main(String[] args) {
        int [] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};
        int max = nums[0];

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]>max) {
                max = nums[i];
            }
        }

        System.out.println("출력결과 :" + max + "입니다");
    }
}

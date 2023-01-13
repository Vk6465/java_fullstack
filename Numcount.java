class Numcount {
    public static void main(String[] args) {
      int[] nums = {1, 1, 2, 2, 3, 3, 3, 1, 1, 4, 4, 4};
      int n = nums.length;
      int curNum = nums[0];
      int len = 1;
      for(int i=1; i<n; i++){
          if(nums[i] == curNum){
              len++;
          }
          else{
              curNum = nums[i];
              System.out.println(len);
              len = 1;
          }
      }
      System.out.println(len);
      System.out.println("Done");
    }
}
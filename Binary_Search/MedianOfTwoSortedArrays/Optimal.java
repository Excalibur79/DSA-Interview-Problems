package Binary_Search.MedianOfTwoSortedArrays;

public class Optimal {

  public static void main(String[] args) {
    int nums1[] = { 1, 2 };
    int nums2[] = { 3, 4 };

    int n1 = nums1.length;
    int n2 = nums2.length;
    int low = 0;
    int high = n1; //because max cut is selecting no elements from arr1

    while (low <= high) {
      int cut1 = (low + high) / 2;
      int cut2 = (n1 + n2 + 1) / 2 - cut1;

      int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1]; //{1 3 4 | 7 10 12} this is cut1
      int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1]; // {2 | 3 6 15} this is cut2

      int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
      int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

      //checking the cross condition
      if (left1 <= right2 && left2 <= right1) {
        if ((n1 + n2) % 2 == 0) {
          System.out.println(
            Math.max(left1, left2) + " " + Math.min(right1, right2)
          );
          System.out.println(
            (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0
          );
          return;
        } else { //odd length total so only one median
          System.out.println(Math.max(left1, left2));
          return;
        }
      } else if (left1 > right2) {
        high = cut1 - 1;
      } else low = cut1 + 1;
    }
  }
}

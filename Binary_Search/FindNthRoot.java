package Binary_Search;

import java.io.*;

class Solution {

  static double eps = 1e-6;

  public static double multiply(double mid, int n) {
    double res = 1.0;
    for (int i = 1; i <= n; i++) res *= mid;
    return res;
  }

  public static double findNthRootOfM(int n, long val) {
    double l = 1, h = val;
    while ((h - l) > eps) {
      double mid = (l + h) / 2.0;
      System.out.println(mid);
      if (multiply(mid, n) < val) {
        l = mid;
      } else h = mid;
    }
    return l;
  }
}

public class FindNthRoot {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    long val = Long.parseLong(br.readLine());
    double ans = Solution.findNthRootOfM(n, val);
    System.out.println(ans);
  }
}

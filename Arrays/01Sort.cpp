// Author: Ankur Saha
// Linkedin: https://www.linkedin.com/in/ankur-saha/
// Github: https://github.com/Excalibur79

#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define int long long int
#define vi vector<int>
#define vll vector<ll>
#define pii pair<int, int>
#define pll pair<ll, ll>
#define pb push_back
#define mp make_pair
const int MOD = 1e9 + 7;
const ll INF = 1e18;
#define inputarr(arr, n) \
    for (ll i = 0; i < n; i++) cin >> arr[i];
#define printarr(arr, n) \
    for (ll i = 0; i < n; i++) cout << arr[i] << ' ';

void solve() {
    vi nums = {0, 1, 2, 1, 0, 1};
    int numberOfOnes = 0, numberOfTwos = 0, numberOfZeroes = 0;
    for (int value : nums) {
        if (value == 0)
            numberOfZeroes++;
        else if (value == 1)
            numberOfOnes++;
        else
            numberOfTwos++;
    }
    int k = 0;
    while (numberOfZeroes--) nums[k++] = 0;
    while (numberOfOnes--) nums[k++] = 1;
    while (numberOfTwos--) nums[k++] = 2;

    printarr(nums, nums.size());
}

int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int t = 1;
    // cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
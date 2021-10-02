#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int a[n], s2 = 0, s1 = 2;
        a[0] = 2;
        if (n <= 2)
            cout << "NO";
        else
        {
            int p = n / 2;
            if (p % 2 != 0)
                cout << "NO";
            else
            {
                cout << "YES" << endl;
                for (int i = 1; i < n / 2; i++)
                {
                    a[i] = a[i - 1] + 2;
                    s1 = s1 + a[i];
                    a[n - i - 1] = 2 * i - 1;
                    s2 = s2 + 2 * i - 1;
                }
                a[n - 1] = s1 - s2;
                for (int i = 0; i < n; i++)
                {
                    cout << a[i] << " ";
                }
            }
        }
        cout << endl;
    }
    return 0;
}
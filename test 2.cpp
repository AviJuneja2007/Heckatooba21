#include<bits/stdc++.h>
using namespace std;
#define ll                 long long int
#define MOD                1000000007
#define pi                 3.141592653589793238
#define vl                 vector<ll>
#define all(v)             begin(v),end(v)
#define uniq(v)           (v).erase(unique(all(v)),(v).end())
#define sz(x)             (ll)((x).size())
#define fr                first
#define sc                second
#define pll               pair<ll,ll>
#define vpl               vector<pair<ll,ll>>
#define lcm(a,b)         (a/(__gcd(a,b)))*b
#define foru(i,a,b)       for(ll i=a;i<b;i++)
#define ford(i,a,b)       for(ll i=a;i>b;i--)
#define omp               map<ll,ll>
#define ump               unordered_map<ll,ll>
#define sum(a)            (accumulate ((a).begin(), (a).end(), 0ll))
#define FIO               ios_base::sync_with_stdio(false);cin.tie(NULL);cout<<fixed;cout.precision(10);
#define endl              '\n'
//unordered_set<int> p2 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
//int32_t mod_inv(int32_t a, int32_t m) ;
// ll power(ll x,ll n) ;
// ll LCM(vector<ll>&v);
// bool is_prime[1000006];
// vector<ll>primes; m
// ll dx1[]={0,0,-1,1};
// ll dy1[]={1,-1,0,0};
// vector<int>dx2 = {-1,0,1,0,1,-1,-1,1};
// vector<int>dy2= {0,-1,0,1,1,1,-1,-1};
////////////////////////////////////////////////////////////////////////////////
 void solution(){
    ll res, n,b;
    cin>>n;
    ll a[n];
    for(ll i=1;i<=n;i++)cin>>a[i];
    res=a[1];
    for(ll i=2;i<=n;i++)res&=a[i];
    cout<<res<<endl;
 }

int main(){
    FIO
    ll T;
    cin>>T;
   for(ll i=1;i<=T;i++){
      // cout<<"Case #"<<i<<": ";
        solution();
        } 
        return 0;
    }
////////////////////////////////////////////////////////////////////////////////

// int32_t mod_inv(int32_t a, int32_t m) {
// 	int32_t g = m, r = a, x = 0, y = 1;
// 	while (r != 0) {
// 		int32_t q = g / r;
// 		g %= r; swap(g, r);
// 		x -= q * y; swap(x, y);
// 	}
// 	return x < 0 ? x + m : x;
// }
// ll power(ll x,ll n)
// {       ll result=1;
//     while(n>0)
//     {
//         if(n % 2 ==1)
//             result=(result * x)%MOD;
//         x=(x*x)%MOD;
//         n=n/2;
//     }
//     return result;
// }
// ll LCM(vector<ll>&v){
//     ll ans=v[0];
//     for(ll i=2;i<v.size();i++){
//         ans = (ans * v[i]) / __gcd(ans,v[i]);
//     }
//     return ans;
// }
//  bool is_prime[1000006];
// void sieve(int a,int b){

//     for(ll i=a;i<=b;i++){
//         if(is_prime[i]==0)continue;
//         primes.push_back(i);
//         for(ll j=i*2;j<=b;j+=i){
//             is_prime[j]=0;
//         }
//     }
// }
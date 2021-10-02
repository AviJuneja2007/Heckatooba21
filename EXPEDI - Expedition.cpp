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
#define lcm(a,b)          (a/(__gcd(a,b)))*b
#define FIO               ios_base::sync_with_stdio(false);cin.tie(NULL);
#define endl              '\n'

////////////////////////////////////////////////////////////////////////////////
 void solution(){
  ll n,l,p,curr,ans=0;
  cin>>n;
  vector<pll>a(n);
  for(int i=0;i<n;i++){
       cin>>a[i].first>>a[i].second;
  }
  cin>>l>>p;
  for(auto &i:a)
     i.first=l-i.first;

  sort(all(a));
  priority_queue<ll,vl>pq;
  curr=p; bool flag=0;
  for(ll i=0;i<n;i++){
       if(curr>=l) break;

         while(curr<a[i].first){
            if(pq.empty()){
                 flag=1;
                 break;
            }
            ans++;
            curr+=pq.top();
            pq.pop();
       }

         if(flag) break;
             pq.push(a[i].second);
    }

      if(flag){
       cout<<-1<<endl;
        return;}

     while(!pq.empty() and curr<l){
          curr+=pq.top();
          pq.pop();
          ans++;
     }

     if(curr<l){
       cout<<-1<<endl;
       return;}

     cout<<ans<<endl;

}
int main(){
     FIO
     ll T;
     cin>>T;
     while(T--){
          solution();
          } 
          return 0;
     }
////////////////////////////////////////////////////////////////////////////////

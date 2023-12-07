#include<iostream>
using namespace std;

int main()
{
    enum days {Sunday,Monday,Tuesday,Wednesday};

    cout<<Sunday<<"\n";
    cout<<Monday<<"\n";

    enum months{January=10,Febraury=20,March};
    cout<<January<<"\n";
    cout<<Febraury<<"\n";
    cout<<March<<"\n";
    return 0;
}
#include<iostream>
using namespace std;
int binarysearch(int arr[],int size , int key)
{
    int start = 0;
    int end = size -1;

    int mid = start + (end-start)/2;

    while (start <= end)
    {
        if (arr[mid] == key)
        {
            return mid;
        }
        if ( key > arr[mid] )
        {
            start = mid + 1;
        }
        else
        {
            end = mid -1;
        }
         mid = start + (end-start)/2;
    }
    return -1;
    
}
int main()
{
    int arrodd[5]={1,8,6,9,7};
    int arreven[6]={8,9,3,4,6,9};
    int index = binarysearch(arreven,6,6);
    cout<<index;
}

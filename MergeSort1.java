import java.util.*;
class MergeSort1
{
	public static void main(String as[]){
		int arr[]={22,14,38,4,53,45,52};
		MergeSort1 o=new MergeSort1();
		int len=arr.length;
		o.sort(arr,0,(len-1));
		printArray(arr);
		}
	static void sort(int arr[],int l,int r){
		if(l<r){
		int mid=(l+r)/2;
		
		//System.out.println("mid"+mid);
		sort(arr,l,mid);
		sort(arr,mid+1,r);
		merge(arr,l,mid,r);
		}
	}
	static void merge(int arr[],int l,int mid,int r){
		
int i=l,j=mid+1,index=l;
int le=arr.length;
int[] temp=new int[le];
int k;
while((i<=mid)&&(j<=r))
{
	if(arr[i]<arr[j]){
		temp[index]=arr[i];
		i++;
	}
	else{
		temp[index]=arr[j];
		j++;
	}
	index++;
}	
if(i>mid){
	while(j<=r)
	{temp[index]=arr[j];
j++;
index++;}
}
else{
	while(i<=mid){
		temp[index]=arr[i];
		i++;
		index++;
		
	}
}
for(k=l;k<index;k++)
{arr[k]=temp[k];}
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
}
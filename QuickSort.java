import java.util.*;
class QuickSort
{
	 /*public static void swap (Integer array[], int x, int y)
    {
        }*/

	static void sort(Integer[] arr,int low,int high)
	{
		if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
 
		
		int mid=low+(high-low)/2;
		int pivot=arr[mid];
		int i=low,j=high;
		int index;
		while(i<=j)
		{
		while(arr[i]<pivot)
		{
			i++;
		}		
while(arr[j]>pivot){
	j--;
}		
if(i<=j)
{
	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
	i++;
	j--;
}
		}

		 if (low < j){
            sort(arr, low, j);
        }
        if (high > i){
            sort(arr, i, high);
        }
    }
		
	
	public static void main(String as[])
	{
		Integer[] arr=new Integer[]{38,52,22,30,43};
		QuickSort q=new QuickSort();
		q.sort(arr,0,arr.length-1);
						System.out.println(Arrays.toString(arr));


	}
}
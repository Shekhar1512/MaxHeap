package javaPrograms;

public class MaxHeap {

	
	public static void MaxHeapify(int a[],int n,int i)
	{
		
		
		int largest = i;
		int l = 2*i;
		int r = 2*i+1;
		
		if(l<n && a[l]>a[largest])
		{
			largest = i;
		}
		
		if(r<n && a[r]>a[largest])
		{
			largest = r;
		}
		
		if(largest!=i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			
			MaxHeapify(a,n,largest);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {5,4,3,2,1};
		int i = a.length/2-1;
		int n = a.length;
		
		
		
		for(int k=i; k>=0; k--)
		{
		    
		}
		
		//print max heap array
		for(i=0; i<a.length; i++)
		{
			
			System.out.print(a[i]+"  ");
		}

	}

}

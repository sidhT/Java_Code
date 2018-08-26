//import java.utils.String;
class BinarySearch {
   static void search(int arr[], int n, int x)
	{
		int l = 0, r= n-1, mid;
		
		//for (int i = 0; i < n; i++)
		while (l<=r)
		{
			/*if (l>=r){
				System.out.println("Item not found");
				return
			}*/

			mid = (l+r)/2;
			//System.out.println("mid = "+Integer.toString(mid)+ "l = "+Integer.toString(l)+" r = "+Integer.toString(r));
			if (arr[mid] == x){
				System.out.println("Item "+Integer.toString(x)+" found in position "+Integer.toString(mid+1));
			    return;
			    
			}
			else if(arr[mid]<x)
				l = mid+1;
			else 
				r = mid-1;
		}
		
        System.out.println("Item not found");
	}

    
    public static void main (String [] args){
         
         int arr[]= {1,2,3,4,5,6,7,8,9,10};
         search(arr,10,10);
         //System.out.println( (result>0) ? "present":"not present" );
    }

}

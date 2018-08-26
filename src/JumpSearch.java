//import java.utils.String;
class JumpSearch {
   static void search(int arr[], int n, int x,int j)
	{	int i=0,block=0;
		while(j<n)
		{
			if (arr[j] > x){
				for (i=j;i>block;i--)
					if(arr[i]==x)
						System.out.println("Found");
						return;
			}
			block = j;
			j+=j;
			//j= 2*j;
					
		}
		System.out.println("Not Found");

	}
    
    public static void main (String [] args){
         
         int arr[]= {1,2,3,4,5,6,7,8,9,10};
       //  search(arr,10,10);
         //System.out.println( (result>0) ? "present":"not present" );
    }

}

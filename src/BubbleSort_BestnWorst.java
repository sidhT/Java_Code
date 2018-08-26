//import java.utils.String;
class BubbleSort {
/*  Worst case code O(n^2) 
    static void sort(int arr[])
	{
	//int len = arr.length;
	int temp;
	for (int j=0;j<arr.length-1;j++){
		for (int i=0;i<arr.length-1;i++){
			if (arr[i]>arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;	
			} 
		}
	}
	*/
	//best case
	static void sort(int arr[])
	{
	//int len = arr.length;
	int temp=0,i,counter =0,swap=0;
	boolean flag = false;
	while (!flag){
	    counter++;
	    swap=0;
		for (i=0;i<arr.length-1;i++){
		    //temp = 0;
			if (arr[i]>arr[i+1]){
			    //flag = true;
			    swap = 1;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;	
			} 
		}
    
		if ((i == arr.length-1)&&(swap==0)) 
		    flag = true;
	}
	
	for ( i=0; i<arr.length;i++)
		System.out.print(arr[i]+" , ");
	System.out.println("Iterations : "+counter);
	}

    
    public static void main (String [] args)
	{
         
         int arr[]= {024,4212,13,40,55,26,7321,1028,911,101};
         sort(arr);
         //System.out.println( (result>0) ? "present":"not present" );
    	}

}

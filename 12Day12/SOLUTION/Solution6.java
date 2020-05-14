class GFG 
{ 
      
    // Function to divide an array into k  
    // parts such that the sum of difference  
    // of every element with the maximum element  
    // of that part is minimum  
    static int divideArray(int arr[], int n, int k)  
    {  
        // Dp to store the values  
        int dp[][] = new int[500][500];  
          

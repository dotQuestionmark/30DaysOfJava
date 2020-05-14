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
         int i, j; 
          
        for(i = 0; i < 500; i++) 
            for(j = 0; j < 500; j++) 
                dp[i][j] = 0; 
                  
        k -= 1;  
      // Fill up the dp table  
        for (i = n - 1; i >= 0; i--)  
        {  
            for (j = 0; j <= k; j++)  
            {  
                  
                // Intitilize maximum value  
                dp[i][j] = Integer.MAX_VALUE;  
      
                // Max element and the sum  
                int max_ = -1, sum = 0;    

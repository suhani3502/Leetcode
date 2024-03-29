//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int count=0;
        int arr[][]=new int[n][3];
        for (int i=0; i<n;i++){
            arr[i][0]=i+1;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[2]));
        int r= arr[0][2];
        count=count+1;
        for (int i=0; i<arr.length;i++){
            if(arr[i][1]>r){
                count++;
                r=arr[i][2];
            }
        }
        return count;
    
    }
}
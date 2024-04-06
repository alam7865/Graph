import java.util.*;
public class maxWeight {
    public static void main(String[] args) {
        int Edge[]={2,0,-1,2};
        int n=Edge.length;

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            if(Edge[i]!=-1)
            {
                arr[Edge[i]]=i;
            }
            
        }

        int max=-1;
        int idx=-1;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            if(max<arr[i])
            {
                max=arr[i];
                idx=i;
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Idx "+idx);
    }
}

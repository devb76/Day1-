import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];

      for(int i=0;i<n;i++){

        arr[i]= scn.nextInt();
      }
        int max=arr[0];
        for(int i=1;i<n;i++){
              if(arr[i]>max){
                max=arr[i];
              }
        }

       for(int f= max;f>=1;f--){

         for(int i=0;i<n;i++){

          if(arr[i]>=f){
              System.out.print("*\t");
          }
          else{
              System.out.print("\t");
          }        
         }
           System.out.println();


       }







 }

}

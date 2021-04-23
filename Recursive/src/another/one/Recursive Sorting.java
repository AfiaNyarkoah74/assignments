/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another.one;
import java.util.Arrays;
import java.util.*;
import javafx.scene.Node;
/**
 *
 * @author Bianca Owusu
 */
public class AnotherOne {

 // recursive function to sort an array
    
    static void insertionSortRecursive(int[] arr, int par)
    {
        int n = 0;
        // base case
        if(n <=1)
        {
            return;
        }
        //Sorting first n-1 element
        insertionSortRecursive(arr,n-1);
        //insert last element at its correct position in sorted array
        int last = arr[n-1];
        int j = n-2;
        
        while (j >=0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
        }
        
    
    
            
            public static void main(String[] args) {
                int arr[]={8,10,12,16,9,14};
                insertionSortRecursive(arr,arr.length);
                System.out.println(Arrays.toString(arr));
        
            }
           
            }
            
    


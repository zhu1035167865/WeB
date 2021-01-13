/**
 * 
 * Auto Generated Java Class.
 */
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class Anotherclass extends mainclass {
  public char[] example;
  public char[] list;
  public char[] name;
  /* ADD YOUR CODE HERE */
    public static void shuffle (char[] list) /*list to be shuffled*/
{ Random gen=new Random();
  int i;
  char temp;
  
 for(int startIndex=0; startIndex<list.length-1; startIndex++)
 {  i=gen.nextInt(list.length-startIndex)+startIndex;
    
   temp=list[i];
   list[i]=list[startIndex];
   list[startIndex]=temp;

 }}
 public static void bubblesort(char[] list)
  {
    int startIndex; // subscript of first 
                    //element of unsorted array
    int i;  // index of first element in 
            // pair being compared 
    
    //for unsorted subarray, start with whole array, through
    //last case of two elements left
    for (startIndex = 0;startIndex<=list.length-2; startIndex++)
    {
      //for each pair of unsorted array
      for (i=list.length-2; i>=startIndex; i--)
        if (list[i]>list[i+1])  //if out of order
        //swap these two elements
      { 
        char temp;
        temp = list[i];
        list[i]=list[i+1];
        list[i+1]=temp;
      } // end swap
       // end for i
    }  // end for startIndex
  }  //end bubblesort
 
  public static void parallel_sort (char[ ] listChar,//for ordering
                                   int[] listInt, double[] listDouble)
  {
    int min;   
    char temp;
    int temp2;
    double temp3;
    for (int startIndex=0; startIndex < listChar.length; startIndex++)
    {
      min=startIndex;
      
      for (int i=startIndex+1; i<listChar.length; i++)
        if (listChar[i]<listChar[min])
        min=i;
      
      
      temp=listChar[min];
      listChar[min]=listChar[startIndex];
      listChar[startIndex]=temp;
      
      temp2=listInt[min];
      listInt[min]=listInt[startIndex];
      listInt[startIndex]=temp2;
      
      temp3=listDouble[min];
      listDouble[min]=listDouble[startIndex];
      listDouble[startIndex]=temp3;
      
    }
  }

   public static void select_sort2 (double[ ] list)// list to be sorted 
  {
    int min;   //index of smallest element of sublist
    double temp; //for swapping
    for (int startIndex=0; startIndex < list.length; startIndex++)
    {
      min=startIndex;
      
      for (int i=startIndex+1; i<list.length; i++)
        if (list[i]<list[min])
        min=i;
      
      //swap the values
      temp=list[min];
      list[min]=list[startIndex];
      list[startIndex]=temp;
    }//end for startIndex  
  } // end select_sort
   public static void select_sort1 (char[ ] list)// list to be sorted 
  {
    int min;   //index of smallest element of sublist
    char temp; //for swapping
    for (int startIndex=0; startIndex < list.length; startIndex++)
    {
      min=startIndex;
      
      for (int i=startIndex+1; i<list.length; i++)
        if (list[i]<list[min])
        min=i;
      
      //swap the values
      temp=list[min];
      list[min]=list[startIndex];
      list[startIndex]=temp;
    }//end for startIndex  
  } // end select_sort
public static void printParallel(double first[], int second[], char third[]){
  for(int count=0; count<5; count++)
    { System.out.print(first[count]+"   ");
      System.out.print(second[count]+"   ");
      System.out.println(third[count]);
  }


} 
public static void parallel_sort (double[ ] listDouble,//for ordering
                                   int[] listInt, char[] listChar)
  {
    int min;   
    double temp;
    int temp2;
    char temp3;
    for (int startIndex=0; startIndex < listDouble.length; startIndex++)
    {
      min=startIndex;
      
      for (int i=startIndex+1; i<listDouble.length; i++)
        if (listDouble[i]<listDouble[min])
        min=i;
      
      
      temp=listDouble[min];
      listDouble[min]=listDouble[startIndex];
      listDouble[startIndex]=temp;
      
      temp2=listInt[min];
      listInt[min]=listInt[startIndex];
      listInt[startIndex]=temp2;
      
      temp3=listChar[min];
      listChar[min]=listChar[startIndex];
      listChar[startIndex]=temp3;
      
    }
  }
}


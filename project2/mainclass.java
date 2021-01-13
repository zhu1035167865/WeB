import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class mainclass
{
  public static void main(String[] arg) throws IOException
  {     
    Scanner scan=new Scanner(System.in);
    File input=new File("sortdata.txt");
    Scanner myFileScanner = new Scanner(input);
    
    char[] c=new char[5];
    int[] d=new int[5];
    double[] f=new double[5];
    
    while(myFileScanner.hasNext())
    {for(int a=0; a<5; a++)
    {String s=myFileScanner.next();
     c[a]=s.charAt(0);
     d[a]=myFileScanner.nextInt();
     f[a]=myFileScanner.nextDouble();

    }}
    

  System.out.println("");
    Anotherclass.select_sort2(f);
    Anotherclass.printParallel(f,d,c);
  System.out.println("you want to sort based on char value or double value?( C or D )");
  String answer=scan.nextLine();
  char Answer=answer.charAt(0);
  if((Answer=='c')||(Answer=='C'))
  { Anotherclass.parallel_sort(c,d,f);
    Anotherclass.printParallel(f,d,c);
  }
  
  if((Answer=='d')||(Answer=='D'))
  { Anotherclass.parallel_sort(f,d,c);
    Anotherclass.printParallel(f,d,c);
  }
  
  
    /* create a list to experiment on */
     Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name(without comma)");
        char[] list=sc.next().toCharArray();
    char[] name={'q','i','j','u','n','h','e'};
    char[] example={'a','b','c','d','e','f','g'};
    /* print the unsorted array */
    for (int i=0; i<list.length; i++)
    System.out.print(list[i]+"  ");
    System.out.println();
    
    // sort the array using one of the sorts 
    Anotherclass.select_sort1(list);
    //bubblesort the letters of your name here.
    
    /* print the sorted array */
    for (int i=0; i<list.length; i++)
    System.out.print(list[i]+"  ");
    System.out.println();
    /* print the sorted array of your name*/
    for (int i=0; i<name.length; i++)
    System.out.print(name[i]+"  ");
    System.out.println();
    Anotherclass.bubblesort(name);
    for (int i=0; i<name.length; i++)
    System.out.print(name[i]+"  ");
    System.out.println();
    
    /* shuffle and print here */
    boolean b = false;
        do {
    try{for (int i=0; i<list.length; i++)
    System.out.print(list[i]+"  ");
    System.out.println();
    Anotherclass.shuffle(list);
    }
    catch(NullPointerException ex) 
        { 
            System.out.println("Exception has been caught"); 
        } 
          
        finally
        { 
            System.out.println("finally block executed"); 
        } 
   for (int i=0; i<list.length; i++)
    System.out.print(list[i]+"  ");
    System.out.println();
        break;}
        while(!b);
            try { 
Runtime run = Runtime.getRuntime(); 
      arg = new String[3]; 
      arg[0] = "cmd"; 
      arg[1] = "/c"; 
      arg[2] = "Explorer.exe /n , /select,c:/sortdata.txt"; 
      run.exec(arg); 
    } 
    catch (IOException e) { 
      e.printStackTrace(); 
    } 
      
  }

} // end class Sort








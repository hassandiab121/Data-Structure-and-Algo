/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;


public class recursion {

    /**
     * @param args the command line arguments
     */
    static char s[]={'h','a','s','s','a','n'};
    public static void main(String[] args) {
        // TODO code application logic here
      
      reverseString(s);
        // print the reversed array of characters
      int counter=0;
     while(counter !=6)
     {
      System.out.print(s[counter]+" ");
      counter++;
     }
       
    }
    
    public static  void reverseString(char[] s) {
     int start =0;
     int end =s.length -1;
 
     reverseString(s , start, end); // overloaded recursive helper function
       
    }
 
    private static void reverseString(char[] s, int start, int end ) // recursive helper function
    {
 
        if(start == end || start > end ) // base case 
            return;
        else
        {
 
            char m =s[start];
            s[start]=s[end];
            s[end]=m;
            reverseString(s,++start,--end);  //recursive relation
 
        }
    } 
      
    
    
    
    
}

//Write a program to Sort strings in alphabetical order?

import java.util.Arrays;;
public class Assign_Sec8_Que12
{
    public static void main(String[] args) 
    {	
        String arr[] = {"hello","how", "are", "you","today"};
        System.out.println("Unsorted Array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
}
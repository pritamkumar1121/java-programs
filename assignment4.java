package java;

import java.lang.*;
import java.io.*;
import java.util.*;
 

@SuppressWarnings("unused")
class ReverseString {
    public static void main(String[] args)
    {
        String input = "Ritesh";
 

        char[] try1 = input.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
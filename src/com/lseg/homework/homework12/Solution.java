package com.lseg.homework.homework12;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int element = scan.nextInt();
            list.add(element);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int element = scan.nextInt();
                list.add(index, element);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}


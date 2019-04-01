package com.netease.yuqi.chapter1;

/**
 * Author yuqi
 * Time 31/3/19 23:17
 **/
public class HanoiTower {

    public static void main(String[] args) {
        printPath(8, 'A', 'B', 'C');
    }


    public static void printPath(int n, char from, char tmp, char des) {
        //f(n) = 2f(n-1) + 1;
        if (n == 2) {
            System.out.println(from + " ----> " + tmp);
            System.out.println(from + " ----> " + des);
            System.out.println(tmp + " ----> " + des);
        } else {
            printPath(n-1, from, des, tmp);
            System.out.println(from + " ----> " + des);
            printPath(n-1, tmp, from, des);
        }
    }
}

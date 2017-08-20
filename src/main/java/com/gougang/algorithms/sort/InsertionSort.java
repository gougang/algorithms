package com.gougang.algorithms.sort;

/**
 * Created by 16978 on 2017/7/11.
 */
public class InsertionSort extends TemplateSort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}

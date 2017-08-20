package com.gougang.algorithms.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 16978 on 2017/7/17.
 */
public class QuickSort extends TemplateSort {
    @Override
    public void sort(Comparable[] a) {
        //StdRandom.shuffle(a);
        Collections.shuffle(Arrays.asList(a));
        sort(a, 0, a.length - 1);

    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }

            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}

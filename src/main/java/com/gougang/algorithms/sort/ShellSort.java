package com.gougang.algorithms.sort;

/**
 * Created by 16978 on 2017/7/13.
 */
public class ShellSort extends TemplateSort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                        System.out.print("h=" + h + ":");
                        show(a);
                    } else {
                        System.out.println("####");
                    }

                }
                System.out.println("-------------------");
            }
            h = h / 3;
        }
    }
}

package com.gougang.algorithms.sort;

/**
 * Created by 16978 on 2017/7/11.
 * 冒泡排序：
 * 外层循环：
 * 内层循环：每一次循环都会把最大/最小的值冒泡到尾部
 *
 */
public class BubbleSort extends TemplateSort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (more(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }
}

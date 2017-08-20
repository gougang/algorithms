package com.gougang.algorithms.sort;

/**
 * Created by 16978 on 2017/7/11.
 */
public abstract class TemplateSort {

    public abstract void sort(Comparable[] a);

    /**
     * 第一个参数是否小于第二个参数
     *
     * @param v
     * @param w
     * @return
     */
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 第一个参数是否大于第二个参数
     *
     * @param v
     * @param w
     * @return
     */
    public boolean more(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 循环打印出所有对象
     *
     * @param a
     */
    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 校验是否是完成排序了的
     *
     * @param a
     * @return
     */
    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}

package com.gougang.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;


public class AlgorithmsTests {

    @Test
    public void SelectionSortTest() {
        Character[] a = new Character[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
        selectionSort.show(a);
        Assert.assertTrue(selectionSort.isSorted(a));
    }

    @Test
    public void InsertionSortTest() {
        Character[] a = new Character[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(a);
        insertionSort.show(a);
        Assert.assertTrue(insertionSort.isSorted(a));
    }

    @Test
    public void BubbleSortTest() {
        Character[] a = new Character[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
        bubbleSort.show(a);
        Assert.assertTrue(bubbleSort.isSorted(a));
    }

    @Test
    public void ShellSortTest() {
        Character[] a = new Character[]{'S', 'H', 'E', 'L', 'L', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(a);
        shellSort.show(a);
        Assert.assertTrue(shellSort.isSorted(a));
    }

    @Test
    public void QuickSortTest() {
        Character[] a = new Character[]{'Q', 'U', 'I', 'C', 'K', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a);
        quickSort.show(a);
        Assert.assertTrue(quickSort.isSorted(a));
    }
}

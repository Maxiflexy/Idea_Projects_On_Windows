package com.practice.dsa_telusko;
public class Demo {
    public static void main(String[] args) {

//        int[] numbs = {5,7,9,11,13,15,19};
//        int target = 20;
//
//        int result1 = linearSearch(numbs,target);
//        int result2 = binarySearch(numbs,target);
//
//        if(result2 != -1) {
//            //System.out.println("Element found at index: " + result1);
//            System.out.println("Element found at index: " + result2);
//        }
//        else
//            System.out.println("Element not found");
        //,17,7,9,13}
//        int[] numbers = {5,6,2,3,1,91,11,25};
//        quickSort(numbers, 0,numbers.length-1);
//        for(int n : numbers)
//            System.out.print(n + " ");
        int[] numbers = {5,6,2,17,3,1,4,8};
        mergeSort(numbers);
        for(int n : numbers)
            System.out.print(n + " ");





//        int[] result = selectionSort(numbers);
//        for(int n: result)
//            System.out.print(n+ " ");
//        int [] result = bubbleSort(numbers);
//        for(int n : result)
//            System.out.print(n + " ");


//        int [] ss = selectionSort(numbers);
//        for(int s : ss)
//            System.out.print(s + " ");

    }
    private static int linearSearch(int[] numbs, int target) {
        for(int i = 0; i <numbs.length; i++){
            if(numbs[i] == target)
                return i;
        }
        return -1;
    }
    private static int binarySearch(int[] numbs, int target) {
        int left = 0;
        int right = numbs.length-1;

        while (left<=right) {
            int mid = (left+right) / 2;
            if (numbs[mid] == target)
                return mid;
            else if (numbs[mid]<target)
                left=mid + 1;
            else
                right=mid -1;
        }
        return -1;
    }
    private static int[] bubbleSort(int[]numbs) {
        int temp;
        int size =numbs.length;

        for(int i = 0; i<size; i++){
            for(int j = 0; j < size-1; j++){
                if(numbs[j] > numbs[j+1]){
                    temp = numbs[j];
                    numbs[j] = numbs[j+1];
                    numbs[j+1] = temp;
                }
            }
        }
        return numbs;
    }

    private static int[] selectionSort(int[] numbs) {
        int temp;
        int size =numbs.length;
        for(int i = 0; i < size-1; i++){
            int minIndex = i;
            for(int j = i+1; j < size; j++){
                if(numbs[minIndex] > numbs[j])
                    minIndex = j;
            }
            temp = numbs[i];
            numbs[i] = numbs[minIndex];
            numbs[minIndex] = temp;
        }
        return numbs;
    }

    private static int[] insertionSort(int[] numbs){
        int size = numbs.length;
        for(int i = 1; i < size; i++){
            int j = i-1;

            while (j >= 0 && numbs[j] > numbs[j+1]){
                int temp = numbs[j];
                numbs[j] = numbs[j+1];
                numbs[j+1] = temp;
                j--;
            }
        }
        return numbs;
    }

    private static void quickSort(int[] array, int start, int end){
        if(end < start)
            return;
        int pivot = partition(array,start,end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot +1, end);
    }
    private static int partition(int[]array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        int temp;
        for(int j = start; j < end; j++){
            if(array[j] < pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    private static void mergeSort(int[] array){
        int size = array.length;
        if(size <= 1)
            return;
        int middle = size/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[size - middle];

        for(int i = 0, j = 0; i < size; i++){
            if(i < middle)
                leftArray[i] = array[i];
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize &&  r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}

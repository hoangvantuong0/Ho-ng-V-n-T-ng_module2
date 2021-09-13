package _04_class_and_object_in_java.exercise;

import java.util.Arrays;

public class TestStopWatch {
    static void sort(int[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public void main(String[] args) {
      StopWatchClass stopWatchClass = new StopWatchClass();
        int[] arr = new int[100000];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random()*100000);
        }
    stopWatchClass.start();
        sort(arr);
        stopWatchClass.stop();
        System.out.println(Arrays.toString(arr));
        System.out.println("Elapsed Time: " + stopWatchClass.getElapsedTime());
    }
}



package _04_class_and_object_in_java.exercise;

import java.util.Arrays;
public class StopWatchTest {
        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    public void main(String[] args) {
        StopWatchClass stopWatch = new StopWatchClass();
        int[] arr = new int[100000];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random()*100000);
        }
        stopWatch.start();
        sort(arr);
        stopWatch.stop();
        System.out.println(Arrays.toString(arr));
        System.out.println("ElapsedTime: " + stopWatch.getElapsedTime());
    }
}

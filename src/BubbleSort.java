public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean sortagain = false;

        while (sortagain ==true){
            sortagain = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i + 1]) {
                    Sort.swap(arr, i, i + 1);
                    sortagain = true;
                }
            }

        }
    }
}
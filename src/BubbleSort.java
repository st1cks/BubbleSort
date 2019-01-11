public class BubbleSort {

    public static void bubbleSort(int[] sortthis) {
        boolean sortagain = false;

        while (sortagain ==true){
            sortagain = false;
            for (int i = 0; i < sortthis.length; i++) {
                if (sortthis[i] > sortthis[i + 1]) {
                    swap(sortthis, i, i + 1);
                    sortagain = true;
                }
            }

        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10001);
        }
        return arr;
    }


}
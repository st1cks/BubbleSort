public class ActivateBubbleSort {
    public static void main(String[]args){

        int[] arr = Sort.randIntArr(10);

        for(int i = 0; i < arr.length;i++){
            arr[i] = (int)(Math.random()*10001);
        }
        System.out.println("Initial Array");
        for (int i = 0; i < arr.length;i++){
            System.out.println(""+arr[i]+"");
        }

        BubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length;i++){
            System.out.println(""+arr[i]+"");
        }
    }
}

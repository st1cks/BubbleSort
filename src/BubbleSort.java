public class BubbleSort {

  public static int[] randintARR(int count){
      int[] arr = new int[count];
      for (int b = 0; b<arr.length;b++){
          arr[b] = (int)(Math.random()*10001);
      }
      return arr;
  }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void bubbleSort(int [] arr){
        boolean sorted = true;
        while (sorted == true){
            sorted = false;
            for (int a = 0; a < arr.length; a++){
                if (arr[a] > arr[a+1]){
                        swap(arr, arr[a], arr[a+1]);
                        sorted = true;
                }
            }
        }
    }
}

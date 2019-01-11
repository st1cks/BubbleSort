public class ActivateBubbleSort {
    public static void main(String[]args){

        BubbleSort object = new BubbleSort();
        int [] copy = new int[10];

        for (int i = 0; i < copy.length; i ++){
            copy[i] = (int)(Math.random()*1001);
        }


        System.out.println("Initial Array");
        for (int i = 0; i < copy.length;i++){
            System.out.println(""+copy[i]+"");
        }

        object.bubbleSort(copy);

        System.out.println("Sorted Array");
        for (int i = 0; i < copy.length;i++){
            System.out.println(""+copy[i]+"");
        }
    }
}

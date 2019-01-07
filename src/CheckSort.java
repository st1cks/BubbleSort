public class CheckSort {

    public boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public boolean checkSUM(int[] before, int[] after){
        int beforea=  0;
        int afterb= 0;
        for (int num:before){
             beforea += beforea + num;
        }
        for (int num:after){
            afterb += afterb + num;
        }
        if (beforea == afterb){
            return true;
        }
        else{
            return false;
        }
    }
}


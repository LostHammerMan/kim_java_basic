package section7;

public class MathArrayUtils {

    int[] values = {};
    static int result = 0;

    private MathArrayUtils() {
    }

    public static int sum(int[] arrays){
        for (int array : arrays){
            result += array;
        }
        return result;
    }

    public static double average(int[] arrays){

        result = 0;
        for (int array : arrays){
            result += array;
        }
//        System.out.println("result = " + result);
//        System.out.println("arrays.length  = " + arrays.length);
        return  (double) result / arrays.length;
    }

    public static int min(int[] arrays){

        result = 0;
        for (int i = 1; i <arrays.length; i++){
            if (arrays[i-1] < arrays[i]){
                result = arrays[i-1];
            }
        }

        return result;
    }

    public static int max(int[] arrays){

        result = 0;
        for (int i = 1; i <arrays.length; i++){
            if (arrays[i-1] < arrays[i]){
                result = arrays[i];
            }
        }

        return result;
    }
}

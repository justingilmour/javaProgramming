package Week7;

public class HW6 {

        public static boolean checkArray(int[] inArray, double lower, double higher) {
            for (int index : inArray) {
                if (index <= lower || index >= higher ) {
                    return false;
                }else {
                    return true;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] test = {1,13,6,8};
            System.out.println(checkArray(test, 0, 10));
        }
    }

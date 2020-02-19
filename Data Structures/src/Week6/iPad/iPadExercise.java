package Week6.iPad;

public class iPadExercise {

    public class iPadPro129 implements iPad {

        private int memorySize;
        private boolean cellular;

        public iPadPro129(int memorySize, String cell) {
            this.memorySize = memorySize;
            if (cell.equals("cellular")) {
                cellular = true;
            } else {
                cellular = false;
            }
        }
        public double computePrice() {
            if (cellular) return (12 * memorySize) + IPADPRO129CELLULAR;
            else return (12 * memorySize);
        }

        public String toString() {
            return "iPad Pro 12.9 with " + memorySize + " and cellular is " + cellular;
        }
    }
}

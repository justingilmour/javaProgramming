package Week6.iPad;

public class iPadPro11 implements iPad {

        private int memorySize;
        private boolean cellular;

        public iPadPro11(int memorySize, String cell) {
            this.memorySize = memorySize;
            if (cell.equals("cellular")) {
                cellular = true;
            } else {
                cellular = false;
            }
        }
        public double computePrice() {
            if (cellular) return (11 * memorySize) + IPADPRO11CELLULAR;
            else return (11 * memorySize);
        }

        public String toString() {
            return "iPad Pro 12.9 with " + memorySize + " and cellular is " + cellular;
        }
    }


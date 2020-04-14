package ProblemSolving;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class JustinGilmour_Interpreter_166 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();
        scan.nextLine();

        for (int numcases = 0; numcases < cases-1; numcases++){
            int [] RAM = new int [1000];
            int index = 0;
            String temp;
            do{
                temp = scan.nextLine();
                if (!temp.equals(" ")) RAM[index++] = Integer.parseInt(temp);
            } while (!temp.equals(" "));
            int counter = interpreter(RAM);
            System.out.println(counter + "\n");
        }
        int [] RAM = new int[1000];
        int index = 0;

        while (scan.hasNext()){
            RAM[index++] = scan.nextInt();
        }
        int counter = interpreter(RAM);
        System.out.println(counter);
    }
    public static int interpreter (int [] RAM){
        int [] registers = new int[10];
        int instr = -1;
        int counter = 0;
        int current;
        int op1, op2;
        int index = 0;
        while  (instr != 1){
            current= RAM[index++];
            counter++;
            instr = current/100;
            op1 = (current%100)/10;
            op2 = (current%100)%10;

            if (instr == 2) registers[op1] = op2;
            if (instr == 3) registers[op1] = (registers[op1] + op2) % 1000;
            if (instr == 4) registers[op1] = (registers[op1] * op2) % 1000;
            if (instr == 5) registers[op1] = registers[op2];
            if (instr == 6) registers[op1] = (registers[op1] + registers[op2]) % 1000;
            if (instr == 7) registers[op1] = (registers[op1] * registers[op2]) % 1000;
            if (instr == 8) registers[op1] = RAM[registers[op2]];
            if (instr == 9) RAM[registers[op2]] = registers[op1];
            if (instr == 0)
                if (registers[op2] != 0) index = registers[op1];
        }
        return counter;
    }
}

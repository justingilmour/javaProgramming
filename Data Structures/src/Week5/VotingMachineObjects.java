package Week5;

public class VotingMachineObjects {

    public static void main(String[] args) {
        VotingMachine obj1 = new VotingMachine(0, 0, "President");
        obj1.voteYes();
        obj1.voteYes();
        obj1.voteNo();
        System.out.println(obj1);
        obj1.clearMachine();
        System.out.println(obj1);
    }
}

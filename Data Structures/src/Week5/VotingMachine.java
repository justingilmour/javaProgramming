package Week5;

public class VotingMachine {

    private int numberYesVotes;
    private int numberNoVotes;
    private String issue;

    public VotingMachine(int numberYesVotes, int numberNoVotes, String issue){
        this.numberYesVotes = numberYesVotes;
        this.numberNoVotes = numberNoVotes;
        this.issue = issue;
    }

    public void voteYes(){
        numberYesVotes++;
    }

    public void voteNo(){
        numberNoVotes++;
    }

    public int returnYesCount(){
        return numberYesVotes;
    }

    public int returnNoCount(){
        return numberNoVotes;
    }

    public void clearMachine(){
        numberNoVotes = 0;
        numberYesVotes = 0;
    }

    public String toString(){
        return "Number of YES = " + returnYesCount() + " Number of NO = " + returnNoCount();
    }

}

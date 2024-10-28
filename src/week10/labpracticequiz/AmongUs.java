package week10.labpracticequiz;

public class AmongUs {

    private String name;
    private String job;
    private String memberStatus;
    private String gameStatus;

    public AmongUs(String name, String job, String memberStatus) {
        this.name = name;
        this.job = job;
        this.memberStatus = memberStatus;
        this.gameStatus = "not finished";
    }

    public void setStatus(String status) {
        this.memberStatus = memberStatus;
    }

    public String getStatus() {
        return this.memberStatus;
    }

    public void checkGame(String status) {
        if (status.equals("complete") && this.job.equals("crew")) {
            this.gameStatus = "crew wins";
        }
        if (status.equals("complete") && this.job.equals("imposter")) {
            this.gameStatus = "imposter wins";
        }
        System.out.println(this.gameStatus);
    }

    public void votedOff() {
        if (this.job.equals("crew")) {
            this.memberStatus = "dead";
        }
        if (this.job.equals("imposter")) {
            this.memberStatus = "caught";
        }
    }
}

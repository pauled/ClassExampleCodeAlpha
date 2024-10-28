package week10.labpracticequiz;

class Imposter extends AmongUs {

    private int totalMembers;

    public Imposter(String name, int totalMembers) {
        super(name, "imposter", "not caught");
        this.totalMembers = totalMembers;
    }

    public String completeTask(Crew member) {
        member.setStatus("dead");
        this.totalMembers -= 1;

        if (this.totalMembers == 1) {
            return "complete";
        }
        return "not complete";
    }

}
package week10.labpracticequiz;

class Crew extends AmongUs {

    private int tasksGiven;

    public Crew(String name, int tasks) {
        super(name, "crew", "alive");
        this.tasksGiven = tasks;
    }

    public String completeTask(Crew member) {
        this.tasksGiven -= 1;
        if (this.tasksGiven == 0) {
            return "complete";
        }
        return "not complete";
    }
}

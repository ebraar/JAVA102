public abstract class SporDallari {
    String sportName;

    public void sportStart(TeamClass t1, TeamClass t2){
        t1.goal = 0;
        t2.goal = 0;
    }
    abstract void findScore();
    abstract int getPlayerNumber(String sportName);
    abstract void t1Goal();
    abstract void t2Goal();
}

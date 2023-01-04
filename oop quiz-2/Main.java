public class Main {
    public static void main(String[] args) {
        TeamClass t1,t2;
        t1 = new TeamClass("Takim 1");
        t2 = new TeamClass("Takim 2");
        Mac F = new Mac("futbol",t1,t2);

        System.out.println("Bir "+ F.sportName + " takiminda " + F.getPlayerNumber(F.sportName) + " oyuncu vardir");

        F.sportStart(t1,t2);
        F.t1Goal();
        F.t2Goal();
        F.t2Goal();
        F.findScore();
    }
}
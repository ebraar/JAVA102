public class Mac extends SporDallari{

    int takim1Goal;
    int takim2Goal;

    TeamClass t1;
    TeamClass t2;

    Mac(String sportName, TeamClass t1, TeamClass t2){
        this.sportName = sportName;
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    int getPlayerNumber(String sportName) {
        if(sportName == "futbol"){
            return 11;
        } else if(sportName == "basketbol"){
            return 12;
        } else{
            return -1;
        }
    }

    @Override
    void t1Goal(){
        takim1Goal+=1;
    }

    @Override
    void t2Goal(){
        takim2Goal+=1;
    }

    @Override
    void findScore(){
        if(takim1Goal > takim2Goal){
            System.out.println(t1.takimIsmi + ", takimi, " + t2.takimIsmi + " takimini " + takim1Goal + "-" + takim2Goal + " yendi");
        } else if (takim2Goal > takim1Goal) {
            System.out.println(t2.takimIsmi + " takimi, " + t1.takimIsmi + " takimini " + takim2Goal + "-" + takim1Goal + " yendi");
        } else {
            System.out.println("Mac berabere bitti.");
        }
    }
}

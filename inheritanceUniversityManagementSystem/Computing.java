public class Computing extends Officer {
    private String task;

    public Computing(String nameSurname, String mpno, String eposta, String department, String shift, String task) {
        super(nameSurname, mpno, eposta, department, shift);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup(){
        System.out.println(getNameSurname()+ " ağ kurulumunu yaptı!");
    }
}

enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class Example2{
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}
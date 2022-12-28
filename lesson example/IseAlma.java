public interface IseAlma {
    public abstract void uzmanIsIlani();
    default void kasiyerIsIlani(){
        System.out.println("Kasiyer işe alındı.");
    }
}

package abc;

//интерфейс 100% абстрактный класс.
public interface Playable {


    //public abstract by default
    void play();

    public abstract void stop();

    //by default the field is public and static final (constanta)
    double PI = 3.14;


    public static final double X = 0.99;


}

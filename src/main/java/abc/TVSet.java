package abc;

public class TVSet implements Playable {


    @Override
    public void play() {
        System.out.println("start showing ");
    }

    @Override
    public void stop() {
        System.out.println("stop showing ");

    }
}

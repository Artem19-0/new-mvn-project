package abc;

public class DVDPlayer extends Player implements Playable , Test{


    @Override
    public void play() {
        System.out.println("start playing dvd disc...");
    }

    @Override
    public void stop() {
        System.out.println("stop playing dvd disc...");

    }

    @Override
    public void test() {

    }
}

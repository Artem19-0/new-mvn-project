package abc;

public class FlashPlayer extends Player implements Playable{
    @Override
    public void play() {
        System.out.println("start track from Flash memory ");

    }

    @Override
    public void stop() {
        System.out.println("stop track from Flash memory  ");

    }
}

package abc;

public class TypePlayer extends Player implements Playable{


    @Override
    public void play() {
        System.out.println("start type record ");
    }

    @Override
    public void stop() {
        System.out.println("stop type record ");

    }
}

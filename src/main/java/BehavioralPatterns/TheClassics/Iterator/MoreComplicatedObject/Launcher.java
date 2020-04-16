package BehavioralPatterns.TheClassics.Iterator.MoreComplicatedObject;

public class Launcher {

    public static void main(String[] args) {

        Roster roster = new PlayerRoster();
        PlayerIterator iterator = roster.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

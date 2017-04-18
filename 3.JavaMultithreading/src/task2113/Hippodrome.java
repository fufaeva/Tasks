package task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юлия on 04.04.2017.
 * Ипподром
 */
public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move() {
        for (Horse horses : getHorses()) {
            horses.move();
        }
    }

    public void print() {
        for (Horse horses : getHorses()) {
            horses.print();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {

        Horse winner = null;
        double maxDistance =0;

        for (Horse h:horses) {
            if(h.getDistance()>maxDistance)
                maxDistance = h.getDistance();
        }
        for (Horse h:horses) {
            if(h.getDistance()==maxDistance)
                winner = h;
        }
        return winner;

    }

    public void printWinner() {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("Первая лошадка", 3, 0));
        game.getHorses().add(new Horse("Вторая лошадь", 3, 0));
        game.getHorses().add(new Horse("Третий конь", 3, 0));
        game.run();
        game.printWinner();
    }
}

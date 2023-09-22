import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToyStore {
    Queue<Toy> queue = new PriorityQueue<>();

    public void addToy(String nameToy,double lossRate){
        Toy toy = new Toy(nameToy, lossRate);
        queue.add(toy);
    }
    public StringBuilder textToy(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Toy toy:queue) {
            stringBuilder.append(toy);
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
    public Toy raffleToys(){
        return queue.poll();
    }
}

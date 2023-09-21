import java.util.PriorityQueue;
import java.util.Queue;

public class ToyStore {
    Queue<Toy> queue = new PriorityQueue<>();

    public void addToy(String nameToy,double lossRate){
        Toy toy = new Toy(nameToy, lossRate);
        queue.add(toy);
    }
    public void printToy(){
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    public StringBuilder textToy(){
        StringBuilder stringBuilder = new StringBuilder();
        while (!queue.isEmpty()){
            stringBuilder.append(queue.poll());
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}

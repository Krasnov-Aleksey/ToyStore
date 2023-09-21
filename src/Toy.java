
import java.util.concurrent.atomic.AtomicInteger;

public class Toy  implements Comparable<Toy> {
//    private int counter=0;
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private int idToy;
    private String nameToy;
    private double lossRate;

    public Toy(String nameToy, double lossRate) {
        idToy=COUNTER.getAndIncrement();
        this.nameToy = nameToy;
        this.lossRate = lossRate;
    }
    public void setIdToy(int idToy){
        this.idToy=idToy;
    }



    @Override
    public int compareTo(Toy o) {
        return o.lossRate>this.lossRate ? 1: -1;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "idToy=" + idToy +
                ", nameToy='" + nameToy + '\'' +
                ", lossRate=" + lossRate +
                '}';
    }
}


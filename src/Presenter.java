public class Presenter {
    ToyStore toyStore = new ToyStore();

    public void addToyPr(String nameToy,Double lossRate){
        toyStore.addToy(nameToy,lossRate);
    }

    public StringBuilder textTopPr(){
        return toyStore.textToy();
    }
    public Toy raffleToysPr(){
        return toyStore.raffleToys();
    }
}

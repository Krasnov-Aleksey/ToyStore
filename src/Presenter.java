public class Presenter {
    ToyStore toyStore = new ToyStore();

    public void addToyPr(String nameToy,Double lossRate){
        toyStore.addToy(nameToy,lossRate);
    }

    // TODO delete
    public void printToyPr(){
        toyStore.printToy();
    }
    public StringBuilder textTopPr(){
        return toyStore.textToy();
    }
}

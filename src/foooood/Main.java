package foooood;

public class Main {
    public static void main(String[] args) {
        //Dynamisch = "List doubleLinkedList = new doubleLinkedList();"
        //Polymorphismus = "überladen oder überschreiben der Saucen-Klassenmethoden mit Nudeln
        String[] italien = {"Tomaten", "und" ,"Mark"};
        String[] greek = {"Knoblauch", "Joghurt", "Zwiebeln"};
        String[] realbeer = {"Hopfen", "Malz"};
        String[] nonAlc = {"Wasser", "Orange", "Pago"};
        Meal polo = (Bolognese) new Bolognese(italien);
        polo.addingredient("Sebastian");
        System.out.println(polo);
        Beverages beer = (Beer) new Beer(realbeer);
        beer.addingredient("Wasser");
        System.out.println(beer);
    }
}
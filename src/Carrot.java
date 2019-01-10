

public class Carrot extends Environment
{
    //TODO: Identifiziere Attribute, Methoden, Getter, Setter und Konstruktoren und markiere diese entsprechend durch Kommentare.
    private int weight;
   
    
    public Carrot(){
        this(5);
    }
    
    public Carrot(int weight){
        this.weight = weight;
        print(weight);
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}

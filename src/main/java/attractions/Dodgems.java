package attractions;
import people.Visitor;

import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }
    public double defaultPrice(){
        return 4.5;
    }
    public double priceFor(Visitor visitor){
        if(visitor.getAge()<=12){
            return 0.5*defaultPrice();
        }
        else return defaultPrice();
    }
}

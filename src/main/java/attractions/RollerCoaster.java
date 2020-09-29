package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisitor(Visitor visitor) {
        return visitor.getAge() >=12 && visitor.getHeight() >= 145;
    }
}

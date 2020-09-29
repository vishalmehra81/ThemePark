package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisitor(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }

    public double defaultPrice() {
        return 8.4;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return 2 * defaultPrice();
        } else return defaultPrice();
    }
}

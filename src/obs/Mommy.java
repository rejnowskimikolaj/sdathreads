package obs;

import java.util.Observable;
import java.util.Observer;

public class Mommy implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Baby){

            Baby cryingBaby = (Baby) o;
            System.out.println("oh no! My little "+cryingBaby.getName()+" is crying! :(");
        }
    }
}

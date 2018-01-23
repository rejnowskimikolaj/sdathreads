package obs;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.Observer;

public class Daddy implements Observer {


    @Override
    public void update(java.util.Observable o, Object arg) {
        if(o instanceof Baby){

            Baby cryingBaby = (Baby) o;
            System.out.println("shut up, "+cryingBaby.getName()+"!");
        }
    }
}

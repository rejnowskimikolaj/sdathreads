package obs;

import java.util.Observable;

public class Baby extends Observable {

    private String name;

    public Baby(String name) {
        this.name = name;
    }

    public void cry(){
        setChanged();
        notifyObservers("Bueeeeeee");
    }

    public String getName() {
        return name;
    }
}

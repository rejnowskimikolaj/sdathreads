package obs;

public class Main {
    public static void main(String[] args) {

        Baby baby1 = new Baby("Freddie");
        Baby baby2 = new Baby("Eddie");
        Baby baby3 = new Baby("Ed");

        Mommy mommy = new Mommy();
        Daddy daddy = new Daddy();
        baby1.addObserver(mommy);
        baby1.addObserver(daddy);
        baby2.addObserver(mommy);
        baby2.addObserver(daddy);
        baby3.addObserver(daddy);


        System.out.println("hitting: "+baby1.getName());
        baby1.cry();
        System.out.println("hitting: "+baby2.getName());
        baby2.cry();

        System.out.println("hitting: "+baby3.getName());
        baby3.cry();




    }
}

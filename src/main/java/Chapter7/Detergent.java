package Chapter7;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Chapter7.Cleanser x = new Chapter7.Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }
public class DetergentDelegation{
    private Cleanser cleanser = new Cleanser();

    //delegating methods
    public void append (String s){
        cleanser.append(s);
    }

    public void dilute(){
        cleanser.dilute();
    }

    public void apply(){
        cleanser.apply();
    }

    public void scrub(){
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }
}

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);

        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

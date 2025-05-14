package ZPracticePrograms.Strategy.Sundarvan;

interface Bite{
    public void bite();
}

interface Snake{
    public void performBite();
    public void setBiteBehaviour(Bite bite);
}

class Poisonous implements Bite{
    @Override
    public void bite() {
        System.out.println("Possonous bite");
    }
}

class NonPoisonuse implements Bite{
    @Override
    public void bite() {
        System.out.println("Non poisonous bite");
    }
}

class Python implements Snake{

    Bite bite;
    Python(){
        this.bite = new Poisonous();
    }

    @Override
    public void performBite() {
        System.out.print("Python has a "  );
        this.bite.bite();
    }

    @Override
    public void setBiteBehaviour(Bite bite) {
        this.bite = bite;
    }
}


public class Main {
    public static void main(String[] args) {
        Python python = new Python();
        python.performBite();
        python.setBiteBehaviour(new NonPoisonuse());
        python.performBite();
    }
}

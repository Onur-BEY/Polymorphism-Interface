public class Deneme1 implements Database{
   
    @Override
    public void add() {
        System.out.println("Mongo eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Mongo silindi.");
    }

    @Override
    public void get() {
        System.out.println("Mongo alindi.");
    }

    @Override
    public void update() {
        System.out.println("Mongo guncellendi.");
    }

    public void My(){
        System.out.println("My Mongo...");
    }
}

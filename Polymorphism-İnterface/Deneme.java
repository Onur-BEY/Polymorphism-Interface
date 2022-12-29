public class Deneme implements Database {

    @Override
    public void add() {
        System.out.println("Mysql eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Mysql silindi.");
    }

    @Override
    public void get() {
        System.out.println("Mysql alindi.");
    }

    @Override
    public void update() {
        System.out.println("Mysql guncellendi.");
    }
}

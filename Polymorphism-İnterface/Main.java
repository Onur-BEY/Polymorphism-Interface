public class algoritma {

    public static void Yazdir(Database d){
        d.add();
        d.delete();
        d.get();
        d.update();

        if (d instanceof Deneme1){
            ((Deneme1) d).My();
        }
    }

    public static void main(String[] args) {

        Database d1=new Deneme();
        Deneme1 d2=new Deneme1();

        Yazdir(d1);
        Yazdir(d2);
    }
}

public class Bear {

    String color;
    private Bear pandaBear;
    private void roar(Bear b) {
        System.out.println(color);
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;
        System.gc();
    }
}

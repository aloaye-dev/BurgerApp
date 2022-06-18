public class Hamburger {
    private int breadRoll;
    private int meat;
    private int  lettuce;
    private int carrot;
    private int tomato;

    private int totalPrice;

    public Hamburger(){
        this(20,30,10,20,5 );
    }

    public Hamburger(int breadRoll, int meat, int lettuce, int carrot, int tomato) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.lettuce = lettuce;
        this.carrot = carrot;
        this.tomato = tomato;

    }

    public int buyBurger(){
       return this.breadRoll +this.meat + this.lettuce + this.carrot + this.tomato;

    }


    public int getBreadRoll() {
        return breadRoll;
    }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getTomato() {
        return tomato;
    }
}

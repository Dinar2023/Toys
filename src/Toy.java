public class Toy {
    private int number;
    private String name;
    private double chance;
//    Toy (String name, int number, double chance){
//        this.name = name;
//        this.number = number;
//        this.chance = chance;
//    }

    void setNumber (int number){
        this.number = number;
    }

    void setChance (double chance){
        this.chance = chance;
    }
    void setName (String name){
        this.name = name;
    }




    String getName(){
        return this.name;
    }

    int getNumber(){
        return this.number;
    }

    double getChance(){
        return this.chance;
    }

    @Override
    public String toString() {

        return ("{" +
                "Имя =" + this.name +
                ", Колличество =" + this.number +
                ", Вероятность выпадения= " + this.chance +
                '}');
    }
}

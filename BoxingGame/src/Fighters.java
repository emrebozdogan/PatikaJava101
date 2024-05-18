public class Fighters {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighters(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighters foe){
        System.out.println("-----------");
        System.out.println(this.name + " => " + foe.name + " hit " + this.damage + " damage.");

        if(foe.dodge()){
            System.out.println(foe.name + " dodged the attack.");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }

        return foe.health - this.damage;
    }


    boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}

public class Ring {
    Fighters f1;
    Fighters f2;
    int minWeight;
    int maxWeight;

    Ring(Fighters f1, Fighters f2 ,int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    void Run() {
        if(checkWeight()){
            while (f1.health > 0 && f2.health > 0){
                System.out.println("------NEW ROUND------");
                if(whoStarts() == 1){
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }else{
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }
                printScore();
            }

        }else{
            System.out.println("Weights are not matching");
        }
    }

    boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(f1.health == 0){
            System.out.println(f2.name + " wins the match");
            return true;
        }
        if (f2.health == 0){
            System.out.println(f1.name + " wins the match");
            return true;
        }

        return false;
    }

    void printScore(){
        System.out.println("---------------");
        System.out.println(f1.name + " health: " + f1.health);
        System.out.println(f2.name + " health: " + f2.health);
    }

    int whoStarts(){
        int startChance;
        return startChance = Math.random() > 0.5 ? 1 : 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Fighters mAli = new Fighters("Muhammed Ali", 20, 100, 96, 50);
        Fighters mike = new Fighters("Mike Tyson", 20, 100, 95, 50);
        Ring r = new Ring(mAli, mike, 90, 100);

        r.Run();
    }
}

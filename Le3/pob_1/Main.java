public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun", 8, 10);
        Pandav bheem = new Pandav("Bheem", 5, 10);

        Kaurav duryodhan = new Kaurav("Duryodhan", 2, 3);
        Vikarn vikarn = new Vikarn("Vikarn", 8, 9);

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
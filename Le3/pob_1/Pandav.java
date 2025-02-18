class Pandav extends Bharatvanshi {
    String name;
    int kindness;
    int obedience;

    Pandav(String name, int kindness, int obedience) {
        this.name = name;
        this.kindness = kindness;
        this.obedience = obedience;
    }

    @Override
    void fight() {
        System.out.println(name + " is fighting.");
    }

    void obey() {
        System.out.println(name + " is obeying.");
    }

    void kind() {
        System.out.println(name + " is kind.");
    }
}

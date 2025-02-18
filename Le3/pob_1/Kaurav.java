class Kaurav extends Bharatvanshi {
    String name;
    int kindness;
    int obedience;

    Kaurav(String name, int kindness, int obedience) {
        this.name = name;
        this.kindness = kindness;
        this.obedience = obedience;
    }

    @Override
    void fight() {
        System.out.println(name + " is fighting.");
    }

    void disobey() {
        System.out.println(name + " is disobeying.");
    }

    void cruel() {
        System.out.println(name + " is cruel.");
    }
}
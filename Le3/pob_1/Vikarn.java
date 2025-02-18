class Vikarn extends Kaurav {

    Vikarn(String name, int kindness, int obedience) {
        super(name, kindness, obedience);
    }

    void fight() {
        System.out.println(name + " is fighting nobly.");
    }

    void obey() {
        System.out.println(name + " is obeying.");
    }

    void kind() {
        System.out.println(name + " is kind.");
    }
}
class Test implements Testable {
    
    public void display() {
        System.out.println("This is a display method from Test class.");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
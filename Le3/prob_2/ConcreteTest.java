class ConcreteTest extends AbsTest {

    public void display() {
        System.out.println("This is a display method from ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest obj = new ConcreteTest();
        
        obj.display();
    }
}
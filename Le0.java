/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Juet
{
    String name;
    int age;
    void setter1(String name){
        this.name = name;
    }
     void setter2(int age){
        this.age = age;
    }
    
    int getter1(){
        return this.age;
        
    }
    String getter2(){
        return this.name;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	   Juet student = new Juet() ;
	   student.setter1("late");
	   student.setter2(100);
	   System.out.println(student.getter1());
	   System.out.println(student.getter2());
	}
}

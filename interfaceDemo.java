// java program to implement interface
// Interface A
interface A {
    int x = 20;  
    void show(); // Abstract method
}

// Class B implements Interface A
class B implements A {
    int y = 30;  

    public void show() {
        System.out.println(x + y);  
    }
}

// Main class with main() method
public class interfaceDemo {
    public static void main(String[] args) {
        B ob = new B();   
        ob.show();        
    }
}

class Access {
    public String publicVar = "Public";
    private String privateVar = "Private";
    protected String protectedVar = "Protected";
    String defaultVar = "Default";

    // Public method to access privateVar
    public String getPrivateVar() {
        return privateVar;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Access obj = new Access();

        System.out.println(obj.publicVar);       
        System.out.println(obj.getPrivateVar()); 
        System.out.println(obj.protectedVar);    
        System.out.println(obj.defaultVar);     
    }
}


package Module_10_4;

public class MainClass {
    public static void main(String[] args) {
        Logics logics = new Logics();
        try{
            logics.f();
        }
        catch (TestException e){
            System.err.println(e.getMessage());
        }
    }
}

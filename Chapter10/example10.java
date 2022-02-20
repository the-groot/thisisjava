

public class example10 {
    public static void main(String args[]){
        System.out.println("엥");
        try{
            Class clazz=Class.forName("java.lang.String2");
        }
        catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

}

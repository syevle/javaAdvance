package javaPractice.temp;


public class Test {
    public static void main(String sa[]){

        try{
            System.out.println(Integer.parseInt(""));
        }catch (NumberFormatException ex){
            System.out.println("fails");
        }
    }
}

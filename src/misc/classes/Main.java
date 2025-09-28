package misc.classes;

public class Main {

    public static void main(String[] args) {
       Cookie cookieOne = new Cookie("green");
       Cookie cookieTwo = new Cookie("blue");

       cookieOne.setColor("Brown");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}

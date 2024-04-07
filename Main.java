import java.util.function.Function;

public class Main {
    public static void main(String... args){
        MyFunction myFunction = (myString) -> "Hello " + myString;

        String functionResult = myFunction.apply("World");


        System.out.println(functionResult);
        // Should print: Hello world
    }
}

interface MyFunction {
    /* blank */
}

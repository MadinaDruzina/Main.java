import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(zadanie(generateRandomAge(), 23));
        System.out.println(zadanie(generateRandomAge(), 10));
        System.out.println(zadanie(generateRandomAge(), 20));
        System.out.println(zadanie(generateRandomAge(), 20));
        System.out.println(zadanie(generateRandomAge(), 33));


    }
    public static int generateRandomAge(){
        Random vozrast = new Random();
        return vozrast.nextInt(100);

    }
    public static String zadanie(int age, int temperature) {


        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)

            return "Можно идти гулять";

        else if (age < 20 && temperature >= 0 && temperature <= 28)

            return "Можно идти гулять";

        else if (age > 45 && temperature >= -10 && temperature <= 25)

            return "Можно идти гулять";

        else

            return "Отсавайтесь дома";


    }
}


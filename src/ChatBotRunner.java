public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("Debbie", 10);

        debbie.greeting("Bejon");
        debbie.favoriteNumber(10);
        debbie.weather();

        double meters = debbie.convertFeetToMeters(30);
        System.out.println("There are " + meters + "in 30 feet");

        int sum = debbie.addNumbers(10, 20, 30);
        System.out.println("The sum is " + sum);

        String message = debbie.goodbye();
        System.out.println(message);

        debbie.random();
        int number = debbie.randomNum(26);
        System.out.println("My number is " + number);
    }
}

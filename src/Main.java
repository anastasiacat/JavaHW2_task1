public class Main {
    public static void main(String[] args) {
        int ticketCost = 15000; //стоимость билета
        int amountOfRubles = 20; //количество рублей для 1 бонусной мили

        int amountOfMiles = ticketCost/amountOfRubles;
        System.out.println("Количество начисленных миль за купленный билет = " + amountOfMiles);
    }
}
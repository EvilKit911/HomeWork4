public class Main {
    public static void main(String[] args) {

                        //Задание 1

        int age = 17; // любое значение
        if (age >= 18) {
            System.out.println(" Поздравляю с совршенолетием ");
        }
        else {
            System.out.println(" Совершенолетие ещё не наступило, подожди ещё =) ");
        }

        System.out.println(" ");

                        // Задание 2

        int age2 = 25; // любое значение

        if (age2 >= 7 & age2 <= 18) {
            System.out.println(" ребёнок ходит в школу  ");
        }
        else if (age2 >= 18 & age2 < 24) {
            System.out.println(" человек закончил школу и может отправляться в университет ");
        }
        else {
            System.out.println(" человек окончил университет и ему пора искать первую работу ");
        }

        System.out.println(" ");


                        // Задание 3

        int placesAll = 102;
        int seatingAll = 60;

        int people = 59; // любое значение

        if (people < 60) {
            int seating = seatingAll - people;
            System.out.println("в вагоне есть " + seating + " сидячих мест");
        }
        else if (people > 60 & people < 102) {
                int standing = placesAll - people;
                System.out.println("в вагоне есть " + standing + " стоячих мест");
        }
        else{
            System.out.println("в вагоне нет мест");
        }

        System.out.println(" ");

                    // Задание 4

        int age3 = 23; // любое знаечение

        if (age3 >= 2 & age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в детский сад");
        }
        else if (age3 >=7 & age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в школу");
        }
        else if (age3 >= 18 & age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить на работу");
        }

        System.out.println(" ");

                // Задание 5

        int age4 = 14;

        if (age4 <= 5){
            System.out.println(" Ребёнку нельзя кататься на атракционе ");
        }
        else if (age4 >5 & age4 <=14){
            System.out.println(" Ребёнку можно кататься на атракционе только в соправаждении взрослого");
        }
        else {
            System.out.println(" Ребёнку можно каться на атракционе ");
        }

        System.out.println(" ");

                // Задание 6
        int one = 19;
        int two = 34;
        int free = 55;

        if (one > two & one > free){
            System.out.println(" Первое число больше второго и третьего" );
        }
        else  if (two > one & two > free ) {
            System.out.println(" Второе число больше первого и третьего" );
        }
        else {
            System.out.println(" Третье число больше первого и второго");
        }



    }
}
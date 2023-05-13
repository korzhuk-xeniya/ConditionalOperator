public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 5;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, на улице холодно, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        float velocity = 59.9f;
        if ( velocity > 60) {
            System.out.println("Если скорость " + velocity + " км/ч, то придется платить штраф");
        } else {
            System.out.println("Если скорость " + velocity + " км/ч, то можно ездить спокойно");
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 61;
        if ( age < 2) {
            System.out.println("Если возраст человека равен " + age + " то ему пора спать");
        } else {
            if (age <= 6) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
            } else {
                if (age <= 18) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
                } else {
                    if (age < 24) {
                        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
                    } else {
                        if (age < 60) {
                            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
                        } else {
                            System.out.println("Если возраст человека равен " + age + " то ему можно отдохнуть");
                        }
                    }
                }
            }
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 24;
        boolean canNotRideAnAttraction = age < 5;
        boolean canRideAccompaniedByAdult =  age >= 5 && age < 14;
        if (canNotRideAnAttraction ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (canRideAccompaniedByAdult) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int people = 0;
        int seat = 60;
        int standingPlaces = wagonCapacity - seat;
        boolean noSeat = people >= seat && people < wagonCapacity;
        boolean thereAreSeat = people < seat;
        if (thereAreSeat) {
            System.out.println("В вагоне " + (seat - people) + " сидячих мест и  " + standingPlaces + " стячих мест");
        } else {
            if (noSeat) {
                System.out.println("В вагоне нет сидячих мест и есть " + (wagonCapacity - people) + " стячих мест");
            } else {
                System.out.println("В вагоне нет свободных мест");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
    }
    public static void task8 () {
        System.out.println("Задача 8");
    }
}
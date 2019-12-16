package homework_28;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть час відкриття кінотеатру: ");
        Time timeOpen = inputTime();
        System.out.println("Введіть час закриття кінотеатру: ");
        Time timeClose = inputTime();
        Cinema cinema = new Cinema(new TreeMap<>(), timeOpen, timeClose);

        showMenu();
        System.out.println("Введіть потрібний розділ меню: ");
        int choice = scan.nextInt();

        while (choice != 8) {
            switch (choice) {
                case 1:
                    Movie movie = inputNewMovie();
                    cinema.addMovie(movie);
                    break;
                case 2:
                    System.out.println("Введіть день, до якого хочете додати сеанс: ");
                    String day = scan.next();
                    Movie movie1 = inputNewMovie();
                    cinema.addMovie(movie1);
                    System.out.println("Введіть час початку фільму: ");
                    Time timeOfStart = inputTime();
                    Seance seance = new Seance(movie1, timeOfStart);
                    if (timeOfStart.getHour() < cinema.getOpen().getHour()
                            || timeOfStart.getHour() > cinema.getClose().getHour()) {
                        System.out.println("Кінотеатр буде закритий.");
                    } else {
                        cinema.addSeance(seance, day);
                    }
                    break;
                case 3:
                    Movie movie3 = Main.inputNewMovie();
                    cinema.removeMovie(movie3);
                    break;
                case 4:
                    System.out.print("Введіть день, з якого хочете видалити сеанс:");
                    String day1 = scan.next();
                    Movie movie2 = inputNewMovie();
                    System.out.println("Введіть час початку фільму: ");
                    Time timeOfStart2 = inputTime();
                    cinema.removeSeance(new Seance(movie2, timeOfStart2), day1);
                    break;
                case 5:
                    cinema.showAllMoviesLibrary();
                    break;
                case 6:
                    System.out.print("Введіть день:");
                    String day2 = scan.next();
                    cinema.showScheduleOfTheDay(day2);
                    break;
                case 7:
                    cinema.showAllSchedule();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");

            }
            System.out.println("Введіть потрібне число: ");
            showMenu();
            choice = scan.nextInt();
        }

    }

    private static void showMenu() {
        System.out.println("\t1. Додати фільм до фільмотеки.");
        System.out.println("\t2. Додати сенанс до розкладу.");
        System.out.println("\t3. Видалити фільм.");
        System.out.println("\t4. Видалити сеанс.");
        System.out.println("\t5. Вивести список усіх фільмів.");
        System.out.println("\t6. Вивести розклад фільмів на день.");
        System.out.println("\t7. Вивести весь розклад.");
        System.out.println("\t8.Вийти");
    }

    private static Time inputTime() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Години: ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.println("Хвилини: ");
        int min = Integer.parseInt(scanner.nextLine());
        return new Time(hour, min);
    }

    public static Movie inputNewMovie() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фільму");
        String titleOfMovie = scanner.next();
        Time durationOfMovie = inputTimeDuration();

        return new Movie(titleOfMovie, durationOfMovie);
    }

    public static Time inputTimeDuration() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тривалість фільму");
        System.out.println("Години: ");
        int hour = scanner.nextInt();
        System.out.println("Хвилини: ");
        int min = scanner.nextInt();

        return new Time(hour, min);
    }

}

public class Main {

    public static void main(String[] args) {
        // Creating the first athlete thread
        AtheleteThread firstAthlete = new AtheleteThread(84291);
        AtheleteThread secondAthlete = new AtheleteThread(43114);

        System.out.println(firstAthlete.getName());
        System.out.println(secondAthlete.getName());

        // Starting the threads
        firstAthlete.start();
        secondAthlete.start();
    }
}
mport java.util.Random;
import java.util.Scanner;
public class Alliloaxiologisi1 {

    public static void main(String[] args) {
        while (true){
            String gameDescription = "Καλώσηρθατε.\nΠροσπαθείτε να μαντέψετε έναν τυχαίο αριθμό από το 1 έως το 100 με όσο το δυνατόν λιγότερες προσπάθειες.\n"+
                    "Έχεις 10 απόπειρες. Καλή τύχη.";
            System.out.println(gameDescription);
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            boolean playAgain =true;
            int tryCounter = 0;
            int randomNumber = random.nextInt(100);
            while (tryCounter<10 && playAgain==true) {
                System.out.println("Δώσε έναν αριθμό μεταξύ 1 και 100:" + "My number is: "+randomNumber);
                try {
                    String input = scan.next();
                    int userInput = Integer.parseInt(input);
                    tryCounter += 1;
                    if (userInput > 0 && userInput <= 100) {
                        if (userInput < randomNumber) {
                            System.out.println(userInput + " είναι χαμηλό. Ξαναπροσπάθησε!");
                        } else if (userInput > randomNumber) {
                            System.out.println(userInput + " είναι υψηλό. Ξαναπροσπάθησε!");
                        } else {
                            System.out.println("Συγχαρητήρια! Βρήκες τον αριθμό μετά από " + tryCounter + " προσπάθειες! Σκορ: "
                                    + (10 - tryCounter) + "\n" + "Θα ήθελες να ξαναπαίξεις (ν/ο)?");
                            String answer = scan.next();
                            if (answer.startsWith("ο") || answer.startsWith("o") || answer.startsWith("Ο") || answer.startsWith("O")) {
                                System.out.println("Ευχαριστούμε! Καλή συνέχεια.");
                                playAgain=false;
                                break;
                            }
                            while (!answer.startsWith("ν") && !answer.startsWith("n") && !answer.startsWith("N") && !answer.startsWith("Ν")){
                                System.out.println("Παρακαλώ απαντήστε με 'ν' ή 'ο'. Ευχαριστώ.");
                                answer = scan.next();
                            }
                            playAgain=true;
                        }
                    } else System.out.println("Ο αριθμός που δώσατε δεν βρίσκεται στο εύρος 1-100.\n Προασπαθήστε ξανά");
                } catch (Exception e) {
                    System.out.println("Δεν ηταν εγκυρη η εισαγωγή σας." + e);
                }
            }
            if(tryCounter<10) break;
            System.out.println("Κρίμα! Δεν κατάφερες να βρεις τον αριθμό μετά από 10 προσπάθειες! " +
                                "Σκορ: 0 \nΘα ήθελες να ξαναπαίξεις (ν/ο)?");
            String answer = scan.next();
            if (answer.startsWith("ο") || answer.startsWith("o") || answer.startsWith("Ο") || answer.startsWith("O"))
                {
                    System.out.println("Ευχαριστούμε! Καλή συνέχεια.");
                    break;
                }
            while (!answer.startsWith("ν") && !answer.startsWith("n") && !answer.startsWith("N") && !answer.startsWith("Ν")){
                System.out.println("Παρακαλώ απαντήστε με 'ν' ή 'ο'. Ευχαριστώ.");
                answer = scan.next();
            }
            tryCounter=10;
        }
    }

}

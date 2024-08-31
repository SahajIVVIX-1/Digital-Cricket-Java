import java.util.Random;
import java.util.Scanner;

public class DigitalCricketWorld {

        // Random functions variables
        private static int r1, r2, r3, r4, r5;

        // Tie variables
        private static int l1, l2, l3, l4, l6, l7, l8;

        // Match 1 variables
        private static int s1, s2, s3, s4, s5, s6, s7, s8;

        // Match 2 variables
        private static int t1, t2, t3, t4, t5, t6, t7, t8;

        private static Random random = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
                System.out.println("\n*** Welcome to the Digital Cricket World ***\n");
                matchCoin();
        }

        private static int randomNum() {
                return random.nextInt(11);
        }

        private static void compHorT() {
                r2 = random.nextInt(2);
                if (r2 == 0) {
                        System.out.println("Computer Choose Batting");
                } else {
                        System.out.println("Computer Choose Bowling");
                }
        }

        private static void coinComp() {
                r1 = random.nextInt(2);
                if (r1 == 0) {
                        System.out.println("Coin tossed by Computer and Head came");
                } else {
                        System.out.println("Coin tossed by Computer and Tail came");
                }
        }

        private static void matchTie() {
                int i = 1;

                while (i < 7) {
                        l3 = getUserInput("Enter your number : ");

                        if (l3 < 0 || l3 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(0);
                        }

                        System.out.println("Computer turn to Bat ...");
                        l1 = randomNum();
                        System.out.println("Computer Hitted : " + l1);
                        l2 += l1;

                        if (l3 != l1) {
                                System.out.println("Computer Total Score : " + l2 + "\n");
                                i++;
                        } else {
                                l4 = l2 - l1 + 1;
                                System.out.println("\nComputer got Out by Score : " + (l4 - 1));
                                System.out.println("Your Target Score : " + l4 + "\n");
                                System.out.println("Now, It's Your turn to Bat ...\n");
                                break;
                        }
                }

                while (i < 7) {
                        l8 = getUserInput("Enter your number : ");

                        if (l8 < 0 || l8 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(0);
                        }

                        l6 += l8;

                        t5 = randomNum();
                        System.out.println("Computer Hitted : " + t5);

                        if (l6 >= l4) {
                                System.out.println("Your Total Score : " + l6 + "\n");
                                System.out.println("*** You Won the Match ***");
                                System.exit(0);
                        } else if (t5 != l8) {
                                System.out.println("Your Total Score : " + l6 + "\n");
                                i++;
                        } else if (t5 == l8) {
                                l7 = l6 - l8 + 1;
                                if (l6 > l4) {
                                        System.out.println("Your Total Score : " + l7 + "\n");
                                        System.out.println("*** You Won the Match ***");
                                        System.exit(0);
                                } else if (l6 < l4) {
                                        System.out.println("Your Total Score : " + (l7 - 1) + "\n");
                                        System.out.println("*** Computer Won the Match ***");
                                        System.exit(0);
                                } else {
                                        System.out.println("Your Total Score : " + (l7 - 1) + "\n");
                                        System.out.println("*** It's Tie ***\n");
                                        matchTie();
                                }
                        } else {
                                System.exit(0);
                        }
                }
        }

        private static void matchCoin() {
                System.out.println("It's time for Coin tossing ...");
                r4 = getUserInput("Choose Head[0] or Tail[1] : ");

                if (r4 == 0) {
                        System.out.println("You Chose Head\n");
                } else if (r4 == 1) {
                        System.out.println("You Chose Tail\n");
                } else {
                        System.out.println("Enter Proper Head or Tail\n");
                        System.exit(0);
                }

                coinComp();

                if (r4 == r1) {
                        System.out.println("You Won the Toss\n");
                        r5 = getUserInput("Choose Batting[0] or Bowling[1] : ");
                        if (r5 == 0) {
                                System.out.println("You Choose Batting\n");
                                match1();
                        } else if (r5 == 1) {
                                System.out.println("You Choose Bowling\n");
                                match2();
                        } else {
                                System.out.println("Enter Proper Number\n");
                                System.exit(0);
                        }
                } else {
                        System.out.println("You Lost the Toss\n");
                        r2 = random.nextInt(2);
                        if (r2 == 0) {
                                System.out.println("Computer Choose Batting\n");
                                match2();
                        } else {
                                System.out.println("Computer Choose Bowling\n");
                                match1();
                        }
                }
        }

        private static void match1() {
                System.out.println("Your Turn to Bat ...");
                int n = 1;
                int i = 0;

                s2 = 0;
                while (i < n) {
                        s1 = getUserInput("Enter your number : ");

                        if (s1 < 0 || s1 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(1);
                        }

                        s2 += s1;

                        s3 = randomNum();
                        System.out.println("Computer Hitted : " + s3);

                        if (s3 != s1) {
                                System.out.println("Your Total Score : " + s2 + "\n");
                                n++;
                        } else {
                                s7 = s2 - s1 + 1;
                                System.out.println("\nYou Got Out by Score : " + (s7 - 1));
                                System.out.println("Computer Target Score : " + s7 + "\n");
                                System.out.println("Now, It's Computer turn to Bat...\n");
                                break;
                        }
                }

                while (i < n) {
                        s4 = getUserInput("Enter your number : ");

                        if (s4 < 0 || s4 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(1);
                        }

                        s5 = randomNum();
                        s6 += s5;
                        System.out.println("Computer Hitted : " + s5);

                        if (s6 >= s7) {
                                System.out.println("Computer Total Score : " + s6 + "\n");
                                System.out.println("*** Computer Won the Match ***");
                                System.exit(1);
                        } else if (s5 != s4) {
                                System.out.println("Computer Total Score : " + s6 + "\n");
                                n++;
                        } else if (s5 == s4) {
                                s8 = s6 - s5 + 1;
                                if (s6 > s7) {
                                        System.out.println("Computer Total Score : " + s8 + "\n");
                                        System.out.println("*** Computer Won the Match ***");
                                        System.exit(1);
                                } else if (s6 < s7) {
                                        System.out.println("Computer Total Score : " + (s8 - 1) + "\n");
                                        System.out.println("*** You Won the Match ***");
                                        System.exit(1);
                                } else {
                                        System.out.println("Computer Total Score : " + (s8 - 1) + "\n");
                                        System.out.println("*** It's Tie ***");
                                        matchTie();
                                }
                        } else {
                                System.exit(1);
                        }
                }
        }

        private static void match2() {
                System.out.println("Computer Turn to Bat ...");
                int n = 1;
                int i = 0;

                t2 = 0;
                while (i < n) {
                        t1 = getUserInput("Enter your number : ");

                        if (t1 < 0 || t1 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(2);
                        }

                        t3 = randomNum();
                        System.out.println("Computer Hitted : " + t3);

                        t2 += t3;

                        if (t3 != t1) {
                                System.out.println("Computer Total Score : " + t2 + "\n");
                                n++;
                        } else {
                                t4 = t2 - t3 + 1;
                                System.out.println("\nComputer Got Out by Score : " + (t4 - 1));
                                System.out.println("Your Target Score : " + t4 + "\n");
                                System.out.println("Now, It's Your turn to Bat...\n");
                                break;
                        }
                }

                while (i < n) {
                        t6 = getUserInput("Enter your number : ");

                        if (t6 < 0 || t6 >= 11) {
                                System.out.println("Please enter a proper number between (0 to 10)");
                                System.exit(2);
                        }

                        t7 = randomNum();
                        t8 += t7;
                        System.out.println("Computer Hitted : " + t7);

                        if (t8 >= t4) {
                                System.out.println("Your Total Score : " + t8 + "\n");
                                System.out.println("*** You Won the Match ***");
                                System.exit(2);
                        } else if (t7 != t6) {
                                System.out.println("Your Total Score : " + t8 + "\n");
                                n++;
                        } else if (t7 == t6) {
                                t8 = t8 - t6 + 1;
                                if (t8 > t4) {
                                        System.out.println("Your Total Score : " + t8 + "\n");
                                        System.out.println("*** You Won the Match ***");
                                        System.exit(2);
                                } else if (t8 < t4) {
                                        System.out.println("Your Total Score : " + (t8 - 1) + "\n");
                                        System.out.println("*** Computer Won the Match ***");
                                        System.exit(2);
                                } else {
                                        System.out.println("Your Total Score : " + (t8 - 1) + "\n");
                                        System.out.println("*** It's Tie ***");
                                        matchTie();
                                }
                        } else {
                                System.exit(2);
                        }
                }
        }

        private static int getUserInput(String prompt) {
                System.out.print(prompt);
                while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear the invalid input
                        System.out.print(prompt);
                }
                return scanner.nextInt();
        }
}

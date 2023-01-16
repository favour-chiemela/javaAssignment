package BigProject;

import java.util.Scanner;

public class Nokia {
    private int userInput;
    Scanner input = new Scanner(System.in);

    public String displayMenu() {
        return """
                Welcome!!!
                Enter 1-> Phonebook
                Enter 2-> Messages
                Enter 3-> Chat
                Enter 4-> Call register
                Enter 5-> Tones
                Enter 6-> Settings
                Enter 7-> Call divert
                Enter 8-> Games
                Enter 9-> Calculator
                Enter 10-> Reminders
                Enter 11-> Clock
                Enter 12-> Profile
                Enter 13-> Sim service
                """;

    }

    public void selectMenu() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                phoneBook();
                break;
            case 2:
                messageMenu();
                break;
            case 3:
                chatMenu();
                break;
            case 4:
                callRegMenu();
                break;
            case 5:
                TonesMenu();
                break;
            case 6:
                Settings();
                break;
            case 8:
                Games();
                break;
            case 9:
                calculator();
                break;
            case 10:
                Reminder();
                break;
            case 11:
                clock();
                break;
            default:
                System.out.println("Invalid input");
                optionsCondition();


        }
    }


    public void phoneBook() {
        System.out.println("""
                Enter 1-> search
                Enter 2-> service number
                Enter 3-> Add contact
                Enter 4-> Erase contact
                Enter 5-> Edit contact
                Enter 6-> Assign tone
                Enter 7-> Send card
                Enter 8-> options
                Enter 9-> Speed dial
                Enter 10-> Voice tag
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Search");
                phoneBookCondition();
                break;
            case 2:
                System.out.println("Service number");
                phoneBookCondition();
                break;
            case 3:
                System.out.println("Add contact name");
                phoneBookCondition();
                break;
            case 4:
                System.out.println("Erase contact");
                phoneBookCondition();
                break;
            case 5:
                System.out.println("Edit contact");
                phoneBookCondition();
                break;
            case 6:
                System.out.println("Assign tone");
                phoneBookCondition();
                break;
            case 7:
                System.out.println("Send b card");
                phoneBookCondition();
                break;
            case 8:
                System.out.println("""
                        1-> type of view
                        2-> m=emory status""");
                phoneBookCondition();
                break;
            case 9:
                System.out.println("Speed dial");
                phoneBookCondition();
                break;
            case 10:
                System.out.println("Voice tag");
                phoneBookCondition();
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    public void messageMenu() {
        System.out.println("""
                Enter 1-> Write Message
                Enter 2-> Inbox
                Enter 3-> Outbox
                Enter 4-> Picture message
                Enter 5-> Template
                Enter 6-> Smiley
                Enter 7-> Message settings
                Enter 8-> Info service
                Enter 9-> Voice mailbox number
                Enter 10-> Service command editor
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Type your message");
                messageCondition();
                break;
            case 2:
                System.out.println("You have 25 inbox");
                messageCondition();
                break;
            case 3:
                System.out.println("You have no outbox");
                messageCondition();
                break;
            case 4:
                System.out.println("Picture Message");
                messageCondition();
                break;
            case 5:
                System.out.println("Template");
                messageCondition();
                break;
            case 6:
                System.out.println("Smiley");
                messageCondition();
                break;
            case 7:
                System.out.println("""
                        Enter 1-> Set 1
                        Enter 2-> Common
                        """);
                messageCondition();
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                Enter
                                1-> Message Center number
                                2-> Message sent as
                                3-> Message Validity
                                """);
                        messageCondition();
                        break;
                    case 2:
                        System.out.println("""
                                Enter
                                1-> Delivery report
                                2-> Via same center
                                3-> Character support""");
                        messageCondition();
                }
                break;
            case 8:
                System.out.println("Info service number");
                messageCondition();
                break;
            case 9:
                System.out.println("Voice mailbox number");
                messageCondition();
                break;
            case 10:
                System.out.println("Service command editor");
                messageCondition();
                break;
            default:
                System.out.println("Invalid number");
                messageCondition();

        }
    }


    public void chatMenu() {
        System.out.println("""
                Enter
                1-> 2go chat
                2-> Facebook chat
                """);
    }

    public void callRegMenu() {
        System.out.println("""
                Enter
                 1-> Missed calls
                 2-> Received calls
                 3-> Dialled number
                 4-> Erase recent call list
                 5-> Show call duration
                 6-> Show call cost
                 7-> Call cost settings
                 8-> Prepaid credit
                 """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println(" Missed calls: You have 10 missed calls");
                callRegisterCondition();
                break;
            case 2:
                System.out.println("Received calls: Your received call 50");
                callRegisterCondition();
                break;
            case 3:
                System.out.println("Dialled number");
                callRegisterCondition();
                break;
            case 4:
                System.out.println("Erase recent call list");
                callRegisterCondition();
                break;
            case 5:
                System.out.println("""
                        Enter
                        1-> Last call duration
                        2-> All calls duration
                        3-> Receive call duration
                        4-> Dialled call duration
                        5-> Clear timers
                        """);
                callRegisterCondition();
                break;
            case 6:
                System.out.println("""
                        Enter
                        1-> Last call cost
                        2-> All call cost
                        3-> Clear counters
                        """);
                callRegisterCondition();
                break;
            case 7:
                System.out.println("""
                        Enter
                        1-> Call cost limit
                        2-> Show call cost in
                        """);
                callRegisterCondition();
                break;
            case 8:
                System.out.println("Prepaid credit");
                callRegisterCondition();
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    public void TonesMenu() {
        System.out.println("""
                Enter 1-> Ringing tone
                2-> Ringing volume
                3-> Incoming call alert
                4-> Composer
                5-> Message alert tone
                6-> Keyboard tone
                7-> Warning and game tone
                8-> Vibrating alert
                9-> Screen alert
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("""
                        Enter
                        1-> Funk me part
                        2-> Blues harp
                        3-> Chinese moon
                        4-> Trip hop
                        """);
                toneMenuCondition();
                break;
            case 2:
                System.out.println("Increase volume/ Decrease volume");
                toneMenuCondition();
                break;
            case 3:
                System.out.println("""
                        Enter
                        1-> Phone on vibration
                        2-> Phone on silent
                        3-> General
                        """);
                toneMenuCondition();
                break;
            case 4:
                System.out.println("composer");
                toneMenuCondition();
                break;
            case 5:
                System.out.println("""
                        Enter
                        1-> Tone 1
                        2-> Tone 2
                        3-> Tone 3
                        4-> Tone 4
                        """);
                toneMenuCondition();
            case 6:
                System.out.println("""
                        Funk me part
                        2-> Blues harp
                        3-> Chinese moon
                        4-> Trip hop
                        """);
                toneMenuCondition();
                break;
            case 7:
                System.out.println("""
                        Enter
                        1-> This tone
                        2-> Sweet tone
                        3-> Dirty tone
                        4-> Ugly tone
                        """);
                toneMenuCondition();
                break;
            case 8:
                System.out.println("Has been set to vibration");
                toneMenuCondition();
                break;
            case 9:
                System.out.println("Screen alert");
                toneMenuCondition();
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    public void Settings() {
        System.out.println("Your call is diverting");
    }

    public void Games() {
        System.out.println("""
                Enter
                1-> Sudoku
                2-> Snake""");
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("sudoku game is ready: Enjoy!!!");
                gameMenuCondition();
                break;
            case 2:
                System.out.println("snake game is ready: Enjoy!!!");
                gameMenuCondition();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void calculator() {
        System.out.println("""
                Enter
                1-> Addition
                2-> Subtraction
                3-> Division
                4-> Multiplication
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Total is 100");
                calculatorMenuCondition();
                break;
            case 2:
                System.out.println("Total is sum1 - 2= 80");
                calculatorMenuCondition();
                break;
            case 3:
                System.out.println("Total is sum1 / 2= 50");
                calculatorMenuCondition();
                break;
            case 4:
                System.out.println("Total is sum1 * 2= 200");
                calculatorMenuCondition();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void Reminder() {
        System.out.println("""
                Enter
                1-> Set reminder alert
                2-> Set alarm alert
                3-> Set due date
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("You have to study on 16th");
                reminderMenuCondition();
                break;
            case 2:
                System.out.println("You are to wake up by 5:00am");
                reminderMenuCondition();
                break;
            case 3:
                System.out.println("The date is 16th-12-2023");
                reminderMenuCondition();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void clock() {
        System.out.println("""
                Enter
                1-> Alarm clock
                2-> Clock settings
                3-> Date settings
                4-> stopwatch
                5-> Countdown timer
                6-> Auto update for date and time
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Set alarm clock");
                clockMenuCondition();
                break;
            case 2:
                System.out.println("Set clock settings");
                clockMenuCondition();
                break;
            case 3:
                System.out.println("Date settings");
                clockMenuCondition();
                break;
            case 4:
                System.out.println("Stopwatch");
                clockMenuCondition();
                break;
            case 5:
                System.out.println("Countdown Timer");
                clockMenuCondition();
                break;
            case 6:
                System.out.println("Date and time has been updated");
                clockMenuCondition();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    String userChoice;
    public void optionsCondition() {

        do {
            System.out.println("Do you want to continue? Yes/No");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("yes")) {
               System.out.println(displayMenu());
               selectMenu();
            System.out.println("Do you want to continue? Yes/No");
           } else if (userChoice.equalsIgnoreCase("no")) {
               System.out.println("Thank you for choosing nokia");
           } else {
               System.out.println("Invalid input");
           }
       } while (userChoice.equals("yes"));

    }


    public void messageCondition() {
        System.out.println("Enter 1 to go back to message menu or 2 for main menu");
        userInput = input.nextInt();
        if (userInput == 1) {
            messageMenu();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
            selectMenu();
        } else {
            System.out.println("Invalid input");
        }
    }

    public void phoneBookCondition() {
        System.out.println("Enter 1 to go back to Phone book menu or 2 for main menu");
        userInput = input.nextInt();
        if (userInput == 1) {
            phoneBook();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
            selectMenu();
        } else {
            System.out.println("Invalid input");
        }


    }

    public void chatCondition() {
        System.out.println("Enter 1 to go back to chat menu or 2 for main menu");
        userInput = input.nextInt();
        if (userInput == 1) {
            chatCondition();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
            selectMenu();
        } else {
            System.out.println("Invalid input");
        }
    }

    public void callRegisterCondition() {
        System.out.println("Enter 1 to go back to call reg menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            callRegMenu();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }
    }

    public void toneMenuCondition() {
        System.out.println("Enter 1 to go back to tone menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            TonesMenu();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }
    }

    public void gameMenuCondition() {
        System.out.println("Enter 1 to go back to game menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            Games();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }
    }

    public void calculatorMenuCondition() {
        System.out.println("Enter 1 to go back to calculator menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            calculator();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }

    }

    public void reminderMenuCondition() {
        System.out.println("Enter 1 to go back to reminder menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            Reminder();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }
    }

    public void clockMenuCondition() {
        System.out.println("Enter 1 to go back to clock menu or 2 for main");
        userInput = input.nextInt();
        if (userInput == 1) {
            clock();
        } else if (userInput == 2) {
            System.out.println(displayMenu());
        } else {
            System.out.println("Invalid input");
        }
    }
}
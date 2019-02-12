import java.util.ArrayList;
import java.util.Scanner;

class myClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Choose a theme out of school, speech, grinch");

        String theme = sc.nextLine();

        if(theme.equals("school") ||
                theme.equals("grinch") ||
                theme.equals("speech")){
            if(theme.equals("school")){
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a verb");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a verb");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());

                System.out.println("Our school cafeteria has really " + words.get(0) + " food. Just thinking about it" +
                        " makes my stomach " + words.get(1) + ".");
                System.out.println("The spaghetti is " + words.get(2) + " and tastes like " +
                        words.get(3) + ". One day, I swear one of my meatballs started to " + words.get(4) + "!");
                System.out.println("The turkey tacos are totally " + words.get(5) + " and look kind of like old " + words.get(6) + ". ");
                System.out.println("My dad said he'd make my lunches, but the first day, he made me a sandwich out of "
                        + words.get(7) + " and peanut butter! I'd think I'd rather take my chances with the cafeteria!");
            }

            if(theme.equals("speech")){
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());

                System.out.println("Ladies and gentlemen, on this " + words.get(0) + " occasion it is a privilege to address" +
                        " such a/an " + words.get(1) + "-looking group of " + words.get(2) + ".");
                System.out.println("I can tell from your smiling " + words.get(3) + " that you will support my " + words.get(4)
                        + " program in the coming election.");
                System.out.println("I promise that, if elected, there will be a/an " + words.get(5) + " in every " + words.get(6) +
                        " and two " + words.get(7) + " in every garage.");
            }

            if(theme.equals("grinch")){
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a color");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter an animal");
                words.add(sc.nextLine());
                System.out.println("Enter a verb");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a verb ending in -ing");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());

                System.out.println("The Grinch is a/an " + words.get(0) + " creature with " + words.get(1) + " eyes who does not" +
                        " like Christmas cheer.");
                System.out.println("When he sees people celebrating Christmas, it makes him " + words.get(2) + ".");
                System.out.println("He and his " + words.get(3) + " Max try to " + words.get(4) + " Christmas for people in the town" +
                        " of " + words.get(5) + "-ville by " + words.get(6) + " their Christmas " + words.get(7) + ".");
            }
        }else{
            System.out.println("Please run the program again and choose one out the three themes");
        }
    }
}

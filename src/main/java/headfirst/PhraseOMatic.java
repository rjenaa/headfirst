package headfirst;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"bombshell", "disillusion", "epiphany"
                , "eureka", "fortune", "godsend", "kick"
                , "marvel", "portent", "prodigy", "start"};
        String[] wordListTwo = { "exulting", "felicity", "mirth"
                , "prize", "rapture", "treasure", "treat"
                , "good humor", "pride", "joy"};
        String[] wordListThree = {"explication", "the ticket", "unraveling"
                , "solving", "unfolding", "solution", "Band-Aid"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] +
                " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
        }

}

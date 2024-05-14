package Hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Владимир","Иванов",Gender.MALE);
        Buyer buyer2 = new Buyer("Алла","Чижик",Gender.FEMALE);
        Buyer buyer3 = new Buyer("Владимир","Трясков",Gender.MALE);
        Buyer buyer4 = new Buyer("Инна","Федотова",Gender.FEMALE);
        Buyer buyer5 = new Buyer("Владимир","Иванов",Gender.MALE);
        List<Buyer> buyer = new ArrayList<>();
        buyer.add(buyer1);
        buyer.add(buyer2);
        buyer.add(buyer3);
        buyer.add(buyer4);
        buyer.add(buyer5);
        System.out.println(buyer);
       celebrate(buyer);

    }
    private static final Parties today = Parties.NONE;
    private static void celebrate(List<Buyer> buyer){
        for (int i = 0; i <buyer.length ; i++) {
            switch (today){
                case NEW_YEAR-> System.out.println(buyer[i].gender + ", HAPPY NEW YEAR!");
                case MARCH_8 -> {
                    if (buyer[i].gender == Gender.FEMALE ){System.out.println(buyer[i].name + ", happy march 8th!");
                    }
                }case FEB_23 -> {
                    if (buyer[i].gender==Gender.MALE){
                        System.out.println(buyer[i].name + ", happy February 23rd!");
                    }
                }default -> System.out.println(buyer[i].name + ", celebrate this morning!");
            }

        }
    }
}

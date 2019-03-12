package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 90)
            return Answers.LATER;
        else if (prob < 120)
            return Answers.SOON;
        else if (prob < 150)
            return Answers.NEVER;
        else
            return  Answers.NO;
    }
}

public class AskMe {

    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Answer is NO");
                break;
            case YES:
                System.out.println("Answer is YES");
                break;
            case MAYBE:
                System.out.println("Answer is MAYBE");
                break;
            case NEVER:
                System.out.println("Answer is NEVER");
                break;
            case SOON:
                System.out.println("Answer is SOON");
                break;
            case LATER:
                System.out.println("Answer is LATER");
                break;
            default:
                System.out.println("No Answer");

        }
    }
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

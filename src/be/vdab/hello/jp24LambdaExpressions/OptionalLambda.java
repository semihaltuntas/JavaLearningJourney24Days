package be.vdab.hello.jp24LambdaExpressions;

import java.util.Optional;

public class OptionalLambda {
//    private static Integer eersteCijfer(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            char teken = string.charAt(i);
//            if (Character.isDigit(teken)) {
//                return Character.getNumericValue(teken);
//            }
//        }
//       return null;
//    }
//// Je krijgt hier een NullPointerException: je kan null niet vermenigvuldigen met 10.
//    public static void main(String[] args) {
//        System.out.println(eersteCijfer("abss5") * 10);
//        System.out.println(eersteCijfer("wrong") * 20);
//    }

    private static Optional<Integer> eersteCijfer(String string) {
        for (int i = 0; i < string.length(); i++) {
            char teken = string.charAt(i);
            if (Character.isDigit(teken)) {
                return Optional.of(Character.getNumericValue(teken));
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        //1. yol
//        var optionalCijfer = eersteCijfer("all4u");
//        if (optionalCijfer.isPresent()) {
//            System.out.println(optionalCijfer.get() * 10);
//        }
        //met Lambda
        eersteCijfer("all4youé").ifPresent(cijfer -> System.out.println(cijfer * 10));


        //2.yol
//        optionalCijfer = eersteCijfer("Wrong Bro!");
//        if (optionalCijfer.isPresent()){
//            System.out.println(optionalCijfer.get()*10);
//        }
        //met Lambda
        eersteCijfer("Wrong").ifPresent(cijfer -> System.out.println(cijfer * 20));


    }

}

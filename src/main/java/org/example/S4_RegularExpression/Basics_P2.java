package org.example.S4_RegularExpression;

public class Basics_P2 {
    //Character classes \w, \d
    // \s, \W, \D, \S
    // \w - word character [a-zA-Z0-9_]
    // \d - digit character [0-9]
    // \s - whitespace character [\t\n\r\f\v]
    // \W - non-word character [^a-zA-Z0-9_]
    // \D - non-digit character [^0-9]
    // \S - non-whitespace character [^ \t\n\r\f\v]
    // \b - word boundary
    // \B - non-word boundary
    // \A - beginning of string
    // \Z - end of string
    // \G - match the end of the previous match, \s, \W, \D, \S
    public static void main(String... args){
        var possibilities = new String[]{"cat", "Cat", "_at", "___", "9at","$at",".at"};
        var regExp = "\\wat";
        for(var a: possibilities){
            System.out.println(STR."Matching \{a} with \{regExp}, results in \{a.matches(regExp)}");
        }
//        Matching cat with \wat, results in true
//        Matching Cat with \wat, results in true
//        Matching _at with \wat, results in true
//        Matching ___ with \wat, results in false
//        Matching 9at with \wat, results in true
//        Matching $at with \wat, results in false
//        Matching .at with \wat, results in false

        System.out.println("=".repeat(40));
        regExp = "\\w\\w\\w";
        for(var a: possibilities){
            System.out.println(STR."Matching \{a} with \{regExp}, results in \{a.matches(regExp)}");
        }
//        Matching cat with \w\w\w, results in true
//        Matching Cat with \w\w\w, results in true
//        Matching _at with \w\w\w, results in true
//        Matching ___ with \w\w\w, results in true
//        Matching 9at with \w\w\w, results in true
//        Matching $at with \w\w\w, results in false
//        Matching .at with \w\w\w, results in false

        System.out.println("=".repeat(40));
        //regexp for matching phone-number
        regExp = "\\d{3}-\\d{3}-\\d{4}";
        var phNum = "321-333-7652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321-333-7652 with \d{3}-\d{3}-\d{4}, results in true
        System.out.println("=".repeat(40));

        //what is the number had periods in place of hyphens?
        phNum = phNum.replace("-",".");
        regExp = regExp.replace("-","[-.]");
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321.333.7652 with \d{3}[-.]\d{3}[-.]\d{4}, results in true

        System.out.println("=".repeat(40));
        //Allowing the possibility of having a space, hypen, a comma, or a dot in place of just a hypen
        regExp = regExp.replace("[-.]","[-.,\\s]");
        phNum = "321 333,7652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321 333,7652 with \d{3}[-.,\s]\d{3}[-.,\s]\d{4}, results in true

        System.out.println("=".repeat(40));
        //Adjusting for the possibility of having multiple spaces in between the numbers
        phNum ="321    333,7652";
        //the '+' after [] says 1 or more
        regExp = regExp.replace("[-.,\\s]","[-.,\\s]+");
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321    333,7652 with \d{3}[-.,\s]+\d{3}[-.,\s]+\d{4}, results in true

        phNum = "321333,7652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321333,7652 with \d{3}[-.,\s]+\d{3}[-.,\s]+\d{4}, results in false

        System.out.println("=".repeat(40));
        //Now, '+' stands for 1 or more, what if we want to safeguard against the possibility of 0 or more
        regExp = regExp.replace("+","*");
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321333,7652 with \d{3}[-.,\s]*\d{3}[-.,\s]*\d{4}, results in true

        phNum = "3213337652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 3213337652 with \d{3}[-.,\s]*\d{3}[-.,\s]*\d{4}, results in true

        phNum = "321    333 7652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321    333 7652 with \d{3}[-.,\s]*\d{3}[-.,\s]*\d{4}, results in true

        System.out.println("=".repeat(40));
        //Now '+' stands for 1 or more, '*' stands for 0 or more, we also have '?' which stands for 0 or 1
        regExp = regExp.replace("*","?");

        phNum = "3213337652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 3213337652 with \d{3}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        phNum = "321,3337652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321,3337652 with \d{3}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        phNum = "321  3337652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321  3337652 with \d{3}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in false

        System.out.println("=".repeat(40));
        //Modifying the quantifier, so that we can have 3 or 4 digits in the first group
        regExp = "\\d{3,4}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}";
        phNum = "3213 3371652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 3213 3371652 with \d{3,4}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        phNum = "321 337-1652";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321 337-1652 with \d{3,4}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        phNum = "32 337-6512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 32 337-6512 with \d{3,4}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in false

        phNum = "32134 3376521";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 32134 3376521 with \d{3,4}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in false

        System.out.println("=".repeat(40));
        //Modifying the quantifier, so that we can have atleast 3 digits in the first group
        regExp = "\\d{3,}[-.,\\s]?\\d{3}[-.,\\s]?\\d{4}";
        phNum = "3213 3376512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 3213 3376512 with \d{3,}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        phNum = "32 3376521";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 32 3376521 with \d{3,}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in false

        phNum = "32132321 3376521";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 32132321 3376521 with \d{3,}[-.,\s]?\d{3}[-.,\s]?\d{4}, results in true

        System.out.println("=".repeat(40));
        //grouping expression using round-brackets
        regExp = "(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        phNum = "321 3376512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321 3376512 with (\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "321 6512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321 6512 with (\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "6512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 6512 with (\d{3}[-.,\s]?){1,2}\d{4}, results in false

        System.out.println("=".repeat(40));
        //grouping expression using round-brackets and adding another section to the phone number
        regExp = "(\\d[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        phNum = "1.321 3376512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 1.321 3376512 with (\d[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "321 3376512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 321 3376512 with (\d[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "1.312.1234";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 1.312.1234 with (\d[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "5.312.1234";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 5.312.1234 with (\d[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in true

        System.out.println("=".repeat(40));
        //grouping expression using round-brackets and adding a hardcoded section to the phone number
        regExp = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        phNum = "1.321 3376512";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 1.321 3376512 with (1[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in true

        phNum = "5.312.1234";
        System.out.println(STR."Matching \{phNum} with \{regExp}, results in \{phNum.matches(regExp)}");
        //Matching 5.312.1234 with (1[-.,\s]?)?(\d{3}[-.,\s]?){1,2}\d{4}, results in false







    }
}

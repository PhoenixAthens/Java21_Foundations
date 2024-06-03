package org.example.S4_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup_P1 {
    public static void main(String... args){
        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        String phNum = "232.333.2365";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phNum);
        //Above pattern and matcher pattern is basically a more formal way of doing
        //phNum.matches(regex)

        //Now when we use "phNum.matches(regex)" we are basically checking if there is a match
        //but what about extracting the matched groups?
        //To do that we use the "matcher.group()" method.
        //When we use capture groups like "(1[-.,\\s]?)" in "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}"
        //we can use matcher.group() method to extract the information that was captured by
        //these groups later on! This can be done like so:
        if(matcher.matches()){
            System.out.println(matcher.group(1));  //null, because "(1[-.,\s]?)" didn't have anything to match to
            //1 here refers to pattern matched by capture group (1[-.,\s]?)
            System.out.println(matcher.group(2)); //333.
            //2 here refers to pattern matched by capture group (\d{3}[-., \s]?){1,2}

            //System.out.println(matcher.group(2)); //333. because when we have a capture group like "(\\d{3}[-.,\\s]?){1,2}"
            //and there are multiple values that can be captured by the capture, the first one gets ignored
            //thus if we want to use capture groups to extract values we must write
            //(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4} in its long form as
            //(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{3}[-.,\\s]?)?\\d{4}
        }

        regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{3}[-.,\\s]?)?\\d{4}"; //this won't allow us extract values from "\\d{4}"
        //thus we must modify the "\\d{4}" into a capture group like so
        regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{4})";
        phNum = "1.321.333.1234";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(matcher. group(0)); //1.321.333.1234
            System.out.println(matcher.group(1)); //1
            System.out.println(matcher.group(2)); //321
            System.out.println(matcher.group(3)); //333
            System.out.println(matcher.group(4)); //1234
        }

        //Above pattern and matcher pattern is basically a more formal way of doing
        //phNum.matches(regex


    }
}

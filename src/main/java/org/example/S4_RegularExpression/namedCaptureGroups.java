package org.example.S4_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class namedCaptureGroups {
    public static void main(String... args){
        String regex = "(\\d{1,2}[-.,\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)(\\d{4})";
        String phNum = "12.123.222.4901";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(matcher.group(0));   //12.123.222.4901
            System.out.println(matcher.group(1));   //12.
            System.out.println(matcher.group(2));   //123.
            System.out.println(matcher.group(3));   //222.
            System.out.println(matcher.group(4));   //4901
        }

        //creating capture Groups within capture groups
        regex = "((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(STR."Capture group at index 0: \{matcher.group(0)}");    //12.123.222.4901
            System.out.println(STR."Capture group at index 1: \{matcher.group(1)}");    //12.
            System.out.println(STR."Capture group at index 2: \{matcher.group(2)}");    //12
            System.out.println(STR."Capture group at index 3: \{matcher.group(3)}");    //123.
            System.out.println(STR."Capture group at index 1: \{matcher.group(4)}");    //123
            System.out.println(STR."Capture group at index 1: \{matcher.group(5)}");    //222.
            System.out.println(STR."Capture group at index 1: \{matcher.group(6)}");    //222
            System.out.println(STR."Capture group at index 1: \{matcher.group(7)}");    //4901
        }

        //ignoring certain capture groups
        regex = "(?:(\\d{1,2})[-.,\\s]?)?(?:(\\d{3})[-.,\\s]?)(?:(\\d{3})[-.,\\s]?)(\\d{4})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(matcher.group(0));   //12.123.222.4901
            System.out.println(matcher.group(1));   //12
            System.out.println(matcher.group(2));   //123
            System.out.println(matcher.group(3));   //222
            System.out.println(matcher.group(4));   //4901
        }

        //simplifying above code
        regex = "(?:(\\d{1,2})[-.,\\s]?)?(\\d{3})[-.,\\s]?(\\d{3})[-.,\\s](\\d{4})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(matcher.group(0));   //12.123.222.4901
            System.out.println(matcher.group(1));   //12
            System.out.println(matcher.group(2));   //123
            System.out.println(matcher.group(3));   //222
            System.out.println(matcher.group(4));   //4901
        }

        //named capture groups
        regex = "(?:(?<countryCode>\\d{1,2})[-.,\\s]?)?(?<areaCode>\\d{3})[-.,\\s]?(?<exchange>\\d{3})[-.,\\s](?<lineNum>\\d{4})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(phNum);
        if(matcher.matches()){
            System.out.println(matcher.group(0));   //12.123.222.4901
            System.out.println(matcher.group("countryCode"));   //12
            System.out.println(matcher.group("areaCode"));   //123
            System.out.println(matcher.group("exchange"));   //222
            System.out.println(matcher.group("lineNum"));   //4901
        }


    }
}

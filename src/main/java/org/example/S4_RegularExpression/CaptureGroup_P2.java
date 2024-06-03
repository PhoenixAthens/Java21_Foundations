package org.example.S4_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroup_P2 {
    public static void main(String... args){
        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{3}[-.,\\s]?)?(\\d{4})";
        //Now to make our regex, such that we can extract the phone number without the
        //separating spaces, period, and all that jazz, we must create capture groups, within our capture groups, like so
        regex = "((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        //we have modified our regex to allow 2-digit country code
        //Now in our regex, the capture groups will be number like this:
        //"((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        //((\d{1,2})[-.,\s]?) - This is capture 'group 1'
        //Within the above capture group, we have another capture group, "(\d{1,2})" this is numbered 'group 2'

        //((\d{3})[-.,\s]?) - This is capture 'group 3'
        //Within the above capture group, we have another capture group, "(\d{3})" this is numbered 'group 4'

        //((\d{3})[-.,\s]?) - This is capture 'group 5'
        //Within the above capture group, we have another capture group, "(\d{3})" this is numbered 'group 6'

        //(\d{4}) - This is capture 'group 7'

        String phNum = "12.232.333.2365";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phNum);

        if(matcher.matches()){
            System.out.println(matcher.group(1));//12.
            System.out.println(STR."The Country Code is \{matcher.group(2)}");//The Country Code is 12
            System.out.println(matcher.group(3));//232.
            System.out.println(STR."The Area Code is \{matcher.group(4)}");//The Area Code is 232
            System.out.println(matcher.group(5));//333.
            System.out.println(STR."The Exchange is \{matcher.group(6)}");//The Exchange is 333
            System.out.println(STR."The Line number is \{matcher.group(7)}");//The Line number is 2365
        }
    }
}

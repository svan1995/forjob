package swordoffer.Coll41_66;

public class P52 {
    public boolean match(char[] str, char[] pattern)
    {
        String string = String.valueOf(str);
        String patternString = String.valueOf(pattern);
        return string.matches(patternString);
    }
}

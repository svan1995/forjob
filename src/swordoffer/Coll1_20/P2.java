package swordoffer.Coll1_20;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class P2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        int length = str.length();
        for(int i = 0; i<length; i++) {
            if(str.charAt(i) == ' ') {
                result.append("%20");
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}

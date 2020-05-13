package swordoffer.Coll41_66;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class P49 {
    public int StrToInt(String str) {

        int result = 0;
        int flag = 1;
        if(str.equals("")){
            return 0;
        }
        if(str.charAt(0) == '+'){
            if(str.length() == 1){
                return 0;
            }
            str = str.substring(1);
        }
        if(str.charAt(0) == '-'){
            if(str.length() == 1){
                return 0;
            }
            str = str.substring(1);
            flag = -1;
        }



        for(int i=0;i<str.length();i++){
            if(isIllegal(str.charAt(i)) == false ){
                return 0;
            }
            int x = charToNum(str.charAt(i));
            result =result * 10 + x;

        }
        return flag * result;

    }

    private boolean isIllegal(char c) {
        int x = c -'0';
        if(x >=0 && x<10){
            return true;
        }
        return false;
    }

    private int charToNum(char c){
        int x = c - '0';
        return x;
    }
}

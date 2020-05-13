package suanfa;

public class MaxChildStr {


    public static void main(String[] args) {
        String str1 = "acbcbcef";
        String str2 = "abcbced";
        System.out.println(getMaxChildStr(str1, str2));
    }

    public static String getMaxChildStr(String str1, String str2){
        int[][] array = new int[str1.length()][str2.length()];
        int maxCount = 0;
        int endI = 0;
        for (int i=0; i<str1.length(); i++){
            for (int j=0; j<str2.length(); j++){
                if (str2.charAt(j) == str1.charAt(i)){
                    if (i==0 || j==0){
                        array[i][j] = 1;
                    }
                    else {
                        array[i][j] = array[i-1][j-1] + 1;
                    }
                    if (array[i][j] > maxCount){
                        maxCount = array[i][j];
                        endI = i;
                    }
                }
                else {
                    array[i][j] = 0;
                }
            }
        }
        return str1.substring(endI-maxCount+1,endI+1);
    }

}

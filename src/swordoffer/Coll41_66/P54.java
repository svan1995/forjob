package swordoffer.Coll41_66;

import java.util.Scanner;

public class P54 {

    StringBuilder sb = new StringBuilder();
    int[] hash = new int[256];

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        hash[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i=0; i<sb.length();i++){
            if(hash[sb.charAt(i)] == 1){
                return sb.charAt(i);
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        P54 p54 = new P54();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        for (int i=0; i<s.length();i++){
            p54.Insert(s.charAt(i));
        }

        System.out.println(p54.FirstAppearingOnce());


    }

}

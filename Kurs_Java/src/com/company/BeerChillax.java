package com.company;

public class BeerChillax {
    public static void main(String[] args) {
        int countHappy = 0;
        for (int i = 0; i < 999_999; i++) {
            String iS = Integer.toString(i);
            int needZero = 6 - iS.length();
            String buf = "";
            for (int j = 0; j < needZero; j++)
                buf += "0";
            buf += iS;
            iS = buf;

            char[] elements = iS.toCharArray();
            if (elements[0] + elements[1] + elements[2] == elements[3] + elements[4] + elements[5])
                countHappy++;
        }
        System.out.println("Count of happy: " + countHappy);
    }
}

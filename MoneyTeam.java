/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyteam;

import java.util.*;

/**
 *
 * @author vidv
 */
public class MoneyTeam {

    /**
     * @param args the command line arguments
     */
    public static HashMap<Integer, String> generateDenominations() {
        HashMap<Integer, String> denominations = new HashMap<Integer, String>();
        denominations.put(1, "");
        denominations.put(100, "hundred");
        denominations.put(1000, "thousand");
        denominations.put(100000, "lakh");
        denominations.put(10000000, "crore");
        return denominations;
    }

    public static String convertToWords(int number) {
        String[] uptoNineteen = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", " twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String word = "";
        HashMap<Integer, String> denominations = generateDenominations();
        
        
        return "";
    }
    
    public static Long[] getRupeesAndPaise(String number) {
        Long[] values = new Long[2];
        StringTokenizer st = new StringTokenizer(number, ".");
       // values[0] = Long.parseLong(st.nextToken());
       // values[1] = Long.parseLong(st.nextToken());
        int i = 0;
        
        while(i < 1) {
            values[i] = Long.parseLong(st.nextToken());
        }
        
        if (values.length == 1) {
            values[1] = 0L;
        }
        
        
        return values;
    }

    public static void main(String[] args) {
        Double num = Double.parseDouble("123");
        Long[] values = getRupeesAndPaise(num.toString());
        System.out.println(values.length);
        System.out.println(values[1]);
        
    }

}

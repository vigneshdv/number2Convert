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
        
        
    }

    public static void main(String[] args) {
        double inputValue = "123456.78";
        

    }

}

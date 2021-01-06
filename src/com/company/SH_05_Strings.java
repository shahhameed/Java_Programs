package com.company;

public class SH_05_Strings {
    public static void main(String[] args) {
        String name = "SHAH";
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     SHAH     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,4));

        //System.out.println(name.replace('A', 'S'));
        //System.out.println(name.replace("S", "HA"));

        //System.out.println(name.startsWith("SHA"));
        //System.out.println(name.endsWith("HAHA"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "SHAHAHAHAHAH";
        //System.out.println(modifiedName.indexOf("HAH"));
        //System.out.println(modifiedName.indexOf("HAH", 3));
        //System.out.println(modifiedName.lastIndexOf("HAH", 7));

        //System.out.println(name.equals("SHAH"));
        System.out.println(name.equalsIgnoreCase("ShAH"));

        System.out.println("I am escape sequence\tdouble quote");




    }
}

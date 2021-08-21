package com.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {

    public boolean vowels(String[] vowels){
        boolean isTrue = false;
        List<String> myVowelsList = Arrays.asList(vowels);
        List<String> theVowels = new ArrayList<String>();
        theVowels.add("a");
        theVowels.add("e");
        theVowels.add("i");
        theVowels.add("o");
        theVowels.add("u");

        try{
            if(myVowelsList.containsAll(theVowels)){
                isTrue = true;
            }
        } catch(Exception e){
            throw e;
        }
        return isTrue;
    }
}

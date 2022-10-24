package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryUsingHashMap {
    private HashMap<String,String> dictionary;

    DictionaryUsingHashMap(){

        dictionary = new HashMap<>();
        addWord("family" ,"everything");
        addWord("diva","sdfdsf");
        addWord("om","first" );
        addWord("shiva"," alphabate" );
        addWord("vira"," letter " );
        addWord("ab","jay" );
        addWord("pink","code" );
        addWord("pk","soham" );
        addWord("k","first letter " );
        addWord("b","second" );
        addWord("ac","vish" );
        addWord("mb","megabyte" );




    }
    public boolean addWord(String word,String meaning){
        dictionary.put(word,meaning);
        return true;
    }
    public  String findMeaning(String word){
        if(!dictionary.containsKey(word)){
            return "Given word not found";
        }
        else{
            return dictionary.get(word);
        }
    }
}

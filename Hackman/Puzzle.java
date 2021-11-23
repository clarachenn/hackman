import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    
    private String guess;
    private String word;
    private String guessedLetters;
    private String line;
                            
                            
    public Puzzle() {
        word = "christmas";
        line = "_________";
        guessedLetters = "";
    }
    
    public boolean isUnsolved() {
        if (line.equals(word)) return false;
        else return true;
        
    }
   
    public void show() {
        System.out.println("     " + line + "\n");
        System.out.println(guessedLetters);
    }
    
    public boolean makeGuess(String guessedLetter) {
        guessedLetters += guessedLetter + ", ";
        boolean letterFound = false;
        
        for(int i = 0; i < word.length(); i++) {
            if (word.substring(i, i+1).equals(guessedLetter)) {
                line = line.substring(0, i) + guessedLetter + line.substring(i+1);
                letterFound = true;
            }
        } 
        
        if(letterFound)return true;
        else return false;
    }
    
    public String getWord() {
        return word;
    }
}
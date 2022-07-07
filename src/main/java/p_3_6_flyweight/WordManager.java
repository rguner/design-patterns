package p_3_6_flyweight;

import java.util.ArrayList;
import java.util.List;

public class WordManager {

    private static final WordManager manager = new WordManager();
    public WordManager() { }
    public static WordManager instance() {
        return manager;
    }

    private static List<Word> wordList = new ArrayList<>();

    private static Word[][] document = new Word[20][20];

    public static Word getWord( String word  ) {
        Word w = null;
        boolean status = false;
        for ( Word item : wordList ) {
            if ( item.getWord().equals(word) ) {
                w = item;
                status = true;
                break;
            }
        }
        if ( status == false ) {
            w = new Word( word );
            wordList.add( w );
        }
        return w;
    }

    public void addLine( String line, int indexLine ) {
        for (int i = 0; i < line.length(); i++) {
            String word = line.substring( i, i + 1 );
            document[indexLine][i] = getWord(word);
        }
    }

    public static void getAllWord() {
        for (int i = 0; i < document.length; i++) {
            if ( document[i] != null ) {
                for ( Word itm : document[i] ) {
                    if ( itm == null ) break;
                    System.out.println( itm.getWord() + " - " + itm.hashCode() );
                }
            }
        }
    }

}

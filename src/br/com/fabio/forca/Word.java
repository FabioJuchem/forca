package br.com.fabio.forca;

import java.util.ArrayList;
import java.util.List;

public class Word {

    String word;

    List<String> characters = new ArrayList<>();

    List<String> hideWord = new ArrayList<>();

    public Word() {
    }

    public Word(String word, List<String> lines, List<String> characters) {
        this.word = word;
        this.hideWord = lines;
        this.characters = characters;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        splitWord("");
        hideNewWord();
    }

    public List<String> getHideWord() {
        return hideWord;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public boolean containCharacter(String character) {
        return this.characters.stream().anyMatch(x -> x.equalsIgnoreCase(character));
    }

    public void showCharacters(String character) {
        var positions = getCharacterPosition(character);
        positions.forEach(x -> this.hideWord.set(x, this.characters.get(x)));
    }

    private void splitWord(String regex) {
        var length = this.word.split(regex).length;
        for(int i = 0; i < length; i++) {
            this.characters.add(this.word.split(regex)[i]);
            this.hideWord.add(this.word.split(regex)[i]);
        }
    }

    private void hideNewWord() {
        this.getHideWord().replaceAll(x -> x = "_");
    }

    private List<Integer> getCharacterPosition(String character) {
        List<Integer> positions = new ArrayList<>();
        var lenght = this.characters.size();
        for(int i = 0; i < lenght; i++) {
            if (character.equalsIgnoreCase(this.characters.get(i))) {
                positions.add(i);
            }
        }
        return positions;
    }

}

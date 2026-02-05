package dashwood.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Section {
    private int sentences;
    private int characters;
    private int words;

    private List<Section> sections = new ArrayList<>();

    public void addSection(Section section) {
        sections.add(section);
    }

    public List<Section> getSections() {
        return Collections.unmodifiableList(sections);
    }

    public int getSentences() {
        int total = sentences;
        for(Section section : sections) {
            total += section.getSentences();
        }
        return total;
    }

    public int getCharacters() {
        int total = characters;
        for(Section section : sections) {
            total += section.getCharacters();
        }
        return total;
    }

    public int getWords() {
        int total = words;
        for(Section section : sections) {
            total += section.getWords();
        }
        return total;
    }

    public void addSentences(int count) {
        sentences += count;
    }

    public void addCharacters(int count) {
        characters += count;
    }

    public void addWords(int count) {
        words += count;
    }
}

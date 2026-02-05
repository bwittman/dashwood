package dashwood.model;

public class SectionName {
    public enum Numbering {
        ARABIC,
        LOWERCASE_ROMAN,
        UPPERCASE_ROMAN,
        MIXED_CASE_ROMAN,
        LOWERCASE_LATIN,
        UPPERCASE_LATIN,
        MIXED_CASE_LATIN
    }

    private final String readableName;
    private final String actualName;
    private final boolean caseSensitive;
    private final Numbering numbering;
    private final Character separator; // can be null

    public SectionName(String readableName, String actualName, boolean caseSensitive, Numbering numbering, Character separator) {
        this.readableName = readableName;
        this.actualName = actualName;
        this.caseSensitive = caseSensitive;
        this.numbering = numbering;
        this.separator = separator;
    }
}

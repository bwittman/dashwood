package dashwood.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Document extends Section {
    private Path path;
    private List<SectionName> sectionNames = new ArrayList<>();
    private Map<String, List<WordInformation>> wordInformation = new TreeMap<>();


}

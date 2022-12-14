package chapter18.ex32;

import chapter18.Person;
import chapter18.TextFile;

import nu.xom.Document;
import nu.xom.Element;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex32 {
    // Produce an XML Element from this Map.Entry object:
    static Element getXML(Map.Entry<String,Integer> me) {
        Element record = new Element("record");
        Element word = new Element("word");
        word.appendChild(me.getKey());
        Element freq = new Element("frequency");
        freq.appendChild(me.getValue().toString());
        record.appendChild(word);
        record.appendChild(freq);
        return record;
    }
    public static void main(String[] args) throws Exception {
        Map<String,Integer> wordsStat = new HashMap<>();
        for(String word :
                new TextFile("chapter18\\ex32\\Ex32.java", "\\W+")) {
            Integer freq = wordsStat.get(word);
            wordsStat.put(word, freq == null ? 1 : freq + 1);
        }
        Element root = new Element("words");
        for(Map.Entry<String,Integer> me : wordsStat.entrySet())
            root.appendChild(getXML(me));
        Document doc = new Document(root);
        Person.format(System.out, doc);
        Person.format(
                new BufferedOutputStream(new FileOutputStream(
                        "WordsInfo.xml")), doc);
    }
}

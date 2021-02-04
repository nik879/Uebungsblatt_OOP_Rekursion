import java.util.ArrayList;

public class Folder extends FSEntry {
    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }

    public int getSize() {
        int size=0;
        for (FSEntry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    public void print() {
        for (FSEntry entry : entries) {
            System.out.println(entry.getName());
        }
    }
}

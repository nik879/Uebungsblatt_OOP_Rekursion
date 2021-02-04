import java.util.ArrayList;

public class DemoFS {
    public static void main(String[] args) {
        Folder Programme = new Folder("Windows");
        Folder Windows = new Folder("Windows");
        File Office = new File("Office", "exe", 20);
        File TS = new File("Teamspeak", "exe", 80);
        Programme.addEntry(Windows);
        Programme.addEntry(Office);
        Programme.addEntry(TS);
        Programme.print();
        System.out.println(Programme.getSize());
    }

}

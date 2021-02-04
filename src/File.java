public class File extends FSEntry {
    protected String extension;
    protected int size;

    public File(String name, String extension, int size) {
        super(name);
        this.extension = extension;
        this.size = size;
    }

    @Override
    public String getName() {
        return super.getName()+"."+extension;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(getName());
    }
}


import java.io.File;


/**
 *
 * @author Sami
 */
public class Disk {
    
    private long totalspace;
    private long usablespace;
    private long freespace;
    
    // Palauttaa levyn C kokonaistilan
    public long getTotalSpace() {
        File disk = new File("C:");
        this.totalspace = disk.getTotalSpace() / (1024*1024);
        return this.totalspace;
    }
    
    
    // Palauttaa levyn C käytettävän tilan
    public long getUsableSpace() {
        File disk = new File("C:");
        this.usablespace = disk.getUsableSpace() / (1024*1024);
        return this.usablespace;
    }
    
    // Palauttaa levyn C vapaan tilan
    public long getFreeSpace() {
        File disk = new File("C:");
        this.freespace = disk.getFreeSpace() / (1024*1024);
        return this.freespace;
    }
}

package interfaccia;

import java.util.Date;

public interface File {

    public abstract String getName();
    public abstract int getSize();
    public abstract Date getCreationDate();
    public abstract void printStructure();
    
}

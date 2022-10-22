import java.util.ArrayList;
import java.util.List;

public class DataMrg {
    List<IInputOutput> iolist;
    private static DataMrg instance = null;

    private DataMrg(){
        iolist = new ArrayList<>();
    }

    public synchronized static DataMrg getInstance(){
        if(instance == null){
            instance = new DataMrg();
        }
        return instance;
    }

    public List<IInputOutput> getIolist() {
        return iolist;
    }

    public void setIolist(List<IInputOutput> iolist) {
        this.iolist = iolist;
    }

    public static void setInstance(DataMrg instance) {
        DataMrg.instance = instance;
    }


}

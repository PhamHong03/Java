package lesson1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {

    public static List<Character> clist = new ArrayList<>();
    public static List<Integer> indexList = new ArrayList<>();
    static String code;
    private Date registeredDate;

    public Ticket(){

    }

    public Ticket(String code, Date registeredDate) {
        this.code = code;
        this.registeredDate = registeredDate;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getCode() {
        return code;
    }
    public static void autoGenerateCode(){
          autoGenerateCharacter();
          code = "";
          for(int i=0;i<indexList.size();i++){
              int currentIndex = indexList.get(i);
              code += String.valueOf(clist.get(currentIndex));
          }
          int lastIndex = indexList.size()-1;
          indexList.set(lastIndex,indexList.get(lastIndex+1));
          for(int i = indexList.size()-1;i>=0;i--){
              if(indexList.get(i) < clist.size()){
                  break;
              }
              indexList.set(i,0);
              indexList.set(i-1,indexList.get(i-1)+1);
          }
    }
    private static void autoGenerateCharacter(){
        if(clist.size() >0) return ;
        for(int i = (int)'a';i<=(int)'z';i++){
            clist.add((char) i);
        }
//        for(int i = (int)'A';i<=(int)'Z';i++){
//            clist.add((char) i);
//        }
        for(int i=(int)'0';i<=(int)'9';i++){
            clist.add((char)i);
        }

        for(int i=0;i<indexList.size();i++){
            indexList.add(0);
        }
    }
}

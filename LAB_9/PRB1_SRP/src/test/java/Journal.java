import java.util.List;

public class Journal {
    public Journal(){

    }

    List<String> entries;
    public void addEntry(String entry){
        entries.add(entry);
    }
    public void addEntries(List<String>list){
        for(String s:list){
            entries.add(s);
        }
    }
    public void removeEntry(String s){
        for(String ele:entries){
            if(s.equals(ele)){
                entries.remove(ele);
            }
        }
    }
    public String toString(){
        return entries.get(1);
    }
}

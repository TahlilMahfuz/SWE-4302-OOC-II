import java.util.*;

public class JournalDB {
    public JournalDB(){
        journal=new HashMap<>();
    }
    Map<String, List<String>>journal;
    public void save(String journalname,String entry){
        if(journal.containsKey(journalname)){
            journal.get(journalname).add(entry);
        }
        else{
            journal.put(journalname, Collections.singletonList(entry));
        }
    }
    public void save(String s,List<String> list){
        if(journal.containsKey(s)){
            for(String ele:list){
                journal.get(s).add(ele);
            }
        }
        else{
            journal.put(s,list);
        }
    }
    public List<String> load(String s){
        return journal.get(s);
    }
}

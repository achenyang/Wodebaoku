import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 阳 on 2015/11/7.
 */
public class HashTableDemo {
    public static void main(String[] args){
        Hashtable map=new Hashtable();
        map.put(1,"北京");
        map.put("1","上海");
        map.put(5,"广州");
        map.put(3,"西安");
        map.put(1,"武汉");
        map.put(2,"广州");
        map.put("2","难上");
        Set Keys=map.keySet();
        Iterator it= Keys.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj+"="+map.get(obj));
    }
}
}

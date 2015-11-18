import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by �� on 2015/11/7.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap map=new LinkedHashMap();
        map.put(1,"北京");
        map.put("1","上海");
        map.put(5,"广州");
        map.put(3,"西安");
        map.put(null,"武汉");
        map.put(2,null);
        map.put(null,null);
        Set Keys=map.keySet();
        Iterator it= Keys.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj+"="+map.get(obj));
    }
}}

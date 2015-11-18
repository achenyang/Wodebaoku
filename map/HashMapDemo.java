import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by �� on 2015/11/7.
 */
public class HashMapDemo {
    public static void main(String[] args){
        HashMap map=new HashMap();
        map.put(1,"北京");
        map.put("1","上海");
        map.put(5,"广州");
        map.put(3,"西安");
        map.put(null,"武汉");
        map.put(2,null);

        Set Keys=map.keySet();
        Iterator it= Keys.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj+"="+map.get(obj));
        }
        map.remove("1","上海");
        it= Keys.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj+"="+map.get(obj));
    }
        map.replace(2,null,"乐亭");
        it= Keys.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj+"="+map.get(obj));
        }
       System.out.println( map.containsKey(1));
        System.out.println(map.containsValue("乐亭"));
    }
}

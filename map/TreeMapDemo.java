import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by 阳 on 2015/11/7.
 */
public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap map=new TreeMap();
        map.put(2,"北京");
        map.put(4,null);
        map.put(1,"山海");
        map.put(5,"广州");
        map.put(3,"西安");
        map.put(6,"滚蛋");
        Set Keys=map.keySet();
        Iterator it=Keys.iterator();
        while(it.hasNext()){
            Object ob=it.next();
            System.out.println(ob+"="+map.get(ob));
        }
    }

}

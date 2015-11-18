import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 阳 on 2015/11/8.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("南山");
        list.add("重邮");
        list.add(234);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator tt=list.iterator();
        while(tt.hasNext()){
            System.out.println(tt.next());
        }
       System.out.println(list.contains(234));
       System.out.println(list.lastIndexOf(123));
        list.remove(3);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.clear();
       System.out.println(list.hashCode());
    }
}

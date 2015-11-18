import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by 阳 on 2015/11/8.
 */
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(123);
        list.add("北京");
        list.add(3.1415);
        Iterator t=list.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
        //与ArayList用法基本相同。下面是不同的两个地方。
        list.addFirst("这是放在第一的位置");
        list.addLast("这是放在最后的位置");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
       System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}

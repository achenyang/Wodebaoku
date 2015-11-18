/**
 * Created by 阳 on 2015/11/15.
 */
public class MyroomThread extends Thread {
    static MyroomThread zhangsan=new MyroomThread("张三");
    static MyroomThread lisi=new MyroomThread("李四");
    private String name;
    static Object toliet=new Object();
    MyroomThread(String name){
        this.name=name;
    }
    public void run(){
        try {
            synchronized (toliet) {
                if (this.name.equals("张三")) {
                    this.brush();
                    toliet.wait();
                    this.release();
                    toliet.notify();
                } else {
                    this.brush();
                    toliet.notify();
                    toliet.wait();
                    this.release();
                }
            }
        }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    public void brush() throws Exception
    {
        System.out.println(this.name+"正在刷牙");
        Thread.sleep(2000);
        System.out.println(this.name+"刷完牙离开");
    }
    public void release() throws Exception
    {
        System.out.println(this.name+"正在小便");
        Thread.sleep(2000);
        System.out.println("小便完离开");
    }
}

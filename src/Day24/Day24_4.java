package Day24;

/**
 * AutoCloseable自动关闭支持
 */
class M implements AutoCloseable{
    public M(){
        System.out.println("创建一条新消息");
    }
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseable自动关闭方法");
    }
    public void print(){
        System.out.println("www.bit.java");
    }
}
public class Day24_4 {
    public static void main(String[] args) {
        try (M m = new M();){
            m.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

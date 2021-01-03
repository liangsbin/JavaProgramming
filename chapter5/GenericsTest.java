public class GenericsTest {
    public static void main(String[] args) {
        CachePool<String> p = new CachePool<String>();
        p.save("hello");
        System.out.println(p.get());

        print("hello");
        print(3.1222);
        print(new Integer(200));
    }

    public static <T> void print(T obj){
        System.out.println(obj);
    }

}

class CachePool<T>{
    T obj;
    void save(T i){
        obj = i;
    }

    T get(){
        return  this.obj;
    }

}

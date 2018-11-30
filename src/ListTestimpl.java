import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ListTestimpl<T> implements ListTestInterface<T> {
    public List<T> myTest2(T a) {
        List<T> lists=new ArrayList<>();
        lists.add((T) new Integer(111));
        lists.add((T) new Integer(222));
        return lists;
    }

    @Override
    public List<T> myTest(String a) {
        return null;
    }
}

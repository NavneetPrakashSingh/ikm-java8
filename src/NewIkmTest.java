
import java.util.*;

public class NewIkmTest {
    public static void main(String[] args) {
        SortedSet<NewElement> s = new TreeSet<NewElement>();
        s.add(new NewElement(15));
        s.add(new NewElement(10));
        s.add(new NewElement(25));
        s.add(new NewElement(10));
        System.out.println(s.first()+" "+s.size());
    }
}

class NewElement implements Comparable{

    int id;
    NewElement(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String toString(){
        return ""+this.id;
    }
}

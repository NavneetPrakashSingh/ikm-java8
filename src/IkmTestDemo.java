public class IkmTestDemo {
    @SafeVarargs
    public static <T> void print(T...a){
        for (T t: a){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        print("My","Test");
//        print(new Employee<Integer,String>(1,"one"),new Employee<Integer,String>(2,"Two"));
    }

    class Employee<T1,T2>{
        public Employee(int id, String name){}
    }
}

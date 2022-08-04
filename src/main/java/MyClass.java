public class MyClass {
    int age = 0;
    String name = "";
    public MyClass(int age, String name){
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args) {
        MyClass myObj = new MyClass(21, "Brandon Allen");
        System.out.println(myObj.age+"\n"+ myObj.name);
    }
}
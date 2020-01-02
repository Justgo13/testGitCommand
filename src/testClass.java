public class testClass {
    private int num;
    private int age;
    private String name;
    public testClass (int num, int age, String name) {
        this.age = age;
        this.name = name;
        this.num = num;
    }

    public String testMethod() {
        return name;
    }

    public int getNum()  {
        return num;
    }
}

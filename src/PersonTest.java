public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        p1.age = 24;
        p1.name = "peichenchen";
        p1.isMarried = false;
        System.out.println(p1.name + "\t" + p1.age + "\t" + p1.isMarried);
        p1.talk("中文");
        p1.setHeight(180);
        System.out.println(p1.getHeight());

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMarried);

        Person p3 = p1;
        p3.age = 22;
        System.out.println(p3.name);
        System.out.println(p1.age);
    }
}


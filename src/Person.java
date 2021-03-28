class Person{
    String name;
    int age;
    boolean isMarried;
    private int height = 179;

    public void eat(){
        String food = "火锅";
        System.out.println("吃饭" + food);
    }

    public String talk(String language){
        System.out.println("中国人说" + language);
        return language;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        height = h;
    }
}

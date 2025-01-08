class Person1{
    private String name;
    private int age;
    private String country;

    public void setName(String name){
        this.name = name;       
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}
class Main2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("Shanyu");
        p1.setAge(13);
        p1.setCountry("US");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getCountry());
    }
}

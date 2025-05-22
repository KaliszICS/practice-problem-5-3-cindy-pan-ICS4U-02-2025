abstract class Animal{
    
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Animal(String name1, int age1, String type1, int move){
        this.name = name1;
        this.age = age1;
        this.type = type1;
        this.position = move;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    public int getPosition(){
        return this.position;
    }

    public String sleep(){
        return "Zzz";
    }

    abstract void move();

    abstract String animalSound();
}
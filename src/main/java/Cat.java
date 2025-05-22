class Cat extends Animal{
    
    public Cat(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    @Override //actually dont need this but ehhh
    public String animalSound(){
        return "Meow";
    }

    @Override
    public void move(){
        this.position +=5;
    }
}

class Bear extends Animal{
    
    public Bear(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    @Override //actually dont need this but ehhh
    public String animalSound(){
        return "Roar";
    }

    @Override
    public void move(){
        this.position +=1;
    }
}
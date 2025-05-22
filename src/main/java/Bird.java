class Bird extends Animal{
    
    public Bird(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    @Override //actually dont need this but ehhh
    public String animalSound(){
        return "Chirp";
    }

    @Override
    public void move(){
        this.position +=50;
    }
}
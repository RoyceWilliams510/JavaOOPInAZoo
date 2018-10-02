public class Bees extends Animal {
    public Bees(String name){
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(this.name+ " never sleeps.");
    }

    public void eat(String food){
        if(food == "pollen"){
            System.out.println(this.name+ " eats "+ food+".");
            System.out.println("YUM!!! " +this.name+ " wants more pollen.");
            this.sleep();
        }else {
        System.out.println("YUCK!!! " + name + " will not eat" + food);
        }
    }
}

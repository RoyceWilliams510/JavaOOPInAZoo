import java.util.ArrayList;

public class zoo {
    String favoriteFood = "bacon";
    public void eat(String food, String name){
        System.out.println(name +" eats "+ food);
        if(food == favoriteFood){
            System.out.println("YUM!!! "+name+ " wants more "+food);
        }else {
            sleep(name);
        }
    }
    public void sleep(String name){
        System.out.println(name+ " sleeps for 8 hours.");
    }

    public static void main(String[] args){
        zoo z = new zoo();
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear( "Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bees stinger = new Bees("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Animal[] animals = new Animal[] {gemma,tigger,pooh,gemma,rarity};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"pollen");
    }
}

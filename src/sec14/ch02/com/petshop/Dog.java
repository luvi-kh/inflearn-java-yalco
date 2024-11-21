package sec14.ch02.com.petshop;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "멍멍";
    }
}

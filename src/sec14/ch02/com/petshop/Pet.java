package sec14.ch2.com.petshop;

public abstract class Pet {
    public static void intro () {
        System.out.println("반려동물은 우리의 친구입니다.");
    };

    private String name;
    public Pet(String name) {
        this.name = name;
    }

    abstract String makeSound();
}

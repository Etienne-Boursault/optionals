import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCarByName("Fred");
        int myCatAge = optionalCat.map(Cat::getAge)
                .orElse(0);
        System.out.println(myCatAge);
    }
    private static Optional<Cat> findCarByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}

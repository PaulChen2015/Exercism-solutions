import java.util.Optional;

class Twofer {

    String twofer(String name) {
        name = Optional.ofNullable(name).orElse("you");
        return String.format("One for %s, one for me.", name);
    }
}

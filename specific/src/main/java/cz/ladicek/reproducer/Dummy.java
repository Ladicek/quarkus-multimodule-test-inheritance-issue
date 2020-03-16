package cz.ladicek.reproducer;

public class Dummy {
    // if this class doesn't exist, Maven doesn't create `target/classes` and Quarkus fails
    // (which is IMHO a bug)
}

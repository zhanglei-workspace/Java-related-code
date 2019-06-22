package pattern.creational.builder.myBuilder;

public interface CreateHuman {

    void builderFoot();
    void builderHand();
    void builderHead();
    void builderBody();

    Human createHuman();
}

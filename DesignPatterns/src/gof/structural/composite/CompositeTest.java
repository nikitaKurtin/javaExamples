package gof.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        FamilyMember Peter = new FamilyMember("Peter", "Guttman");
        FamilyMember Dafni = new FamilyMember("Dafni", "Yedidovich");
        FamilyMember Danny = new FamilyMember("Danny", "Guttman");
        FamilyMember Shimi = new FamilyMember("Shimi", "Guttman");
        FamilyMember Gal = new FamilyMember("Gal", "Yedidovich");
        FamilyMember Bar = new FamilyMember("Bar", "Yedidovich");
        FamilyMember Nir = new FamilyMember("Nir", "Yedidovich");
        FamilyMember Tom = new FamilyMember("Tom", "Yedidovich");
        FamilyMember Barak = new FamilyMember("Barak", "Guttman");
        FamilyMember Shahar = new FamilyMember("Shahar", "Guttman");
        FamilyMember Roei = new FamilyMember("Roei", "Guttman");

        Peter.addDescendant(Dafni);
        Peter.addDescendant(Danny);
        Peter.addDescendant(Shimi);

        Dafni.addDescendant(Nir);
        Dafni.addDescendant(Gal);
        Dafni.addDescendant(Bar);
        Dafni.addDescendant(Tom);

        Danny.addDescendant(Shahar);
        Danny.addDescendant(Roei);
        Danny.addDescendant(Barak);

        Peter.showFamily();

        Danny.showFamily();
    }
}

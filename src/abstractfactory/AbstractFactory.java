package abstractfactory;

public interface AbstractFactory {

    OreProduct createOre();
    SmeltedProduct createSmelt();
}

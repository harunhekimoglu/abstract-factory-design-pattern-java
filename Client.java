enum GCType {
  XBOX,
  PS
}

enum GCPower {
  BASE,
  PRO
}

public class Client
{
  public static void main(String args[])
  {
    AbstractFactory xboxFactory1 = FactoryProducer.getFactory(GCType.XBOX);
    GameConsole xboxBase = xboxFactory1.getPower(GCPower.BASE);
    System.out.println("\nRequesting XBOX BASE");
    xboxBase.buy();

    AbstractFactory xboxFactory2 = FactoryProducer.getFactory(GCType.XBOX);
    GameConsole xboxPro = xboxFactory2.getPower(GCPower.PRO);
    System.out.println("\nRequesting XBOX PRO");
    xboxPro.buy();

    AbstractFactory psFactory1 = FactoryProducer.getFactory(GCType.PS);
    GameConsole psBase = psFactory1.getPower(GCPower.BASE);
    System.out.println("\nRequesting PS BASE");
    psBase.buy();

    AbstractFactory psFactory2 = FactoryProducer.getFactory(GCType.PS);
    GameConsole psPro = psFactory2.getPower(GCPower.PRO);
    System.out.println("\nRequesting PS PRO");
    psPro.buy();

    System.out.println();
  }
}

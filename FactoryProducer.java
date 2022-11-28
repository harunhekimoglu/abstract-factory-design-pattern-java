public class FactoryProducer
{
  public static AbstractFactory getFactory(GCType gcType)
  {
    if (gcType == GCType.XBOX) {
      return new XBoxFactory();
    } else if (gcType == GCType.PS) {
      return new PSFactory();
    }

    throw new RuntimeException("Oopps.. Something went wrong! (FactoryProducer)");
  }
}

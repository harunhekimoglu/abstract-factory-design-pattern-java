public class XBoxFactory extends AbstractFactory
{
  @Override
  public GameConsole getPower(GCPower gcPower)
  {
    if (gcPower == GCPower.BASE) {
      return new XBoxBase();
    } else if (gcPower == GCPower.PRO) {
      return new XBoxPro();
    }

    throw new RuntimeException("Oopps.. Something went wrong! (XBoxFactory)");
  }
}

public class PSFactory extends AbstractFactory
{
  @Override
  public GameConsole getPower(GCPower gcPower)
  {
    if (gcPower == GCPower.BASE) {
      return new PSBase();
    } else if (gcPower == GCPower.PRO) {
      return new PSPro();
    }

    throw new RuntimeException("Oopps.. Something went wrong! (PSFactory)");
  }
}

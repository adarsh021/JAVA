class Price
{
  public static void main(String[] args)
{
  int s = 200;
  int p = 300;

  float a = (s * 4) - (((s * 4) * 15) / 100);
  float b = (p * 4) - (((p * 4) * 30) / 100);

  float t = a + b;

  System.out.println("Total price = " + t);
}
}
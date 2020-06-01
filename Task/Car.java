package Task;

public class Car implements IProduct {
    private IProductPart body;
    private IProductPart chassis;
    private IProductPart engine;

    public Car()
    {
        System.out.println("Product Car is created");
    }

   public void installFirstPart(IProductPart productPart)
   {
       this.body=productPart;
       System.out.println(((ProductPart) this.body).getNameProductPart() + " is being installed");
   }

    public void installSecondPart(IProductPart productPart)
    {
        this.chassis=productPart;
        System.out.println(((ProductPart) this.chassis).getNameProductPart()+ " is being installed");
    }

    public void installThirdPart(IProductPart productPart)
    {
        this.engine=productPart;
        System.out.println(((ProductPart) this.engine).getNameProductPart() + " is being installed");
    }

}

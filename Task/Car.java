package Task;

public class Car implements IProduct {
    IProductPart body;
    IProductPart chassis;
    IProductPart engine;

   public void installFirstPart(IProductPart productPart)
   {
       this.body=productPart;
       System.out.println("Установлена деталь " + ((ProductPart) this.body).getProductPart());
   }

    public void installSecondPart(IProductPart productPart)
    {
        this.chassis=productPart;
        System.out.println("Установлена деталь " + ((ProductPart) this.chassis).getProductPart());
    }

    public void installThirdPart(IProductPart productPart)
    {
        this.engine=productPart;
        System.out.println("Установлена деталь " + ((ProductPart) this.engine).getProductPart());
    }

}

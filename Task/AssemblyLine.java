package Task;

public class AssemblyLine implements IAssemblyLine {
    private ILineStep firstLine = new LineStep("body");
    private ILineStep secondLine = new LineStep("chassis");
    private ILineStep thirdLine = new LineStep("engine");

    public AssemblyLine(){}


    public IProduct assembleProduct(IProduct product)
    {
        IProductPart body = firstLine.buildProductPart();
        product.installFirstPart(body);
        System.out.println(((ProductPart) body).getNameProductPart() + " is installed");

        IProductPart chassis = secondLine.buildProductPart();
        product.installSecondPart(chassis);
        System.out.println(((ProductPart) chassis).getNameProductPart() + " is installed");

        IProductPart engine = thirdLine.buildProductPart();
        product.installThirdPart(engine);
        System.out.println(((ProductPart) engine).getNameProductPart() + " is installed");

        System.out.println("Car is ready!");

        return product;
    }
}

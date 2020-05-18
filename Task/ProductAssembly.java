package Task;

import Task.IAssemblyLine;
import Task.IProduct;
import Task.LineParts;

public class ProductAssembly implements IAssemblyLine {


    public IProduct assembleProduct(IProduct product)
    {
        ProductPart body = (ProductPart) new LineParts("корпус").buildProductPart();
        product.installFirstPart(body);

        ProductPart chassis = (ProductPart) new LineParts("шасси").buildProductPart();
        product.installSecondPart(chassis);

        ProductPart engine = (ProductPart) new LineParts("двигатель").buildProductPart();
        product.installThirdPart(engine);

        System.out.println("Машина готова!");

        return product;
    }
}

package Task;

import Task.IProductPart;

public class ProductPart implements IProductPart {
    String productPart;

    ProductPart(String productPart) {

        this.productPart = productPart;
    }

    public void setProductPart(String productPart)
    {

        this.productPart = productPart;
    }

    public String getProductPart()
    {
        return this.productPart;
    }
    
}

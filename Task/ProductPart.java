package Task;

import Task.IProductPart;

public class ProductPart implements IProductPart {
    private String nameProductPart;

    ProductPart(String productPart) {

        this.nameProductPart = productPart;
    }

    public void setNameProductPart(String nameProductPart)
    {

        this.nameProductPart = nameProductPart;
    }

    public String getNameProductPart()
    {
        return this.nameProductPart;
    }
    
}

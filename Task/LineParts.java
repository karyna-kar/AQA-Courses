package Task;

import Task.ILineStep;
import Task.IProductPart;

public class LineParts implements ILineStep {
    String detail;

    LineParts(String detail) {

        this.detail = detail;
    }

    public IProductPart buildProductPart(){
        System.out.println("Изготовление детали " + this.detail);
        return new ProductPart(this.detail);
    }
}


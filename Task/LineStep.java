package Task;

import Task.ILineStep;
import Task.IProductPart;

public class LineStep implements ILineStep {
    private String detail;

    public LineStep(String detail) {

        this.detail = detail;
    }

    public IProductPart buildProductPart(){
        System.out.println(this.detail + " is build");
        return new ProductPart(this.detail);
    }
}


package AwaitingJAVA.Day2.Assignment;

public class Electronics extends Goods {
    private double costPerUnit;
    private int modelNumber;
    private boolean hasDefect;
    private String productType;

    public Electronics(){ }

    public Electronics(String nameOfItem,int quantityStored,String name,
                       double costPerUnit,int modelNumber,boolean hasDefect,String productType) {
        super(nameOfItem,quantityStored,name);
        this.costPerUnit=costPerUnit;
        this.modelNumber=modelNumber;
        this.hasDefect=hasDefect;
        this.productType=productType;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit=costPerUnit;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber=modelNumber;
    }

    public boolean getHasDefect() {
        return hasDefect;
    }

    public void setHasDefect(boolean hasDefect) {
        this.hasDefect=hasDefect;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType=productType;

    }
    @Override
    public String toString() {
        return "Electronics{" +
                "Type of product = " + productType +
                ", CostPerUnit = " + costPerUnit +
                ", ModelNumber = i.d-number(" + modelNumber +")" +
                ", HasDefect = '" + hasDefect + '\'' +
                '}';
    }
//    for(int i = 1; i <= n; i++){
//
//        for(int j = 1; j <= n-1; j++)
//            System.out.print(" ");
//
//        for(int j = 1; j <= 2*i - 1; j++)
//            System.out.print("#");
//
//        System.out.println();
//    }
}

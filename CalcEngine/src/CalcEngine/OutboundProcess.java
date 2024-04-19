package CalcEngine;

public class OutboundProcess {
    public static void main(String[]args) {
        OutboundProcess testOutboundProcess = new OutboundProcess();
        boolean freeShipping = false;
        System.out.println("free Shipping: " + freeShipping);
        testOutboundProcess.assignCarrier(freeShipping);
    }

    public void assignCarrier ( boolean freeShipping){
        if (freeShipping) {
            System.out.println("Use special Carrier.");
        } else {
            System.out.println("Use regular carrier.");
        }
        recordShippingCharge(freeShipping);
    }
    private void recordShippingCharge ( boolean freeShipping){
        if (!freeShipping) {
            System.out.println("Add $5 shipping charge");
        } else {
            System.out.println("No shipping charge");
        }
    }

}

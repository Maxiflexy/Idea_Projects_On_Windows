package CalcEngine;

public class OrderProcess {
    public String [] getTopOrders(String[] oderList, int topSize, int totalOrders){
        String[] topOrders = new String[topSize];
        for(int i = 1; i < topSize; i++)
            topOrders[i] = oderList[i];
        double topPercent = topSize / totalOrders;
        System.out.println(topPercent);

        return topOrders;
    }

    public double calculateShipping(double distance, double costFactor){
        double result = distance * costFactor;
        return result;
    }









}

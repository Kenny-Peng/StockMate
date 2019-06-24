public class RealTime {
    private String symbol;
    private String price;

    //creates a realtime ticker object
    public RealTime(String symbol, String price){
        this.symbol = symbol;
        this.price = price;
    }

    //temporarily
    public void displayData(){
        System.out.println(symbol);
        System.out.println(price);
    }
}

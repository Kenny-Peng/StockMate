import com.google.gson.annotations.SerializedName;

public class stock {
    private String symbol;
    private String price;

    public stock(String symbol, String price){
        this.symbol = symbol;
        this.price = price;
    }
}

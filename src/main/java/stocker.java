import com.google.gson.*;
public class stocker {
    public static void main(String args[]){
        //need to read and save json to text
        String json = "{\n" +
                "    \"symbol\": \"AAPL\",\n" +
                "    \"price\": 192.73\n" +
                "}";
        Gson gson = new Gson();
        stock data = gson.fromJson(json, stock.class);

    }
}

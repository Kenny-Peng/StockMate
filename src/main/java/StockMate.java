import com.google.gson.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class StockMate {
    public static void main(String args[]){
        StockMate coreObject = new StockMate();
        String json = "";

        //attempt to retrieve url data
        try {
            ApiWrapper wrapper = new ApiWrapper("stock", "real-time-price", "voo");
            json = coreObject.getApiData(wrapper.getQuery());
        }
        catch (Exception e){
            System.out.println("bad api query url");
            System.exit(1);
        }
        Gson gson = new Gson();
        RealTime data = gson.fromJson(json, RealTime.class);
        data.displayData();
    }

    public StockMate(){

    }

    public String getApiData(String dataQuerySource) throws Exception{
        String apiData;
        URL apiCall = new URL(dataQuerySource);
        //fetch the data from url and convert to String
        apiData = IOUtils.toString(apiCall, StandardCharsets.UTF_8);

        return apiData;
    }
}

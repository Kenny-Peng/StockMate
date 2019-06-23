public class ApiWrapper {
    //base of query request
    String apiSource = "https://financialmodelingprep.com/api/v3/";

    //request for real time stock ticker price
    public ApiWrapper(String type, String setting, String ticker){
        apiSource += type + "/" + setting + "/" + ticker;
    }

    public String getQuery(){
        return apiSource;
    }
}

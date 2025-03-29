package sia.tacocloud.example.proxy;


import java.util.logging.Logger;

interface ApiClient {
    String fetchData(String endpoint);
}

class RealApiClient implements ApiClient {

    @Override
    public String fetchData(String endpoint) {
        return "Fetch data from Real Api Client " + endpoint;
    }
}

class LoggingProxy implements ApiClient {

    private final ApiClient apiClient;

    public LoggingProxy(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private static final Logger logger = Logger.getLogger(LoggingProxy.class.getName());

    @Override
    public String fetchData(String endpoint) {
        logger.info("Fetching data from Logging Proxy");
        String data = apiClient.fetchData(endpoint);
        logger.info("Finished fetching data from Logging Proxy");
        return data;
    }
}

class SecurityProxy implements ApiClient {
    private final ApiClient apiClient;

    public SecurityProxy(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private boolean authUser(String user) {
        return user.equals("Maxim");
    }

    @Override
    public String fetchData(String endpoint) {
        System.out.println("auth user proxy");
        if (authUser("Maxim")) {
            return apiClient.fetchData(endpoint);
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ApiClient realClient = new RealApiClient();
        ApiClient securedClient = new SecurityProxy(realClient);
        ApiClient loggingClient = new LoggingProxy(securedClient);
        System.out.println(loggingClient.fetchData("https//www.com"));
    }
}


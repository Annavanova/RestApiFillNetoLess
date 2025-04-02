package Cloud.demo.service;

import lombok.var;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class BffService {
    public RestClient restClient;

    public BffService(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<String>getById(int userId){
        List<String> list = new ArrayList<>();

        var responsUser = restClient.get()
                .uri("http://localhost:8080/api/users/{userId}", userId)
                .retrieve()
                .body(String.class);

        list.add(responsUser);


        var responseOrder = restClient.get()
                .uri("http://localhost:8081/api/orders/onUser/{userId}", userId)
                .retrieve()
                .body(String.class);
        list.add(responseOrder);


        return list;
    }
}

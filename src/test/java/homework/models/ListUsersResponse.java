package homework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListUsersResponse {
    @JsonProperty("data")
    private ListUsersData data;
    @JsonProperty("support")
    private ListUsersSupport support;

    }



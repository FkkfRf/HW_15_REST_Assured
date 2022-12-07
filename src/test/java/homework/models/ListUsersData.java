package homework.models;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ListUsersData {
    private Integer id;
    private String email;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_namee")
    private String last_name;
    private String avatar;
}


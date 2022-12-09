package homework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListUsersResponse {
   private int page, per_page, total, total_pages;
    @JsonProperty("data")
    private List<ListUsersData> data;
    @JsonProperty("support")
    private ListUsersSupport support;

    }



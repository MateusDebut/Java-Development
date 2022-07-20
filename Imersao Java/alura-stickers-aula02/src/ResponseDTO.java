import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ResponseDTO {
    @JsonProperty("items")
    private List<Filme> items;

    @JsonProperty("errorMessage")
    private String errorMessage;

    public ResponseDTO() {
    }

    public ResponseDTO(List<Filme> items, String errorMessage) {
        this.items = items;
        this.errorMessage = errorMessage;
    }

    public List<Filme> getItems() {
        return items;
    }

    public void setItems(List<Filme> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

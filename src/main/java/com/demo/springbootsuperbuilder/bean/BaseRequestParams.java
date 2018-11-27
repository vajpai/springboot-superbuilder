package bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString
public class BaseRequestParams {

    @Builder.Default
    private String schema = "http";

    @Builder.Default
    private String host="loclahost";

    @Builder.Default
    private int port=8080;
}

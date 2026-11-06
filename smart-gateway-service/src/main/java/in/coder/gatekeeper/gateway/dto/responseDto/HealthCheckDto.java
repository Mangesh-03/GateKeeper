package in.coder.gatekeeper.gateway.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HealthCheckDto
{
    private String serviceName;
    private String serviceDesciption;
    private String appStatus;
}

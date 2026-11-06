package in.coder.gatekeeper.analytics.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HealthCheckDto
{
    private String serviceName;
    private String ServiceDescription;
    private String appStatus;
}

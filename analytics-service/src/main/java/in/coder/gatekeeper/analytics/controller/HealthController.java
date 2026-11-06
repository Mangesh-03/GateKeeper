package in.coder.gatekeeper.analytics.controller;

import in.coder.gatekeeper.analytics.dto.responseDto.HealthCheckDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController
{
    private String serviceName;
    private String serviceDescription;

    public HealthController(@Value("${info.app.name}")String serviceName,
                            @Value("${info.app.description}")String serviceDescription)
    {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
    }

    @GetMapping
    public ResponseEntity<HealthCheckDto> health()
    {
        return ResponseEntity.ok(new HealthCheckDto(serviceName,serviceDescription,"UP"));
    }
}

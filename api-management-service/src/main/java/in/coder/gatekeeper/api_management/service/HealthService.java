package in.coder.gatekeeper.api_management.service;

import in.coder.gatekeeper.api_management.dto.responseDto.HealthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthService
{
    private final JdbcTemplate jdbcTemplate;

    public String getHealth()
    {
        String dbStatus = "Down";

        try {
            Integer result = jdbcTemplate.queryForObject("Select 1",Integer.class);

            if(Integer.valueOf(1).equals(result))
            {
                dbStatus = "UP";
            }
        }
        catch (Exception e)
        {
            System.out.println("MySql health check failed " + e.getMessage());
        }

        return dbStatus;
    }
}

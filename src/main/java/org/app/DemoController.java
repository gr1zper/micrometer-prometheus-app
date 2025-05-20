package org.app;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Counter customRequestCounter;

    public DemoController(MeterRegistry meterRegistry) {
        this.customRequestCounter = meterRegistry.counter("custom_requests_total");
    }

    @GetMapping("/hello")
    public String hello() {
        customRequestCounter.increment();
        return "Hello from Micrometer!";
    }
}

package com.lca2.k8s_api_gateway.api.open;

import com.lca2.k8s_api_gateway.common.dto.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/gateway/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class GatewayController {
    @GetMapping(value = "/hello")
    public ApiResponseDto<String> test() {
        return ApiResponseDto.createOk("hello k8s-api-gateway");
    }
}
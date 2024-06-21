package com.bc.ipfs.ipfsserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "ipfs")
public class IpfsProps {
    private String host = "127.0.0.1";
    private Integer port = 5001;
}

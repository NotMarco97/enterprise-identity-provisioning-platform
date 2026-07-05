package com.github.NotMarco97.enterprise_identity_provisioning_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EnterpriseIdentityProvisioningPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseIdentityProvisioningPlatformApplication.class, args);

	}

}

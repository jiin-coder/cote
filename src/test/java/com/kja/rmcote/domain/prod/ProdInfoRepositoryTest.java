package com.kja.rmcote.domain.prod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
public class ProdInfoRepositoryTest {

    @Autowired
    ProdInfoRepository prodInfoRepository;

    @Test
    @DisplayName("상품 저장 테스트")
    public void createProdInfoTest() {
        ProductInfo productInfo = ProductInfo.builder()
                .prodName("테스트 상품")
                .price(10000)
                .prodRegDate (LocalDateTime.now())
                .regCoName("테스트 등록업체명")
                .build();
        ProductInfo savedProductInfo = prodInfoRepository.save(productInfo);
        System.out.println(savedProductInfo.toString());
    }
}


package com.kja.rmcote.domain.prod;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@ToString
@Getter
@NoArgsConstructor
@Entity
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prod_id")
    private Long prodId; // 상품코드

    @Column(name = "prod_name", nullable = false, length = 50)
    private String prodName; //상품명

    @Column(name= "price", nullable = false)
    private int price; // 금액

    @Column(name= "prod_reg_date", nullable = false)
    private LocalDateTime prodRegDate = LocalDateTime.now(); // 등록일자

    @Column(name= "reg_co_name", nullable = false)
    private String regCoName; // 등록업체명

    @Builder
    public ProductInfo(String prodName, int price, LocalDateTime prodRegDate, String regCoName){
        this.prodName = prodName;
        this.price = price;
        this.prodRegDate = prodRegDate;
        this.regCoName = regCoName;
    }

}

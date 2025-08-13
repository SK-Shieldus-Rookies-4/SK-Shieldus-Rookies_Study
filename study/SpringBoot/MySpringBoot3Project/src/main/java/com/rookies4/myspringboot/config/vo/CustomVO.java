package com.rookies4.myspringboot.config.vo;

//VO : value object
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class CustomVO {
    private String mode;
    private double rate;
}
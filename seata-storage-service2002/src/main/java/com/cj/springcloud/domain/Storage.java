package com.cj.springcloud.domain;

import lombok.Data;

/**
 * @author cj
 * @date 2023/3/11 19:12
 * @description
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

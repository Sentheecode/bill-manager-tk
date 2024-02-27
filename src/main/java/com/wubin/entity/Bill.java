package com.wubin.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "bill_")
@Getter
@Setter
@ToString
public class Bill {

    @Id
    @Column(name = "Id_")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title_")
    private String title;

    @Column(name = "bill_time_")
    private Date billTime;

    @Column(name = "type_id_")
    private Long typeId;

    @Column(name = "price_")
    private Double price;

    @Column(name = "explain_")
    private String explain;
    /**
     * 开始时间：用于查询
     **/
    @Transient
    private Date date1;

    /**
     * 结束时间：用于查询
     **/
    @Transient
    private Date date2;

    /**
     * 类别名称
     **/
    @Transient
    private String typeName;


}

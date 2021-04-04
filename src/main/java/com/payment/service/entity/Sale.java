package com.payment.service.entity;

import com.mysql.cj.log.Log;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sale")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Sale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "date", nullable = false)
    private Date date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sale", cascade = CascadeType.REFRESH)
    private List<SellingProduct> products;

    @Column(name = "totalValue", nullable = false, length = 10)
    @JoinColumn(name = "sell_id")
    private Double totalValue;

}

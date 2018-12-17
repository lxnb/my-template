package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="t_test")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tests implements Serializable {
    @Id
    @Column(name="tid")
    @KeySql(sql = "select t_test_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String tname;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
}

package io.github.linxiaobaixcg.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Description:
 * date: 2018/11/27 10:38
 * author: loveLy
 */
@Entity
@Table(name="tb_pl")
@Data
public class Pl implements Serializable {

    @Id
    private String problemid;

    @Id
    private String lableid;
}

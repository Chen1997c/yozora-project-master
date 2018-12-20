package pw.yozora.provider.home.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * 描述： 内容实体类
 *
 * @author ChenJianChuan
 * @date asd
 */
@Data
@ToString
@Entity
@Table(name = "yp_home_content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private int type;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
}

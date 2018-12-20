package pw.yozora.provider.home.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * 描述： 轮播实体类
 *
 * @author ChenJianChuan
 * @date 2018/12/17　11:31
 */
@Data
@ToString
@Entity
@Table(name = "yp_home_carousel")
public class Carousel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
}

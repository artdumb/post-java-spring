package postpracice.postprac.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor   //롬복 라이브러리 이용하여 생성자 자동생성
@Getter  //롬복 라이브러리 getter메소드 자동추가
@Setter // 롬복 라이브러리 setter메소드 자동추가
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //하나씩 늘어나는 기본키
    private Long id;

    @Column(length=500, nullable=false)  //String 필드는 varchar(255)가 기본 > 길이를 500으로 늘려줌
    private String title;

    @Column(columnDefinition = "Text", nullable = false) //String으로 필드만들면 varchar(255)가 기본 > Text타입으로 바꿔줌
    private String content;

    private String author;

    @Builder   //롬복라이브러리 이용하여 생성자대신 사용
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

package com.green.firstserver.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// 인터페이스가 implements 한 클래스가 만들어지고
// 그 클래스가 객체화하고 그 객체 주소값을 스프링 컨테이너가 들고 있는다.
// 스프링 컨테이너가 객체 주소값을 들고 있을 수 있는 건 빈등록이 되었기 때문


//클라이언트로부터 들어오는 데이터를 담고 줄 수 있음
@Getter
@Setter
@ToString
public class MemoPostReq {
    private String title;
    private String content;


}

package com.green.firstserver.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//데이터베이스에서 들어오는 데이터를 담고 줄 수 있음
public class MemoGetRes {
    private int id;
    private String title;
    private String content;


}

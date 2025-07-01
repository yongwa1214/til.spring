package com.green.firstserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoGetOneRes {
    @JsonProperty("memoId")
    private int id;
    private String title;
    @JsonProperty("ctnts")
    private String content;
    private String createdAt;
}

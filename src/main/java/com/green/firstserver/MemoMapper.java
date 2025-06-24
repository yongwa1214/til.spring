package com.green.firstserver;

import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MemoMapper {
    // insert, update, delete는 리턴타입 int

   int insMemo(MemoPostReq req);
   List<MemoGetRes> selMemoList();

}

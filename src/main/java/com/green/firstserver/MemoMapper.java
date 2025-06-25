package com.green.firstserver;

import com.green.firstserver.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MemoMapper {
    // insert, update, delete는 리턴타입 int

   List<MemoGetRes> selMemoList();

   MemoGetOneRes selMemo(int id);

   int insMemo(MemoPostReq req);

   int updMemo(MemoPutReq req);

   int delMemo(int id);

}

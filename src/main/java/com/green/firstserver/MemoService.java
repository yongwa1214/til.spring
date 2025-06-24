package com.green.firstserver;

import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service //빈 등록
public class MemoService {
    // Persistence DB 작업 처리(로직+ DB 작업)

    private final MemoMapper memoMapper;

//    public MemoService(MemoMapper mm){
//        this.memoMapper = mm;
//    }


    public int insMemo(MemoPostReq req){

        return memoMapper.insMemo(req);
    }

    public List<MemoGetRes> selMemoList(){
        return memoMapper.selMemoList();
    }


}

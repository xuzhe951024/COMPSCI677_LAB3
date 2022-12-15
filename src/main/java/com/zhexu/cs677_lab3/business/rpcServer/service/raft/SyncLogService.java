package com.zhexu.cs677_lab3.business.rpcServer.service.raft;

import com.zhexu.cs677_lab3.api.bean.basic.dataEntities.raftLogMatenance.RaftLogStateCapture;
import com.zhexu.cs677_lab3.api.bean.basic.BasicResponse;

/**
 * @project: CS677_LAB3
 * @description:
 * @author: zhexu
 * @create: 12/9/22
 **/
public interface SyncLogService {
    Boolean foundLogTermAndIndex(RaftLogStateCapture capture);

    BasicResponse getSyncData(RaftLogStateCapture capture);
}

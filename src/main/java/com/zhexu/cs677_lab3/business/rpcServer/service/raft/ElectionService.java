package com.zhexu.cs677_lab3.business.rpcServer.service.raft;

import com.zhexu.cs677_lab3.api.bean.RaftEvents.election.RaftCandidateVoteReq;
import com.zhexu.cs677_lab3.api.bean.basic.BasicResponse;

/**
 * @project: CS677_LAB3
 * @description:
 * @author: zhexu
 * @create: 11/29/22
 **/
public interface ElectionService {
    /**
     * Receive the election request from the candidate
     * @return status wrapped in BasicResponse
     */
    BasicResponse electionReqReceiv(RaftCandidateVoteReq candidateVoteReq);
}

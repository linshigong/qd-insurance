package com.qding.api.call.app.qding.v2_6_0.struct.neighbor;

import com.qding.api.annotation.ExplainAnnotation;

import java.io.Serializable;
import java.util.List;

/**
 * Created by qd on 2016/9/9.
 */
public class VoteInfo extends  BriefVote  implements Serializable{

    private static final long serialVersionUID = -4763832543258338993L;

    @ExplainAnnotation (explain = "当前话题总投票数")
    private Integer voteTotalCount;

    @ExplainAnnotation (explain = "已投票用户列表",desc = "(备用)")
    private List<BriefMember> memberList;

    @ExplainAnnotation (explain = "参与状态",desc = "0：未投票，1：已投票")
    private Integer joinStatus;

    @ExplainAnnotation (explain = "投票状态",desc = "0：已截止，1：未截止")
    private Integer voteStatus;

    @ExplainAnnotation (explain = "用户已投票项")
    private String selOptionIndex = "";

    public String getSelOptionIndex() {
        return selOptionIndex;
    }

    public void setSelOptionIndex(String selOptionIndex) {
        this.selOptionIndex = selOptionIndex;
    }

    public Integer getVoteTotalCount() {
        return voteTotalCount;
    }

    public void setVoteTotalCount(Integer voteTotalCount) {
        this.voteTotalCount = voteTotalCount;
    }

    public List<BriefMember> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<BriefMember> memberList) {
        this.memberList = memberList;
    }

    public Integer getVoteStatus() {
        return voteStatus;
    }

    public void setVoteStatus(Integer voteStatus) {
        this.voteStatus = voteStatus;
    }

    public Integer getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(Integer joinStatus) {
        this.joinStatus = joinStatus;
    }
}

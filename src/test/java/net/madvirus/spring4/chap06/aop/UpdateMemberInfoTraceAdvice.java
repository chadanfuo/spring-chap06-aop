package net.madvirus.spring4.chap06.aop;

import net.madvirus.spring4.chap06.member.UpdateInfo;

public class UpdateMemberInfoTraceAdvice {
	public void traceReturn(String memberId,UpdateInfo info){
		System.out.printf("[TA] ���� ���� : ���ȸ��=%s, ��������=%s\n",memberId,info);
	}
}

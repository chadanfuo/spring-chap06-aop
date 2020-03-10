package net.madvirus.spring4.chap06;

import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap06.member.MemberService;
import net.madvirus.spring4.chap06.member.UpdateInfo;
import net.madvirus.spring4.chap06.board.NewArticleRequest;
import net.madvirus.spring4.chap06.board.ReadArticleService;
import net.madvirus.spring4.chap06.board.WriteArticleService;
import net.madvirus.spring4.chap06.member.MemberRegRequest;

public class MainQuickStart2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:acQuickStart2.xml");

		WriteArticleService writeArticleService = ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer1", "title", "content"));
		System.out.println("==================");
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		System.out.println("==================");
		MemberService memberService = ctx.getBean(MemberService.class);
		MemberRegRequest memberRegReq = new MemberRegRequest("id", "name", "pw");
		memberService.regist(memberRegReq);

		UpdateInfo updateInfo= new UpdateInfo();
		updateInfo.setNewName("ªı¿Ã∏ß");
		memberService.update("madvirus", updateInfo);
		ctx.close();
	}
}

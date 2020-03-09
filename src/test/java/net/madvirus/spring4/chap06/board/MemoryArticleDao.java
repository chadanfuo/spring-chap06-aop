package net.madvirus.spring4.chap06.board;

import java.util.HashMap;
import java.util.Map;

public class MemoryArticleDao implements ArticleDao{
	private int articleNo=0;
	private Map<Integer,Article> articleMap=new HashMap<>();
	public void insert(Article article) {
		System.out.println("MemoryArticleDao.insert() »£√‚µ ");
		articleNo++;
		article.setId(articleNo);
		articleMap.put(articleNo,article);
	}
	public Article selectById(Integer id) {
		return articleMap.get(id);
	}
	
}

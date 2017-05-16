package com.lizewu.blog.fenye;

/**
 * ��ҳ��Ϣ������
 * @author Administrator
 *
 */
public class PageUtil {
	
	public static Page createPage(int everyPage,int totalCount,int currentPage)
	{
		everyPage = getEveryPage(everyPage);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(everyPage,totalCount);
		int beginIndex = getBeginIndex(everyPage,currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage,currentPage);
		return new Page( everyPage,  totalCount,  totalPage,  beginIndex,  currentPage,  hasPrePage,
				 hasNextPage);
	}
	
	public static Page createPage(Page page,int totalCount) {
		int everyPage = getEveryPage(page.getEveryPage());
		int currentPage = getCurrentPage(page.getCurrentPage());
		int totalPage = getTotalPage(everyPage, totalCount);
		int beginIndex = getBeginIndex(everyPage, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage, currentPage);
		return new Page(everyPage, totalCount, totalPage, currentPage,
				beginIndex, hasPrePage,  hasNextPage);
	}
	
	public static int getTotalPage(int everyPage,int totalCount) {
		// TODO Auto-generated method stub
		int totalPage = 0;
		if(totalPage % everyPage == 0)
		{
			totalPage = totalCount / everyPage;
		}else{
			totalPage = totalCount / everyPage + 1;
		}
		return totalPage;
	}

	public static int getCurrentPage(int currentPage) {
		// TODO Auto-generated method stub
		return currentPage==0?1:currentPage;
	}

	public static int getEveryPage(int everyPage) {
		// TODO Auto-generated method stub
		return everyPage == 0 ?10:everyPage;
	}
	
	//������ʼҳ����Ҫÿҳ��ʾ���٣���ǰҳ
	public static int getBeginIndex(int everyPage,int currentPage)
	{
		return (currentPage-1) * everyPage;
	}
	
	//�����Ƿ�����һҳ
	public static boolean getHasPrePage(int currentPage)
	{
		return currentPage==1?false:true;
	}
	//�����Ƿ�����һҳ����Ҫ��ǰҳ����ҳ��
	public static boolean getHasNextPage(int totalPage,int currentPage)
	{
		return currentPage == totalPage || totalPage == 0?false:true;
	}
}

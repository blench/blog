package blog;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.fenye.PageUtil;
import org.junit.*;
public class Test2 {
	
	@Test
	public void TestPage() {
		// TODO Auto-generated constructor stub
	Page page = PageUtil.createPage(5, 34, 3);
	System.out.println(page.getBeginIndex());
	System.out.println(page.getEveryPage());
	System.out.println(page.getTotalCount());
	System.out.println(page.getTotalPage());
	System.out.println(page.isHasPrePage());
	System.out.println(page.isHasPrePage());
	}
}

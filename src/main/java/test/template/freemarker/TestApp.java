package test.template.freemarker;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			// テンプレート置き場を指定。
			cfg.setDirectoryForTemplateLoading(new File("./templates"));
			// テンプレートを読み込み
			Template temp = cfg.getTemplate("test.ftl");
			// データモデル
			Map root = new HashMap();
			root.put("test", "ほほほげ");
			root.put("value", String.valueOf(100));
			root.put("int_value", Integer.valueOf(1000));
			
			List<TestVisitor> list = new ArrayList<TestVisitor>();
			list.add(new TestVisitor("テスト太郎",35, "東京都"));
			list.add(new TestVisitor("テスト次郎",33, "東京都"));
			list.add(new TestVisitor("テスト三郎",32, "神奈川圏"));
			list.add(new TestVisitor("テスト五郎",28, "千葉県"));
			
			root.put("value_list", list);
			
			// テンプレート処理
			Writer out = new OutputStreamWriter(System.out); // 標準出力に書く
			temp.process(root, out);
			out.flush();
		} catch(IOException ie) {
			
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

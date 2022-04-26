package word;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapperBuilder;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Export {
	
	public static void main(String[] args) throws IOException {
		
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
		configuration.setDefaultEncoding("utf-8");
		configuration.setClassicCompatible(true);// 空值默认转换成空字符串""
		configuration.setTemplateUpdateDelayMilliseconds(1000L * 120);
		configuration.setObjectWrapper(new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_31).build());
		configuration.setOutputEncoding("UTF-8");
		configuration.setLocale(Locale.CHINA);
		configuration.setClassForTemplateLoading(Export.class,"/template");
//		configuration.setDirectoryForTemplateLoading(new File("/data/template/"));
		Map<String, Object> maps = new HashMap<String, Object>();
		String fileName = "test.docx";
		File file = new File("/data/template/"+fileName);
		Template t = configuration.getTemplate("test.html","UTF-8");
		Writer out = null;
			try {
				out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
				t.process(maps, out);
				out.flush();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TemplateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (out!=null) {
					out.close();
				}
			}
		
	}
	
	
}

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aspose.words.Document;
import com.aspose.words.ImportFormatMode;
import com.aspose.words.SaveFormat;

public class Testhebing {
	public static void main(String[] args) {
		
		
		List<String> strings = new ArrayList<String>();
		strings.add(" ");
		strings.add(" ");
		strings.add("3");
		System.out.println(strings.size());
		System.out.println(strings.get(0));
		System.out.println(strings.get(1));
//	     System.out.println(new Date());
//		 Document doc1 = new Document("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.doc");
//		 doc1.insertTextFromFile("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.doc",FileFormat.Docx_2010);
//	     doc1.saveToFile("/data/climatography/Merged1.doc",FileFormat.Docx_2010);
//	     System.out.println(new Date());
//	     Document doc2 = new Document("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.doc");
//	     doc2.insertTextFromFile("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.doc",FileFormat.Docx_2010);
//	     doc2.saveToFile("/data/climatography/Merged2.doc",FileFormat.Docx_2010);
//	     System.out.println(new Date());
//	     System.out.println("合并成功");
//		System.out.println(new Date());
//		Document doc1 = new Document("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.doc");
//        Document doc2 = new Document("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.doc");
//
//        //获取文档1的最后一节
//        Section lastsec = doc1.getLastSection();
//
//        //遍历文档2的所有段落内容，添加到文档1
//        for (Section section:(Iterable <Section>)doc2.getSections()) {
//            for (DocumentObject obj:(Iterable <DocumentObject>)section.getBody().getChildObjects()
//            ) {
//                lastsec.getBody().getChildObjects().add(obj.deepClone());
//            }
//        }
//
//        //保存合并后的文档
//        doc1.saveToFile("/data/climatography/Merged3.docx",FileFormat.Docx_2010);
//        System.out.println(new Date());
		
		
//		String[] srcDocxs = {"/data/climatography/1.docx","/data/climatography/2.docx"};
//		
//		String newFile = "/data/climatography/test.doc";
		
		
//		Document dc1 = new Document();
//		dc1.loadFromFile("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.doc");
//		dc1.saveToFile("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.docx",FileFormat.Docx_2013);
//		Document dc2 = new Document();
//		dc2.loadFromFile("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.doc");
//		dc2.saveToFile("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.docx",FileFormat.Docx_2013);
		
//		OutputStream dest = null;
//		List<OPCPackage> opcpList = new ArrayList<OPCPackage>();
//		int length = null == srcDocxs ? 0 : srcDocxs.length;
//		/**
//		 * 循环获取每个docx文件的OPCPackage对象
//		 */
//		for (int i = 0; i < length; i++) {
//			String doc = srcDocxs[i];
//			OPCPackage srcPackage =  null;
//			try {
//				srcPackage = OPCPackage.open(doc);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			if(null != srcPackage){
//				opcpList.add(srcPackage);
//			}
//		}
//		
//		int opcpSize = opcpList.size();
//		//获取的OPCPackage对象大于0时，执行合并操作
//		if(opcpSize > 0){
//			try {
//				dest = new FileOutputStream(newFile);
//				XWPFDocument src1Document = new XWPFDocument(opcpList.get(0));
//				CTBody src1Body = src1Document.getDocument().getBody();
//				//OPCPackage大于1的部分执行合并操作
//				if(opcpSize > 1){
//					for (int i = 1; i < opcpSize; i++) {
//						OPCPackage src2Package = opcpList.get(i);
//						XWPFDocument src2Document = new XWPFDocument(src2Package);
//						CTBody src2Body = src2Document.getDocument().getBody();
//						appendBody(src1Body, src2Body);
//					}
//				}
//				//将合并的文档写入目标文件中
//				src1Document.write(dest);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}finally{
//				//关闭流
//				IOUtils.closeQuietly(dest);
//			}
//		}
		
		
		
//		try {
//			System.out.println("-01-----"+new Date());
//			Document doc1 = new Document("/data/climatography/ZBAA_2016-2020CLIMATOGRAPHY.doc");
//			System.out.println("-01-----"+new Date());
//			Document doc2 = new Document("/data/climatography/ZBAA_常规机场气候表(26张)_2016_2022_A1.doc");
//			System.out.println("-02-----"+new Date());
//			Document doc3 = new Document();
//			FileOutputStream fos = new FileOutputStream(new File("/data/climatography/3.doc"));
//			doc3.removeAllChildren();
//			System.out.println("-1-----"+new Date());
//			doc3.appendDocument(doc1,ImportFormatMode.USE_DESTINATION_STYLES);
//			System.out.println("-1-----"+new Date());
//			doc3.appendDocument(doc2,ImportFormatMode.USE_DESTINATION_STYLES);
//			System.out.println("-2-----"+new Date());
//			doc3.save(fos, SaveFormat.DOC);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

//	private static void appendBody(CTBody src, CTBody append) throws XmlException {
//		XmlOptions optionsOuter = new XmlOptions();
//		optionsOuter.setSaveOuter();
//		String appendString = append.xmlText(optionsOuter);
//		String srcString = src.xmlText();
//		String prefix = srcString.substring(0, srcString.indexOf(">") + 1);
//		String mainPart = srcString.substring(srcString.indexOf(">") + 1,
//				srcString.lastIndexOf("<"));
//		String sufix = srcString.substring(srcString.lastIndexOf("<"));
//		String addPart = appendString.substring(appendString.indexOf(">") + 1,
//				appendString.lastIndexOf("<"));
//		CTBody makeBody = CTBody.Factory.parse(prefix + mainPart + addPart
//				+ sufix);
//		src.set(makeBody);
//	}
	
	
}

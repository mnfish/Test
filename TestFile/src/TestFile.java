import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
	public static String changeToPatternStr(String source)
	{
		StringBuilder builder=new StringBuilder("");
		int count=0;
		for(int i=0;i<source.length();i++)
		{
			if(source.charAt(i)!='*')
			{
				if(count!=0)builder.append("[a-zA-Z0-9]{"+count+"}");
				builder.append(source.charAt(i));
				count=0;
			}
			else
			{
				count++;
			}
		}
		if(count!=0)builder.append("[a-zA-Z0-9]{"+count+"}");
		String reg = builder.toString().replace("?", ".*");
		return reg;
	}
	
	public static void main(String[] args) {
		
//		String filePatternName = "FY4A"
//				+ "";
//		String filename = "FY4A-guiljo";
//		Pattern pattern = Pattern.compile(changeToPatternStr(filePatternName));
//		if(pattern.matcher(filename).matches()) {
//			System.out.println("匹配");
//		}else {
//			System.out.println("未匹配");
//		};
//		String midStr = "";
//		System.out.println(UUID.randomUUID());
//		byte[] bytes = (UUID.randomUUID().toString()).getBytes();
//		for (int i = 0; i < 18; i++) {
//			midStr += String.valueOf(bytes[i]).toCharArray()[String.valueOf(bytes[i]).toCharArray().length - 1];
//		}
//		System.out.println(midStr);
//		Long id = Long.parseLong(midStr);
//		System.out.println(id);
//		String path = "D:\\data\\was\\mydb\\backup";
//		File dir = new File(path);
//		File[] files = dir.listFiles();
//		String dd = "20210102";
//		for (File file : files) {
//			if(file.getName().compareTo(dd)<0) {
//				file.delete();
//			}
//		}
//		List<String> strings = new ArrayList<String>();
//		strings.add("1");
//		strings.add("2");
//		strings.add("3");
//		strings.add("4");
//		strings.add("5");
//		
//		for (int i = 0; i < strings.subList(0, 5).size(); i++) {
//			System.out.println(strings.subList(0, 5).get(i));
//		}
		
		
		
		
//		String s = "123.t";
//		String[] ss = s.split("\\.");
//		System.err.println(ss.length);
		
//		LocalDateTime time = LocalDateTime.now();
//		System.err.println(time);
//		LocalDateTime  timeLevel = time.withHour(0).withMinute(0).withSecond(0).withNano(0).plusMinutes(1430);
//		System.err.println(timeLevel);
		
//		LocalDateTime time = LocalDateTime.now();
//		System.out.println(time.getDayOfYear());
		
//		Integer s = 100000/1024;
//		System.out.println(s);
//		
//		String path = "/data/";
//		int last = path.lastIndexOf('/');
//		last = last==0?1:last;
//		System.out.println(last);
//		String parent = path.substring(0, last);
//		System.out.println(parent);
//		String child = path.substring(path.lastIndexOf('/')+1, path.length());
//		System.out.println(child);
		
//		File file = new File("D:\\data\\temp123");
//		LocalDateTime time = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault());
//		System.out.println(time);
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		
		
//		String path = "/home/database/data/";
//		int strNum=path.lastIndexOf("/");
//		String pathFirst=path.substring(0,strNum+1);//ls -l命令中有的不以“/”结尾导致没有数显监控信息进而导致的没有该类文件错误【20200410/13之前(0,strNum)】
//		String pathTwo=path.substring(strNum+1);
//		System.out.println(pathFirst+"   "+pathTwo);
		/*
		 * String lCloud1 = "select * from werewr where 1=1";
		 * 
		 * System.out.println(lCloud1.indexOf(" from "));
		 * System.out.println(lCloud1.indexOf("from"));
		 */
		
	}
	
	
	
}

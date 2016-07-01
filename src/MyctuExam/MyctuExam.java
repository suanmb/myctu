package MyctuExam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

public class MyctuExam {
	private String path;

	static public ArrayList<Integer> words = new ArrayList<Integer>();

	public MyctuExam(String path) {
		this.path = path;
	}

	/**
	 * 文本分析
	 */
	public void analyse() {
		try {
			RandomAccessFile rf = new RandomAccessFile(path, "rw");
			String str;
			String reg = "^[^.\\s,]+[\\s,]+(\\d+)$";// 不允许有.，避免有IP地址的
			// ipv4地址的正则表达式
			// ((?:(?:25[0-5]|2[0-4]\d|((1\d{2})|([1-9]?\d)))\.){3}(?:25[0-5]|2[0-4]\d|((1\d{2})|([1-9]?\d))))
			Pattern p = Pattern.compile(reg);

			while ((str = rf.readLine()) != null) {

				Matcher m = p.matcher(str);
				while (m.find()) {
					String strtmp = m.group(1);
					// System.out.println(strtmp);
					words.add(Integer.parseInt(strtmp));

				}

			}
			rf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getName(String path) throws IOException {
		try {
			System.out.println("即将读取文件！！！！：");
			File file = new File(path);
			if (file.isDirectory()) {
				System.out.println("即将读取文件2：");
				File[] dirFile = file.listFiles();
				for (File f : dirFile) {
					if (f.isDirectory())
						getName(f.getAbsolutePath());
					else {
						// if (f.getName().endsWith(".java"))
						// System.out.println(f.getAbsolutePath());

						words.clear();
						MyctuExam ta = new MyctuExam(f.getAbsolutePath());

						ta.analyse();
						System.out.println(f.getName());
						System.out.print(words.size() + " "
								+ Collections.frequency(words, new Integer(1)));
						System.out.print(" ");
						System.out.print(Collections.frequency(words,
								new Integer(2)) + " ");
						System.out.print(Collections.frequency(words,
								new Integer(3)) + " ");
						System.out.print(Collections.frequency(words,
								new Integer(4)) + " ");
						System.out.print(Collections.frequency(words,
								new Integer(5)) + " ");
						System.out.println(Collections.frequency(words,
								new Integer(6)));
					}
				}
			}
			else
			{
				System.out.println("警告！！！！打开文件失败！！！");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println("开始 1。。。。。。。。 " + startMili);
		short s1 = 1; 
		s1 = (short) (s1 + 1);
		System.out.println(s1);
		//getName("C:\\Users\\人\\Desktop\\wifi_all");
        Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
        
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);//true
        System.out.println(f3 == f4);//false，因为-128-127之外就不一样了
		long endMili = System.currentTimeMillis();
		System.out.println("结束 s" + endMili);
		System.out.println("总耗时为：" + (endMili - startMili) + "毫秒");
	}
}
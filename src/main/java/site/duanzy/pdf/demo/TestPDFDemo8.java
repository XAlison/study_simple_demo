package site.duanzy.pdf.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * 
 * @ClassName: TestPDFDemo4
 * @Description: 给PDF文件设置只读
 * @author leo
 * @date 2018年4月4日下午5:53:17
 * @version v1.0
 */
public class TestPDFDemo8 {
	
	public static void main(String[] args) throws DocumentException, IOException {
        // 创建文件
        Document document = new Document();
        // 建立一个书写器
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:\\Pdf\\test8.pdf"));

        // 只读权限
        writer.setEncryption("".getBytes(), "".getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);

        // 打开文件
        document.open();

        // 添加内容
        document.add(new Paragraph("password !!!!"));

        // 关闭文档
        document.close();
        // 关闭书写器
        writer.close();
    }
	
}

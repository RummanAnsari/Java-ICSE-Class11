import java.awt.*;
import java.awt.geom.*;
import java.awt.print.*;
public class PrintExample1 implements Printable {
    private final double INCH = 72;
    public PrintExample1() {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        if (printJob.printDialog()) {
            try { printJob.print(); } catch (PrinterException e) { e.printStackTrace(); }
        }
    }
    public int print(Graphics g, PageFormat pf, int page) {
        if (page == 0) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());
            // Logic to draw vertical and horizontal lines...
            return (PAGE_EXISTS);
        } else return (NO_SUCH_PAGE);
    }
}
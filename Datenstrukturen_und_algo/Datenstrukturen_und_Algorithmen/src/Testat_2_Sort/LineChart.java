package Testat_2_Sort;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class LineChart extends JFrame {
	private static final long serialVersionUID = 1L;

	 // Konstruktor ohne Parameter
	public LineChart(String titel) {
		
	}

	// Konstruktor mit Parametern zur Erstellung des LineCharts
    public LineChart(String title, long num1, long num2, long num3, long num4, long num5, int arrayLength) {
        super(title);

        // Erstellt Datenreihen für das Diagramm
        XYSeries line1 = createDataset("Best Case1(quickSort)", num1, arrayLength);
        XYSeries line2 = createDataset("Best Case2(mergeSort)", num2, arrayLength);
        XYSeries line3 = createDataset("Average Case1(InsertionSort)", num3, arrayLength);
        XYSeries line4 = createDataset("Worst Case1(selectionSort)", num4, arrayLength);
        XYSeries line5 = createDataset("Worst Case2(bubbleSort)", num5, arrayLength);
        
        // Erstellt ein Dataset, das alle Datenreihen enthält
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(line1);
        dataset.addSeries(line2);
        dataset.addSeries(line3);
        dataset.addSeries(line4);
        dataset.addSeries(line5);

        // Erstellt das Diagramm
        JFreeChart chart = ChartFactory.createXYLineChart(
        		title, // chart title
                "durchlauf in Array Length (n)",
                "Zeit(t) in Sekunden benötigt",
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true,
                false
        );
        
        // Ändert die Farben der Datenreihen im Diagramm
        XYPlot plot = chart.getXYPlot();
        plot.getRenderer().setSeriesPaint(0, Color.GREEN); // Best Case
        plot.getRenderer().setSeriesPaint(1, Color.GREEN); // Best Case
        plot.getRenderer().setSeriesPaint(2, Color.BLUE); // Average Case
        plot.getRenderer().setSeriesPaint(3, Color.RED); // Worst Case
        plot.getRenderer().setSeriesPaint(4, Color.RED); // Worst Case
        
        // Passt das Aussehen des Diagramms an (falls erforderlich)
        chart.setBackgroundPaint(Color.white);
        
        // Hover mit dem Mouse auf die Linie, die Informationen werden gezeigt
        LegendTitle legend = chart.getLegend();
        legend.setItemFont(new Font(title, Font.PLAIN, 12));

        // Erstellt und konfiguriert das Diagramm-Panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(560, 370));
        setContentPane(chartPanel);
    }

    // Methode zur Erstellung einer Datenreihe für das Diagramm
    private XYSeries createDataset(String caseName, long endTime, int arrayLength) {
        XYSeries series = new XYSeries(caseName);
        
        for (long i = 0; i <= arrayLength; i++) {
       	double diagoLinie = (double) i * endTime / arrayLength;
            series.add(i, diagoLinie);
        }

        return series;
    }
}

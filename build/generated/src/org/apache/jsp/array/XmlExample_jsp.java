package org.apache.jsp.array;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.example.FusionCharts;

public final class XmlExample_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"../scripts/fusioncharts.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("        ");

           
            /*
            Set up templates for the XML data. To create an XML string, using templates is an easier option that manual string concatenation.
        */
            
            String chartXML = "<chart __attributes__>__set__</chart>";
            String attributeTemplate = "__key__=\"__value__\" ";
            String setXMLTemplate = "<set label=\"__label__\" value=\"__value__\" />";

            /* chartobj is the map object that is initialized to store the chart attributes. */
            
            Map<String, String> chartobj = new HashMap<String, String>();
            
            chartobj.put("caption", "Split of Visitors by Age Group");
            chartobj.put("subCaption" , "Last year");
            chartobj.put("paletteColors" , "#0075c2,#1aaf5d,#f2c500,#f45b00,#8e0000");
            chartobj.put("bgColor" , "#ffffff");
            chartobj.put("showBorder" , "0");
            chartobj.put("use3DLighting" , "0");
            chartobj.put("showShadow" , "0");
            chartobj.put("enableSmartLabels" , "0");
            chartobj.put("startingAngle" , "0");
            chartobj.put("showPercentValues" , "1");
            chartobj.put("showPercentInTooltip" , "0");
            chartobj.put("decimals" , "1");
            chartobj.put("captionFontSize" , "14");
            chartobj.put("subcaptionFontSize" , "14");
            chartobj.put("subcaptionFontBold" , "0");
            chartobj.put("toolTipColor" , "#ffffff");
            chartobj.put( "toolTipBorderThickness" , "0");
            chartobj.put("toolTipBgColor" , "#000000");
            chartobj.put("toolTipBgAlpha" , "80");
            chartobj.put("toolTipBorderRadius" , "2");
            chartobj.put("toolTipPadding" , "5");
            chartobj.put("showHoverEffect" , "1");
            chartobj.put("showLegend" , "1");
            chartobj.put("legendBgColor" , "#ffffff");
            chartobj.put("legendBorderAlpha" , "0");
            chartobj.put("legendShadow" , "0");
            chartobj.put("legendItemFontSize" , "10");
            chartobj.put("legendItemFontColor" , "#666666");
            chartobj.put("useDataPlotColorForLabels" , "1");
            
            
            // The data to be plotted on the chart is stored in the 'dataobj' object.
            Map<String, String> dataobj = new HashMap<String, String>();
            
            dataobj.put("Teenage" , "1250400");
            dataobj.put("Adult" , "1463300");
            dataobj.put("Mid-age" , "1050700");
            dataobj.put("Senior" , "491000");
           
            /*
            To convert the chart attributes map object, 'chartobj', to XML, 
            we will use the templates instead of manipulating the strings. 
            Individual attribute strings will be stored in the array; they will then 
            be combined into one string.
        */
            
            ArrayList<String> chartAttributeList = new ArrayList<String>();
             // Iterate over each chart attribute and convert it into an attribute string
            for(Map.Entry cobj:chartobj.entrySet())
            {
                String tempAttributeTemplate = attributeTemplate;
                tempAttributeTemplate = tempAttributeTemplate.replaceAll("__key__", (String) cobj.getKey());
                tempAttributeTemplate = tempAttributeTemplate.replaceAll("__value__", (String) cobj.getValue()); 
                chartAttributeList.add(tempAttributeTemplate);
            }
            
            /*
            We again use the template to convert the chart data into the XML format. 
            */
            
            ArrayList<String> setList = new ArrayList<String>();
            // Iterate over each data and convert it into XML set
            for(Map.Entry dobj:dataobj.entrySet())
            {                
                String tempSetTemplate = setXMLTemplate;
                tempSetTemplate = tempSetTemplate.replaceAll("__label__", (String) dobj.getKey());
                tempSetTemplate = tempSetTemplate.replaceAll("__value__", (String) dobj.getValue()); 
                setList.add(tempSetTemplate);
            }   
            
         /*
            //Using Java 8 you can do this in a very clean way:
              String.join(delimiter, elements);
        */
            
            // Join the array using a single space as the delimiter.
            StringBuilder chartAttributeString = new StringBuilder();
            for(String s: chartAttributeList)
            chartAttributeString.append(" " +  s);
            
      
            // Join the array.
            StringBuilder setAttributeString = new StringBuilder();
            for(String s: setList)
            setAttributeString.append(s);
            
            // Replace the chart attributes
            chartXML = chartXML.replaceAll("__attributes__",  chartAttributeString.toString());
            // Replace the data sets
            chartXML = chartXML.replaceAll("__set__",  setAttributeString.toString());

            FusionCharts columnChart= new FusionCharts(
            "column2d",// chartType
                        "chart1",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "xml",// dataFormat
                       chartXML //dataSource
                    );
           
            
      out.write("\n");
      out.write("            \n");
      out.write("         ");
      out.print(columnChart.render());
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

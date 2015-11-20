package org.apache.jsp.staticExample;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.FusionCharts;

public final class staticJsonString_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--  Include the `fusioncharts.js` file. This file is needed to render the chart. Ensure that the path to this JS file is correct. Otherwise, it may lead to JavaScript errors. -->\n");
      out.write("        <script src=\"fusioncharts/fusioncharts.js\"></script>\n");
      out.write("        <!-- End -->\n");
      out.write("          </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("    ");

    /*  Step 1: Include the `FusionCharts.java` file as a package in your 
        project. Suppose the package named com.example 

        Step 3: Create a chart object using the FusionCharts JAVA class 
        constructor. Syntax for the constructor: 
        `FusionCharts("type of chart", "unique chart id", "width of chart",
                        "height of chart", "div id to render the chart", 
                        "data format", "data source")`   
    */
        FusionCharts area2dChart = new FusionCharts(
                    "Area2D",// chartType
                    "myFirstChart",// chartId
                    600,400,// chartWidth, chartHeight
                    "chart",// chartContainer
                    "json",// dataFormat
                    "{  \"chart\": {  \"caption\": \"Sales of Liquor\",  \"subCaption\": \"Last week\", \"xAxisName\": \"Day\",  \"yAxisName\": \"Sales (In USD)\",    \"numberPrefix\": \"$\",   \"paletteColors\": \"#0075c2\",  \"bgColor\": \"#ffffff\",    \"showBorder\": \"0\",    \"showCanvasBorder\": \"0\",    \"plotBorderAlpha\": \"10\",    \"usePlotGradientColor\": \"0\",    \"plotFillAlpha\": \"50\",    \"showXAxisLine\": \"1\",    \"axisLineAlpha\": \"25\",    \"divLineAlpha\": \"10\",    \"showValues\": \"1\",    \"showAlternateHGridColor\": \"0\",    \"captionFontSize\": \" 14\",    \"subcaptionFontSize\": \"14\",    \"subcaptionFontBold\": \"0\",    \"toolTipColor\": \"#ffffff\",    \"toolTipBorderThickness\": \"0\",    \"toolTipBgColor\": \"#000000\",    \" toolTipBgAlpha\": \"80\",    \"toolTipBorderRadius\": \"2\",    \"toolTipPadding\": \"5\"                                                },                                                \"data\": [{    \"label\": \" Mon\",    \" value\": \"4123\"                                                }, {    \"label\": \"Tue\",    \"value\": \"  4633\"  }, {    \"label\": \"Wed\",    \"value\": \"5507\"                                                }, {    \"label\": \"Thu\",    \"value\": \"4910\"                                                }, {    \"label\": \"Fri\",    \"value\": \"5529\"                                                }, {    \"label\": \"Sat\",    \"value\": \"5803\"                                                }, {    \"label\": \"Sun\",    \"value\": \"6202\"   }]  }"
                );
        
      out.write("\n");
      out.write("        ");

            /* **Step 4:** Render the chart */
        
      out.write("\n");
      out.write("        ");
      out.print(area2dChart.render());
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

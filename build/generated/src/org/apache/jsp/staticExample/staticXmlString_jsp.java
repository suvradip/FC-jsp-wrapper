package org.apache.jsp.staticExample;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.FusionCharts;

public final class staticXmlString_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <!--  Include the `fusioncharts.js` file. This file is needed to render the chart. Ensure that the path to this JS file is correct. Otherwise, it may lead to JavaScript errors. -->\n");
      out.write("        <script src=\"fusioncharts/fusioncharts.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("    ");

    /*  Step 1: Include the `FusionCharts.java` file as a package in your 
        project. Suppose the package named com.example 

        Step 2:Include the package in the file where you want to show 
        FusionCharts as follows.
        
        Step 3: Create a chart object using the FusionCharts JAVA class 
        constructor. Syntax for the constructor: 
        `FusionCharts("type of chart", "unique chart id", "width of chart",
                        "height of chart", "div id to render the chart", 
                        "data format", "data source")`   
    */ 
            FusionCharts lineChart = new FusionCharts(
                        "line",// chartType
                        "myFirstChart",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "xml",// dataFormat
                        "<chart caption=\"Total footfall in Bakersfield Central\" subcaption=\"Last week\" xaxisname=\"Day\" yaxisname=\"No. of Visitors\" linethickness=\"2\" palettecolors=\"#0075c2\" basefontcolor=\"#333333\" basefont=\"Helvetica Neue,Arial\" captionfontsize=\"14\" subcaptionfontsize=\"14\" subcaptionfontbold=\"0\" showborder=\"0\" bgcolor=\"#ffffff\" showshadow=\"0\" canvasbgcolor=\"#ffffff\" canvasborderalpha=\"0\" divlinealpha=\"100\" divlinecolor=\"#999999\" divlinethickness=\"1\" divlinedashed=\"1\" divlinedashlen=\"1\" divlinegaplen=\"1\" showxaxisline=\"1\" xaxislinethickness=\"1\" xaxislinecolor=\"#999999\" showalternatehgridcolor=\"0\">                                                <set label=\"Mon\" value=\"15123\" />                                                <set label=\"Tue\" value=\"14233\" />                                                <set label=\"Wed\" value=\"23507\" />                                                <set label=\"Thu\" value=\"9110\" />                                                <set label=\"Fri\" value=\"15529\" />                                                <set label=\"Sat\" value=\"20803\" />                                                <set label=\"Sun\" value=\"19202\" />                                            </chart>"
                    );
        
    /* 
        Step 4: Render the chart
    */
        
      out.write("\n");
      out.write("        ");
      out.print(lineChart.render());
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

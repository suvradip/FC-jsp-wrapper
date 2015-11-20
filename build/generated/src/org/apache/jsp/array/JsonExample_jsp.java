package org.apache.jsp.array;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.example.FusionCharts;
import com.google.gson.*;

public final class JsonExample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"../scripts/fusioncharts.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        <div id=\"chart\"></div>\n");
      out.write("        ");

              Gson gson = new Gson();
            
            Map<String, String> chart = new HashMap<String, String>();
            
            chart.put("caption", "Split of Visitors by Age Group");
            chart.put("subCaption" , "Last year");
            chart.put("paletteColors" , "#0075c2,#1aaf5d,#f2c500,#f45b00,#8e0000");
            chart.put("bgColor" , "#ffffff");
            chart.put("showBorder" , "0");
            chart.put("use3DLighting" , "0");
            chart.put("showShadow" , "0");
            chart.put("enableSmartLabels" , "0");
            chart.put("startingAngle" , "0");
            chart.put("showPercentValues" , "1");
            chart.put("showPercentInTooltip" , "0");
            chart.put("decimals" , "1");
            chart.put("captionFontSize" , "14");
            chart.put("subcaptionFontSize" , "14");
            chart.put("subcaptionFontBold" , "0");
            chart.put("toolTipColor" , "#ffffff");
            chart.put( "toolTipBorderThickness" , "0");
            chart.put("toolTipBgColor" , "#000000");
            chart.put("toolTipBgAlpha" , "80");
            chart.put("toolTipBorderRadius" , "2");
            chart.put("toolTipPadding" , "5");
            chart.put("showHoverEffect" , "1");
            chart.put("showLegend" , "1");
            chart.put("legendBgColor" , "#ffffff");
            chart.put("legendBorderAlpha" , "0");
            chart.put("legendShadow" , "0");
            chart.put("legendItemFontSize" , "10");
            chart.put("legendItemFontColor" , "#666666");
            chart.put("useDataPlotColorForLabels" , "1");
            
            Map<String, String> data = new HashMap<String, String>();
            
            data.put("Teenage" , "1250400");
            data.put("Adult" , "1463300");
            data.put("Mid-age" , "1050700");
            data.put("Senior" , "491000");
           
            
            
            ArrayList alData = new ArrayList();
             for(Map.Entry m:data.entrySet()){
                 
                 Map<String, String> lv = new HashMap<String, String>();
                 lv.put("label", (String) m.getKey());
                 lv.put("value", (String) m.getValue());
                 alData.add(lv);
               }    
            
             Map<String, String> dataMap = new LinkedHashMap<String, String>();  
             
             
             dataMap.put("chart", gson.toJson(chart));
             dataMap.put("data", gson.toJson(alData));
             
//           ArrayList al=new ArrayList();
//           al.add(chart);
//           al.add(dataMap);
//           
//            ArrayList sb = new ArrayList();;
//           
//             
//            
//             
//            for(int i=0;i<al.size();i++)
//            {
//             if(al.get(i) instanceof Map<?,?>)
//             {
//              sb.add("chart:"+gson.toJson(al.get(i)));    
//             }
//             else if(al.get(i) instanceof ArrayList)
//             {
//                ArrayList al1= new ArrayList();
//                al1= (ArrayList) al.get(i);
//                
//                ArrayList sb1 = new ArrayList();
//                
//                for(int k=0; k<al1.size(); k++)
//                {
//                    sb1.add(gson.toJson(al1.get(k)));
//                }
//                sb.add("data:"+sb1);
//             
//             }
//                
//                    
//            }
            
           out.println(gson.toJson(dataMap));
                   
            
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("             ");

            FusionCharts columnChart= new FusionCharts(
            "column2d",// chartType
                        "chart1",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        gson.toJson(dataMap)
                    );
           
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");
      out.print(columnChart.render());
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

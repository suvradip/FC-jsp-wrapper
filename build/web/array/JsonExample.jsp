<%-- 
    Document   : JsonExample
    Created on : 18 Nov, 2015, 5:11:09 PM
    Author     : suvradipsaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.example.FusionCharts" %>
<%@page import="com.google.gson.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../scripts/fusioncharts.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <div id="chart"></div>
        <%
              Gson gson = new Gson();
            
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
            
            Map<String, String> dataobj = new HashMap<String, String>();
            
            dataobj.put("Teenage" , "1250400");
            dataobj.put("Adult" , "1463300");
            dataobj.put("Mid-age" , "1050700");
            dataobj.put("Senior" , "491000");
           
            
            
            ArrayList alData = new ArrayList();
             for(Map.Entry m:dataobj.entrySet()){
                 
                 Map<String, String> lv = new HashMap<String, String>();
                 lv.put("label", (String) m.getKey());
                 lv.put("value", (String) m.getValue());
                 alData.add(lv);
               }    
            
             Map<String, String> dataMap = new LinkedHashMap<String, String>();  
             
             
             dataMap.put("chart", gson.toJson(chartobj));
             dataMap.put("data", gson.toJson(alData));

            FusionCharts columnChart= new FusionCharts(
            "column2d",// chartType
                        "chart1",// chartId
                        600,400,// chartWidth, chartHeight
                        "chart",// chartContainer
                        "json",// dataFormat
                        gson.toJson(dataMap)
                    );
           
            %>
            
            <%=columnChart.render()%>
            
            
    </body>
</html>

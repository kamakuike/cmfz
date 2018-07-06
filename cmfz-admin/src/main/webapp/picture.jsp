<%--
  Created by IntelliJ IDEA.
  User: 13659
  Date: 2018/7/6
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function(){
        $("#dat").datagrid({
             nowrap:false,//可以不再同一行展示数据
            singleSelect:true,//只允许选择一行数据
            pagination:true,
            fit:true,
            fitColumns:true,
            pageNumber:1,
             pageSize:10,
             pageList:[10,20,30],
            url:'${pageContext.request.contextPath}/picture/search',
            columns:[[
                {field:'pictureId',title:'标识编号',width:100},
                {field:'pictureName',title:'文件名',width:100},
                {field:'pictureDescription',title:'描述信息',width:100},
                {field:'pictureStatus',title:'轮播图状态',width:100},
                {field:'pictureDate',title:'轮播图创建时间',width:100},
                {field:'opt',title:'操作',width:100,formatter: function(){

                    return "<a class='change'  iconCls='icon-edit'>修改</a>";

                }
                }
            ]],
             onLoadSuccess:function(){
             $(".change").linkbutton({
             iconCls:"icon-edit",
             })
             },
             toolbar: [{
             iconCls: 'icon-add',
             text:"新增轮播图",
             handler: function(){
             $("#dialog").dialog({
             title:'新增轮播图' ,
             iconCls:"icon-add",
             minimizable:true,
             maximizable:true,
             resizable:true,
             collapsible:true,
             width: 400,
             height: 200,
             closed: false,
             cache: false,
             href: '${pageContext.request.contextPath}/addPicture.jsp',
             modal: true

             })
             }
             },'-',{
             iconCls: 'icon-help',
             text:"帮助",
             handler: function(){

             }
             }],

             view: detailview,
             detailFormatter: function(rowIndex, rowData){
             console.log(rowData.pictureName);
             return '<table><tr>' +
             '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/upload/'+rowData.pictureName+'" style="height:200px;"></td>' +
             '<td style="border:0">' +
             '</tr></table>';
             }
        })
    })
</script>
<table id="dat"></table>
<div id="dialog" ></div>

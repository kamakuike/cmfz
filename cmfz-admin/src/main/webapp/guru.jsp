<%--
  Created by IntelliJ IDEA.
  User: 13659
  Date: 2018/7/6
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" isELIgnored="false" %>
<script >
    $(function(){
        $("#guru").datagrid({
            url:"${pageContext.request.contextPath}/guru/search",
            fitColumns:true,
            fit:true,
            pagination:true,
            toolbar: [{
                iconCls: 'icon-edit',
                text:"新增",
                handler: function(){

                }
            },'-',{
                iconCls: 'icon-help',
                text:"修改",
                handler: function(){

                }
            }],

            columns:[[{
                field:"guruId",title:"上师编号",width:100
            },{
                field:"guruName",title:"上师法号",width:100
            },{
                field:"guruPhoto",title:"上师头像",width:100
            },{
                field:"guruIntro",title:"上师简介",width:100
            }]]
        })
    })

</script>



    <table id="guru"></table>




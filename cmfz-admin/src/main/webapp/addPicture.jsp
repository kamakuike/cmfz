<%--
  Created by IntelliJ IDEA.
  User: 13659
  Date: 2018/7/5
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function(){
        $("#cancel").linkbutton({
            onClick:function(){
                $("#dialog").dialog("close");
            }
        })
        $("#commit").linkbutton({
            onClick:function(){
                $("#ff").form("submit",{
                    url:"${pageContext.request.contextPath}/picture/add",
                    onSubmit:function(){
                        var isValid = $(this).form('validate');
                        if (!isValid){
                            $.messager.show({
                                title:'我的消息',
                                msg:"表单验证未通过",
                                timeout:5000,
                                showType:'slide'

                            });
                            $("#dialog").dialog("close");
                            return false;
                        }
                        return isValid;	// 返回false终止表单提交

                    },
                    success:function(data){
                        $.messager.show({
                            title:'我的消息',
                            msg:data,
                            timeout:5000,
                            showType:'slide'
                        });
                        $("#dialog").dialog("close");
                        $('#tt').datagrid("reload");
                    }
                })
            }

        })
    })
</script>
<form id="ff" method="post"  style="text-align: center" accept-charset="UTF-8" enctype="multipart/form-data">
    <br/>
    <div>
        <label >轮播图描述:</label>
        <input class="easyui-validatebox" type="text" name="pictureDescription" data-options="required:true" style="width:200px;" />
    </div>
    <br/>
    <div>
        <label >轮播图状态:</label>
        <select id="cc" class="easyui-validatebox" name="pictureStatus" data-options="required:true" style="width:200px;">
            <option value="aa">不展示</option>
            <option>展示</option>

        </select>

    </div>
    <br/>
    <div>
        <label >上传轮播图:</label>
        <input class="easyui-filebox" name="file" style="width:200px" data-options="buttonText:'选择文件', buttonIcon:'icon-add'">
    </div>
    <br/>
    <a id="commit" class="easyui-linkbutton" iconCls="icon-add">保存</a>
    <a id="cancel" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
</form>



<aside class="Hui-aside">
	<div class="menu_dropdown bk_2" >
   <#if menuList?exists>
	   <#list menuList as p>
           <dl id="menu-pay">
               <dt><i class="Hui-iconfont"><#if p.syImage?? >${p.syImage}</#if></i> ${p.menuName}<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
               <dd>
                   <ul>
					   <#if p.sysMenuList?exists>
					      <#list p.sysMenuList as m>
                              <li><a data-href="<#if m.url1?? >${m.url1}</#if>" data-title="${m.menuName1}" href="javascript:void(0)">${m.menuName1}</a></li>
					      </#list>
					   </#if>
                   </ul>
               </dd>
           </dl>
	   </#list>
	</#if>
	</div>
    <div class="menu_dropdown bk_2" style="display:none">
        <dl id="menu-aaaaa">
            <dt><i class="Hui-iconfont">&#xe616;</i> 二级导航1<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="article-list.html" data-title="资讯管理" href="javascript:void(0)">三级导航</a></li>
                </ul>
            </dd>
        </dl>
    </div>

    <div class="menu_dropdown bk_2" style="display:none">
        <dl id="menu-bbbbb">
            <dt><i class="Hui-iconfont">&#xe616;</i> 二级导航2<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="article-list.html" data-title="资讯管理" href="javascript:void(0)">三级导航</a></li>
                </ul>
            </dd>
        </dl>
    </div>

    <div class="menu_dropdown bk_2" style="display:none">
        <dl id="menu-ccccc">
            <dt><i class="Hui-iconfont">&#xe616;</i> 二级导航3<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="/echarts/testLayUi.html" data-title="资讯管理" href="javascript:void(0)">三级导航</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>

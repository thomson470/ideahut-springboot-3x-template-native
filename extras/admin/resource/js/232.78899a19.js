"use strict";(globalThis["webpackChunkideahut_quasar_admin"]=globalThis["webpackChunkideahut_quasar_admin"]||[]).push([[232],{2232:(e,l,t)=>{t.r(l),t.d(l,{default:()=>H});var a=t(1758),i=t(8790),o=t(9104);const n={class:"row q-mt-none q-pa-sm"},s={class:"col-md-6 col-xs-12 q-pa-xs q-mb-sm"},r={class:"col-md-6 col-xs-12 q-pa-xs q-mb-sm"},d={class:"col-md-12 col-xs-12 q-pa-xs q-mb-sm"},c={class:"full-width row flex-center text-accent q-gutter-sm"},p={class:"text-subtitle2"},g={class:"text-caption"},u={class:"text-left q-pa-sm"},m={class:"text-weight-bolder"},b={class:"q-ml-md"},y={class:"text-weight-bolder"},_={class:"text-weight-bolder"},f={class:"col-12 text-center"},h={key:1},k={class:"col-12 text-center"},w={key:1};function q(e,l,t,q,v,x){const F=(0,a.g2)("q-icon"),$=(0,a.g2)("q-input"),C=(0,a.g2)("q-table"),A=(0,a.g2)("q-tooltip"),V=(0,a.g2)("q-btn"),W=(0,a.g2)("q-inner-loading"),X=(0,a.g2)("q-th"),L=(0,a.g2)("q-tr"),Q=(0,a.g2)("q-td"),E=(0,a.g2)("q-item-label"),T=(0,a.g2)("q-item-section"),z=(0,a.g2)("q-item"),P=(0,a.g2)("q-list"),K=(0,a.g2)("q-btn-dropdown"),U=(0,a.g2)("q-card-section"),I=(0,a.g2)("q-card-actions"),Z=(0,a.g2)("q-card"),N=(0,a.g2)("q-dialog"),S=(0,a.g2)("EntityView"),R=(0,a.gN)("close-popup");return(0,a.uX)(),(0,a.CE)(a.FK,null,[(0,a.Lk)("div",n,[(0,a.Lk)("div",s,[q.setting.rows?.length?((0,a.uX)(),(0,a.Wv)(C,{key:0,class:"table-sticky-header no-column",style:{"max-height":"36vh"},title:e.$t("label.setting"),rows:q.setting.rows,separator:"cell","rows-per-page-options":[0],filter:q.setting.filter,"hide-bottom":"","hide-header":"",bordered:"",dense:""},{"top-right":(0,a.k6)((()=>[(0,a.bF)($,{borderless:"",dense:"",debounce:"300",modelValue:q.setting.filter,"onUpdate:modelValue":l[0]||(l[0]=e=>q.setting.filter=e),placeholder:e.$t("label.search")},{append:(0,a.k6)((()=>[(0,a.bF)(F,{name:"search"})])),_:1},8,["modelValue","placeholder"])])),_:1},8,["title","rows","filter"])):(0,a.Q3)("",!0)]),(0,a.Lk)("div",r,[q.metadata.rows?.length?((0,a.uX)(),(0,a.Wv)(C,{key:0,class:"table-sticky-header no-column",style:{"max-height":"36vh"},title:e.$t("label.metadata"),rows:q.metadata.rows,separator:"cell","rows-per-page-options":[0],filter:q.metadata.filter,"hide-bottom":"","hide-header":"",bordered:"",dense:""},{"top-right":(0,a.k6)((()=>[(0,a.bF)($,{borderless:"",dense:"",debounce:"300",modelValue:q.metadata.filter,"onUpdate:modelValue":l[1]||(l[1]=e=>q.metadata.filter=e),placeholder:e.$t("label.search")},{append:(0,a.k6)((()=>[(0,a.bF)(F,{name:"search"})])),_:1},8,["modelValue","placeholder"])])),_:1},8,["title","rows","filter"])):(0,a.Q3)("",!0)]),(0,a.Lk)("div",d,[(0,a.bF)(C,{class:"table-sticky-header",title:e.$t("label.entity"),rows:q.entity.rows,columns:q.columns.entity,loading:q.entity.loading,selection:"single",pagination:q.entity.pagination,"onUpdate:pagination":l[3]||(l[3]=e=>q.entity.pagination=e),dense:e.$q.screen.lt.md,"no-data-label":e.$t("error.data_not_available"),"rows-per-page-label":" ","selected-rows-label":e=>{},"rows-per-page-options":[10,20,30,40,50],"binary-state-sort":"",separator:"cell",onRequest:x.get_entities,bordered:""},{"top-right":(0,a.k6)((()=>[(0,a.bF)(V,{glossy:"",round:"",dense:"",size:"sm",class:"q-ma-none q-ml-md",icon:"refresh",loading:q.entity.loading,onClick:x.on_entity_refresh_click},{default:(0,a.k6)((()=>[(0,a.bF)(A,null,{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e.$t("label.refresh")),1)])),_:1})])),_:1},8,["loading","onClick"])])),"no-data":(0,a.k6)((({message:e})=>[(0,a.Lk)("div",c,[(0,a.bF)(F,{size:"2em",name:"block"}),(0,a.Lk)("span",p,(0,i.v_)(e),1)])])),loading:(0,a.k6)((()=>[(0,a.bF)(W,{showing:"",color:"primary"})])),pagination:(0,a.k6)((e=>[e.pagesNumber>2?((0,a.uX)(),(0,a.Wv)(V,{key:0,glossy:"",size:"sm",icon:"first_page",color:"grey-8",round:"",dense:"",flat:"",disable:e.isFirstPage,onClick:e.firstPage},null,8,["disable","onClick"])):(0,a.Q3)("",!0),(0,a.bF)(V,{glossy:"",size:"sm",icon:"chevron_left",color:"grey-8",class:"q-ml-sm q-mr-xs",round:"",dense:"",flat:"",disable:e.isFirstPage,onClick:e.prevPage},null,8,["disable","onClick"]),(0,a.bF)($,{dense:"",borderless:"",type:"number","input-class":"text-center q-ml-xs q-mr-xs","input-style":"max-width: 60px;",modelValue:q.entity.pagination.page,"onUpdate:modelValue":[l[2]||(l[2]=e=>q.entity.pagination.page=e),x.on_entity_page_changed]},(0,a.eX)({_:2},[!0===q.entity.pagination.count?{name:"append",fn:(0,a.k6)((()=>[(0,a.Lk)("span",g," / "+(0,i.v_)(e.pagesNumber),1)])),key:"0"}:void 0]),1032,["modelValue","onUpdate:modelValue"]),(0,a.bF)(V,{glossy:"",size:"sm",icon:"chevron_right",color:"grey-8",class:"q-ml-sm q-mr-sm",round:"",dense:"",flat:"",disable:e.isLastPage,onClick:e.nextPage},null,8,["disable","onClick"]),e.pagesNumber>2&&!0===q.entity.pagination.count?((0,a.uX)(),(0,a.Wv)(V,{key:1,glossy:"",size:"sm",icon:"last_page",color:"grey-8",round:"",dense:"",flat:"",disable:e.isLastPage,onClick:e.lastPage},null,8,["disable","onClick"])):(0,a.Q3)("",!0)])),header:(0,a.k6)((e=>[(0,a.bF)(L,{props:e},{default:(0,a.k6)((()=>[(0,a.bF)(X,{"auto-width":""}),((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(e.cols,(l=>((0,a.uX)(),(0,a.Wv)(X,{key:l.name,props:e},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(l.label),1)])),_:2},1032,["props"])))),128))])),_:2},1032,["props"])])),body:(0,a.k6)((l=>[(0,a.bF)(L,{props:l},{default:(0,a.k6)((()=>[(0,a.bF)(Q,{"auto-width":""},{default:(0,a.k6)((()=>[(0,a.bF)(V,{glossy:"",round:"",dense:"",size:"sm",class:"q-ma-none q-ml-xs q-mr-sm",color:l.expand?"deep-purple":"accent",icon:l.expand?"remove":"add",onClick:e=>l.expand=!l.expand},{default:(0,a.k6)((()=>[(0,a.bF)(A,null,{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e.$t("label.view")),1)])),_:1})])),_:2},1032,["color","icon","onClick"])])),_:2},1024),((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(l.cols,(e=>((0,a.uX)(),(0,a.Wv)(Q,{key:e.name,props:l,style:(0,i.Tr)("type"===e.name?"cursor: pointer;":""),onClick:t=>"type"===e.name?x.on_dialog_entity_show(l.row.type):null},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e.value),1)])),_:2},1032,["props","style","onClick"])))),128))])),_:2},1032,["props"]),l.expand?(0,a.bo)(((0,a.uX)(),(0,a.Wv)(L,{key:0,props:l},{default:(0,a.k6)((()=>[(0,a.bF)(Q,{colspan:"100%"},{default:(0,a.k6)((()=>[(0,a.Lk)("div",u,[(0,a.Lk)("div",null,[(0,a.bF)(K,{glossy:"",dense:"",size:"sm",class:"q-ml-xs",color:"light-green-10",icon:"content_copy",label:e.$t("label.replica"),loading:q.loading.replica[l.row.type]},{default:(0,a.k6)((()=>[(0,a.bF)(P,null,{default:(0,a.k6)((()=>[((0,a.uX)(),(0,a.CE)(a.FK,null,(0,a.pI)(10,(e=>(0,a.bo)((0,a.bF)(z,{key:e,clickable:"",onClick:t=>x.on_entity_replica_click(l,e)},{default:(0,a.k6)((()=>[(0,a.bF)(T,null,{default:(0,a.k6)((()=>[(0,a.bF)(E,null,{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e),1)])),_:2},1024)])),_:2},1024)])),_:2},1032,["onClick"]),[[R]]))),64))])),_:2},1024)])),_:2},1032,["label","loading"]),(0,a.bF)(V,{glossy:"",dense:"",size:"sm",class:"q-ml-sm q-pr-sm",color:"orange-10",icon:"view_quilt",label:e.$t("label.grid"),loading:q.loading.grid[l.row.type],onClick:e=>x.on_entity_grid_click(l)},null,8,["label","loading","onClick"])]),(0,a.bF)(C,{class:"table-child q-mt-sm",columns:q.columns.field,rows:l.row.id.fields,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",dense:""},{top:(0,a.k6)((()=>[(0,a.Lk)("span",m,(0,i.v_)(e.$t("label.identifier")),1),(0,a.Lk)("span",b,"[ "+(0,i.v_)(e.$t("label.type"))+": "+(0,i.v_)(l.row.id.type)+(0,i.v_)(q.util.isString(l.row.id.name)?", "+e.$t("label.field")+": "+l.row.id.name:"")+" ]",1)])),_:2},1032,["columns","rows"]),(0,a.bF)(C,{class:"table-child q-mt-sm",columns:q.columns.field,rows:l.row.fields,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",dense:""},{top:(0,a.k6)((()=>[(0,a.Lk)("span",y,(0,i.v_)(e.$t("label.field")),1)])),body:(0,a.k6)((e=>[(0,a.bF)(L,{props:e},{default:(0,a.k6)((()=>[((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(e.cols,(l=>((0,a.uX)(),(0,a.Wv)(Q,{key:l.name,props:e,style:(0,i.Tr)("type"===l.name&&!0===e.row.isEntity?"cursor: pointer;":""),onClick:t=>"type"===l.name&&!0===e.row.isEntity?x.on_dialog_entity_show(e.row.type):null},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(l.value),1)])),_:2},1032,["props","style","onClick"])))),128))])),_:2},1032,["props"])])),_:2},1032,["columns","rows"]),l.row.transients?.length?((0,a.uX)(),(0,a.Wv)(C,{key:0,class:"table-child q-mt-sm",columns:q.columns.transient,rows:l.row.transients,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",dense:""},{top:(0,a.k6)((()=>[(0,a.Lk)("span",_,(0,i.v_)(e.$t("label.transient")),1)])),body:(0,a.k6)((e=>[(0,a.bF)(L,{props:e},{default:(0,a.k6)((()=>[((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(e.cols,(l=>((0,a.uX)(),(0,a.Wv)(Q,{key:l.name,props:e,style:(0,i.Tr)("type"===l.name&&!0===e.row.isEntity?"cursor: pointer;":""),onClick:t=>"type"===l.name&&!0===e.row.isEntity?x.on_dialog_entity_show(e.row.type):null},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(l.value),1)])),_:2},1032,["props","style","onClick"])))),128))])),_:2},1032,["props"])])),_:2},1032,["columns","rows"])):(0,a.Q3)("",!0)])])),_:2},1024)])),_:2},1032,["props"])),[[o.aG,l.expand]]):(0,a.Q3)("",!0)])),_:1},8,["title","rows","columns","loading","pagination","dense","no-data-label","onRequest"])])]),(0,a.bF)(N,{modelValue:q.dialog.replica.show,"onUpdate:modelValue":l[4]||(l[4]=e=>q.dialog.replica.show=e),persistent:""},{default:(0,a.k6)((()=>[(0,a.bF)(Z,{style:(0,i.Tr)(e.$q.screen.lt.md?"width: 99vw; max-width: 100vw;":"width: 50vw; max-width: 51vw;")},{default:(0,a.k6)((()=>[(0,a.bF)(U,{class:"q-pa-none header-main"},{default:(0,a.k6)((()=>[(0,a.bF)(z,{class:"q-pr-none"},{default:(0,a.k6)((()=>[(0,a.bF)(T,null,{default:(0,a.k6)((()=>[(0,a.bF)(E,{class:"text-white"},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(q.dialog.replica.title),1)])),_:1})])),_:1}),(0,a.bF)(T,{side:""},{default:(0,a.k6)((()=>[(0,a.bo)(((0,a.uX)(),(0,a.Wv)(V,{class:"text-caption text-white q-pl-xs q-pr-xs q-mr-xs",flat:"",round:"",glossy:"",icon:"close"},{default:(0,a.k6)((()=>[(0,a.bF)(A,null,{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e.$t("label.close")),1)])),_:1})])),_:1})),[[R]])])),_:1})])),_:1})])),_:1}),(0,a.bF)(U,{style:(0,i.Tr)(e.$q.screen.lt.md?"max-height: 50vh;":"max-height: 70vh;"),class:"q-pa-xs q-mt-xs scroll"},{default:(0,a.k6)((()=>[(0,a.bF)(P,null,{default:(0,a.k6)((()=>[((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(q.dialog.replica.sqls,((e,l)=>((0,a.uX)(),(0,a.Wv)(z,{key:l,class:"q-pa-none"},{default:(0,a.k6)((()=>[(0,a.bF)($,{type:"text",modelValue:q.dialog.replica.sqls[l],"onUpdate:modelValue":e=>q.dialog.replica.sqls[l]=e,filled:"",dense:"",readonly:"",autogrow:"",class:"text-left text-caption q-mt-xs full-width"},null,8,["modelValue","onUpdate:modelValue"])])),_:2},1024)))),128))])),_:1})])),_:1},8,["style"]),(0,a.bF)(I,{class:"row"},{default:(0,a.k6)((()=>[(0,a.Lk)("div",f,[q.dialog.replica.copied?((0,a.uX)(),(0,a.CE)("span",h,(0,i.v_)(e.$t("label.copied_to_clipboard")),1)):((0,a.uX)(),(0,a.Wv)(V,{key:0,"no-caps":"",ripple:"",glossy:"",icon:"assignment",label:e.$t("label.copy_to_clipboard"),color:"secondary",onClick:x.on_entity_replica_copy_to_clipboard_click},null,8,["label","onClick"]))])])),_:1})])),_:1},8,["style"])])),_:1},8,["modelValue"]),(0,a.bF)(N,{modelValue:q.dialog.grid.show,"onUpdate:modelValue":l[6]||(l[6]=e=>q.dialog.grid.show=e),persistent:""},{default:(0,a.k6)((()=>[(0,a.bF)(Z,{style:(0,i.Tr)(e.$q.screen.lt.md?"width: 99vw; max-width: 100vw;":"width: 50vw; max-width: 51vw;")},{default:(0,a.k6)((()=>[(0,a.bF)(U,{class:"q-pa-none header-main"},{default:(0,a.k6)((()=>[(0,a.bF)(z,{class:"q-pr-none"},{default:(0,a.k6)((()=>[(0,a.bF)(T,null,{default:(0,a.k6)((()=>[(0,a.bF)(E,{class:"text-white"},{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(q.dialog.grid.title),1)])),_:1})])),_:1}),(0,a.bF)(T,{side:""},{default:(0,a.k6)((()=>[(0,a.bo)(((0,a.uX)(),(0,a.Wv)(V,{class:"text-caption text-white q-pl-xs q-pr-xs q-mr-xs",flat:"",round:"",glossy:"",icon:"close"},{default:(0,a.k6)((()=>[(0,a.bF)(A,null,{default:(0,a.k6)((()=>[(0,a.eW)((0,i.v_)(e.$t("label.close")),1)])),_:1})])),_:1})),[[R]])])),_:1})])),_:1})])),_:1}),(0,a.bF)(U,{style:(0,i.Tr)(e.$q.screen.lt.md?"max-height: 50vh;":"max-height: 70vh;"),class:"q-pa-xs q-mt-xs scroll"},{default:(0,a.k6)((()=>[(0,a.bF)($,{type:"text",modelValue:q.dialog.grid.text,"onUpdate:modelValue":l[5]||(l[5]=e=>q.dialog.grid.text=e),filled:"",dense:"",readonly:"",autogrow:"",class:"text-left text-caption q-mt-xs"},null,8,["modelValue"])])),_:1},8,["style"]),(0,a.bF)(I,{class:"row"},{default:(0,a.k6)((()=>[(0,a.Lk)("div",k,[q.dialog.grid.copied?((0,a.uX)(),(0,a.CE)("span",w,(0,i.v_)(e.$t("label.copied_to_clipboard")),1)):((0,a.uX)(),(0,a.Wv)(V,{key:0,"no-caps":"",ripple:"",glossy:"",icon:"assignment",label:e.$t("label.copy_to_clipboard"),color:"secondary",onClick:x.on_entity_grid_copy_to_clipboard_click},null,8,["label","onClick"]))])])),_:1})])),_:1},8,["style"])])),_:1},8,["modelValue"]),(0,a.bF)(N,{modelValue:q.dialog.entity.show,"onUpdate:modelValue":l[7]||(l[7]=e=>q.dialog.entity.show=e),persistent:"","transition-show":"slide-down","transition-hide":"none","full-width":""},{default:(0,a.k6)((()=>[(0,a.bF)(S,{parameters:q.dialog.entity.parameters},null,8,["parameters"])])),_:1},8,["modelValue"])],64)}t(239);var v=t(8734),x=t(2084),F=t(9928),$=t(526);const C={components:{EntityView:(0,a.$V)((()=>Promise.all([t.e(121),t.e(708)]).then(t.bind(t,9708))))},setup(){return{util:F.Z,copyToClipboard:x.A,loading:(0,v.KR)({replica:{},grid:{}}),manager:(0,v.KR)(null),setting:(0,v.KR)({rows:[],filter:null}),metadata:(0,v.KR)({rows:[],filter:null}),entity:(0,v.KR)({rows:[],pagination:{page:1,rowsPerPage:10,sortBy:"type",descending:!1,count:!0},loading:!1}),columns:(0,v.KR)({entity:[],field:[],transient:[]}),dialog:(0,v.KR)({entity:{show:!1,parameters:null},replica:{show:!1,title:null,sqls:[],copied:!1},grid:{show:!1,title:null,text:null,copied:!1}})}},created(){let e=this;e.columns.entity=[{name:"type",label:e.$t("label.type"),field:"type",align:"left",sortable:!0},{name:"id",label:e.$t("label.id"),field:"id",align:"left",sortable:!0,format:function(e,l){return e.type}},{name:"table",label:e.$t("label.table"),field:"table",align:"left",sortable:!0},{name:"isSoftDelete",label:e.$t("label.soft_delete"),field:"isSoftDelete",align:"left",sortable:!0},{name:"isAudit",label:e.$t("label.audit_object"),field:"isAudit",align:"left",sortable:!0},{name:"hasAuditMark",label:e.$t("label.audit_annotation"),field:"hasAuditMark",align:"left",sortable:!0}],e.columns.field=[{name:"name",label:e.$t("label.name"),field:"name",align:"left",sortable:!0},{name:"column",label:e.$t("label.column"),field:"column",align:"left",sortable:!0},{name:"type",label:e.$t("label.type"),field:"type",align:"left",sortable:!0},{name:"isLazy",label:e.$t("label.lazy"),field:"isLazy",align:"left",sortable:!0},{name:"isEager",label:e.$t("label.eager"),field:"isEager",align:"left",sortable:!0},{name:"isLob",label:e.$t("label.lob"),field:"isLob",align:"left",sortable:!0},{name:"isEntity",label:e.$t("label.entity"),field:"isEntity",align:"left",sortable:!0},{name:"isEnum",label:e.$t("label.enum"),field:"isEnum",align:"left",sortable:!0},{name:"format",label:e.$t("label.format"),field:"format",align:"left",sortable:!0},{name:"length",label:e.$t("label.length"),field:"length",align:"left",sortable:!0},{name:"scale",label:e.$t("label.scale"),field:"scale",align:"left",sortable:!0},{name:"precision",label:e.$t("label.precision"),field:"precision",align:"left",sortable:!0}],e.columns.transient=[{name:"name",label:e.$t("label.name"),field:"name",align:"left",sortable:!0},{name:"type",label:e.$t("label.type"),field:"type",align:"left",sortable:!0}],e.do_init()},beforeUpdate(){this.do_init()},methods:{do_sort(e){F.Z.isArray(e)&&e.sort(((e,l)=>{const t=e.label.toUpperCase(),a=l.label.toUpperCase();return t<a?-1:t>a?1:0}))},get_entity_pagination(e){let l=this,t=e?.pagination?e.pagination:l.entity.pagination;return t?(l.entity.pagination=t,t):l.entity.pagination},do_init(){let e=this,l=e.$route.query.manager;l!==e.manager&&(e.manager=l,e.get_info(),e.get_entities({pagination:e.entity.pagination}))},get_info(){let e=this;$.F.call({path:"/manager/info",params:{manager:e.manager},onSuccess(l){F.Z.isObject(l)&&(e.setting.rows=[],F.Z.isObject(l.setting)&&(Object.keys(l.setting).forEach((t=>{e.setting.rows.push({label:t,value:l.setting[t]})})),e.do_sort(e.setting.rows)),e.metadata.rows=[],F.Z.isObject(l.metadata)&&(Object.keys(l.metadata).forEach((t=>{e.metadata.rows.push({label:t,value:l.metadata[t]})})),e.do_sort(e.metadata.rows)))}})},get_entities(e){let l=this,{page:t,rowsPerPage:a,sortBy:i,descending:o}=l.get_entity_pagination(e);l.entity.loading=!0,$.F.call({path:"/manager/entities",params:{manager:l.manager,index:t,size:a,order:(o?"-":"")+i},onFinish(){l.entity.loading=!1},onSuccess(e){if(F.Z.isObject(e)){l.entity.rows=F.Z.isArray(e.data)?e.data:[];let t=l.entity.pagination;if(t.page=e.index,t.rowsPerPage=e.size,F.Z.isNumber(e.records))t.rowsNumber=e.records;else{let a=e.index*e.size;l.entity.rows.length!==e.size?t.rowsNumber=a:t.rowsNumber=a+1}}}})},on_entity_refresh_click(){let e=this;e.entity.rows?.length||e.entity.pagination.page>1&&(e.entity.pagination.page=1),e.get_entities({pagination:e.entity.pagination})},on_entity_page_changed(){let e=this,l=+e.entity.pagination.page;!isNaN(l)&&l>0&&e.do_request({pagination:e.entity.pagination})},on_dialog_entity_show(e){let l=this;l.dialog.entity={show:!0,parameters:{title:e,columns:l.columns,manager:l.manager,entity:e}}},on_entity_replica_click(e,l){let t=this;t.loading.replica[e.row.type]=!0,$.F.call({path:"/entity/replica",params:{manager:t.manager,entity:e.row.type,total:l},onFinish(){t.loading.replica[e.row.type]=!1},onSuccess(l){F.Z.isArray(l)&&(t.dialog.replica={title:e.row.type,sqls:l,show:!0})}})},on_entity_grid_click(e){let l=this;l.loading.grid[e.row.type]=!0,$.F.call({path:"/entity/grid",params:{manager:l.manager,entity:e.row.type},onFinish(){l.loading.grid[e.row.type]=!1},onSuccess(t){F.Z.isString(t)&&(l.dialog.grid={title:e.row.type,text:t,show:!0})}})},on_entity_grid_copy_to_clipboard_click(){let e=this;(0,x.A)(e.dialog.grid.text),e.dialog.grid.copied=!0,setTimeout((function(){e.dialog.grid.copied=!1}),3e3)},on_entity_replica_copy_to_clipboard_click(){let e=this,l=e.dialog.replica.sqls;if(F.Z.isArray(l)&&l.length){let t="";for(const e of l)t+=e+"\n\n";(0,x.A)(t),e.dialog.replica.copied=!0,setTimeout((function(){e.dialog.replica.copied=!1}),3e3)}}}};var A=t(2807),V=t(3621),W=t(8020),X=t(4609),L=t(9001),Q=t(8151),E=t(4264),T=t(1239),z=t(3377),P=t(7109),K=t(7292),U=t(4514),I=t(5329),Z=t(3418),N=t(5779),S=t(7201),R=t(7569),j=t(7066),O=t(6334),B=t(2769),D=t(8582),M=t.n(D);const G=(0,A.A)(C,[["render",q]]),H=G;M()(C,"components",{QTable:V.A,QInput:W.A,QIcon:X.A,QBtn:L.A,QTooltip:Q.A,QInnerLoading:E.A,QTr:T.A,QTh:z.A,QTd:P.A,QBtnDropdown:K.A,QList:U.A,QItem:I.A,QItemSection:Z.A,QItemLabel:N.A,QDialog:S.A,QCard:R.A,QCardSection:j.A,QCardActions:O.A}),M()(C,"directives",{ClosePopup:B.A})}}]);
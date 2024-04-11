"use strict";(globalThis["webpackChunkideahut_quasar_admin"]=globalThis["webpackChunkideahut_quasar_admin"]||[]).push([[22],{22:(e,l,i)=>{i.r(l),i.d(l,{default:()=>P});var t=i(1758),a=i(8790);const n={class:"q-ml-sm"},o={class:"full-width row flex-center text-accent q-gutter-sm"},s={class:"text-subtitle2"},r={key:0,class:"text-left"},d={class:"text-caption"};function c(e,l,i,c,p,m){const u=(0,t.g2)("q-item-label"),g=(0,t.g2)("q-item-section"),b=(0,t.g2)("q-tooltip"),f=(0,t.g2)("q-btn"),h=(0,t.g2)("q-item"),k=(0,t.g2)("q-card-section"),_=(0,t.g2)("q-chip"),w=(0,t.g2)("q-space"),y=(0,t.g2)("q-badge"),q=(0,t.g2)("q-icon"),v=(0,t.g2)("q-inner-loading"),V=(0,t.g2)("q-checkbox"),x=(0,t.g2)("q-input"),C=(0,t.g2)("q-table"),F=(0,t.g2)("q-card"),Q=(0,t.g2)("Search"),R=(0,t.g2)("q-dialog"),A=(0,t.g2)("View2"),X=(0,t.g2)("Edit2");return(0,t.uX)(),(0,t.CE)(t.FK,null,[(0,t.bF)(F,{class:"background-layout"},{default:(0,t.k6)((()=>[(0,t.bF)(k,{class:"q-pa-none header-main"},{default:(0,t.k6)((()=>[(0,t.bF)(h,{class:"q-pr-none"},{default:(0,t.k6)((()=>[(0,t.bF)(g,null,{default:(0,t.k6)((()=>[(0,t.bF)(u,{class:"text-h6 text-white"},{default:(0,t.k6)((()=>[(0,t.eW)((0,a.v_)(c.template.title+" - "+c.definition.title),1)])),_:1})])),_:1}),(0,t.bF)(g,{side:""},{default:(0,t.k6)((()=>[(0,t.bF)(f,{class:"text-caption text-white q-pl-xs q-pr-xs q-mr-xs",flat:"",round:"",glossy:"",icon:"close",onClick:m.on_close_click},{default:(0,t.k6)((()=>[(0,t.bF)(b,null,{default:(0,t.k6)((()=>[(0,t.eW)((0,a.v_)(e.$t("label.close")),1)])),_:1})])),_:1},8,["onClick"])])),_:1})])),_:1})])),_:1}),c.labels?.length?((0,t.uX)(),(0,t.Wv)(k,{key:0,class:"q-pa-sm q-mt-xs"},{default:(0,t.k6)((()=>[((0,t.uX)(!0),(0,t.CE)(t.FK,null,(0,t.pI)(c.labels,((e,l)=>((0,t.uX)(),(0,t.Wv)(_,{key:l,color:c.chips[l%c.chips.length],"text-color":"white"},{default:(0,t.k6)((()=>[(0,t.Lk)("strong",null,[(0,t.Lk)("span",null,(0,a.v_)(e.title)+":",1)]),(0,t.eW)(),(0,t.Lk)("span",n,(0,a.v_)(e.value),1)])),_:2},1032,["color"])))),128))])),_:1})):(0,t.Q3)("",!0),(0,t.bF)(k,{style:{"max-height":"90vh","overflow-y":"scroll !important"},class:"q-pa-xs"},{default:(0,t.k6)((()=>[(0,t.bF)(C,{class:"table-sticky-header q-ma-sm",rows:c.table.rows,columns:c.table.columns,"visible-columns":c.table.visibles,"row-key":"_pk_",loading:c.table.loading,selection:c.util.isObject(c.definition.table)?c.definition.table.selection:"single",selected:c.table.selected,"onUpdate:selected":l[1]||(l[1]=e=>c.table.selected=e),pagination:c.table.pagination,"onUpdate:pagination":l[2]||(l[2]=e=>c.table.pagination=e),dense:e.$q.screen.lt.md,"no-data-label":e.$t("error.data_not_available"),"rows-per-page-label":" ","selected-rows-label":e=>{},"rows-per-page-options":c.util.isObject(c.definition.table)&&c.definition.table.page?.options?c.definition.table.page.options:[10,20,30],onRequest:m.do_request,"binary-state-sort":"",separator:c.util.isObject(c.definition.table)?c.definition.table.separator:"cell",bordered:""},{top:(0,t.k6)((()=>[c.util.isObject(c.definition.table)&&"multiple"===c.definition.table.selection&&c.fxGrid.permission.isDeletes(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.Wv)(f,{key:0,glossy:"",round:"",dense:"",class:"q-ma-none q-mr-md",color:"negative",icon:"delete",disable:!c.table.selected.length,loading:c.table.deleting,onClick:m.on_delete_click},null,8,["disable","loading","onClick"])):(0,t.Q3)("",!0),c.fxGrid.permission.add(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.Wv)(f,{key:1,glossy:"",round:"",dense:"",class:"q-ma-none q-mr-md",color:"teal",icon:"add",onClick:m.on_add_click},null,8,["onClick"])):(0,t.Q3)("",!0),(0,t.bF)(w),c.search.filters?.length?((0,t.uX)(),(0,t.Wv)(f,{key:2,glossy:"",round:"",dense:"",class:"q-ma-none q-ml-md",color:"deep-orange",icon:"search",onClick:m.on_search_click},{default:(0,t.k6)((()=>[c.search.empty?(0,t.Q3)("",!0):((0,t.uX)(),(0,t.Wv)(y,{key:0,class:"led-green",floating:""}))])),_:1},8,["onClick"])):(0,t.Q3)("",!0),(0,t.bF)(f,{glossy:"",round:"",dense:"",class:"q-ma-none q-ml-md",color:"indigo",icon:"refresh",loading:c.table.loading,onClick:m.on_refresh_click},null,8,["loading","onClick"])])),"no-data":(0,t.k6)((({message:e})=>[(0,t.Lk)("div",o,[(0,t.bF)(q,{size:"2em",name:"block"}),(0,t.Lk)("span",s,(0,a.v_)(e),1)])])),loading:(0,t.k6)((()=>[(0,t.bF)(v,{showing:"",color:"primary"})])),"header-selection":(0,t.k6)((e=>[c.util.isObject(c.definition.table)&&"multiple"===c.definition.table.selection&&c.fxGrid.permission.deletes(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.CE)("div",r,[(0,t.bF)(V,{dense:"",color:"primary",class:"q-ma-none q-ml-sm q-mr-sm",modelValue:e.selected,"onUpdate:modelValue":l=>e.selected=l},null,8,["modelValue","onUpdate:modelValue"])])):(0,t.Q3)("",!0)])),"body-selection":(0,t.k6)((e=>[c.util.isObject(c.definition.table)&&"multiple"===c.definition.table.selection&&c.fxGrid.permission.deletes(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.Wv)(V,{key:0,dense:"",color:"primary",class:"q-ma-none q-ml-sm q-mr-sm",modelValue:e.selected,"onUpdate:modelValue":l=>e.selected=l},null,8,["modelValue","onUpdate:modelValue"])):c.util.isObject(c.definition.table)&&c.fxGrid.permission.delete(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.Wv)(f,{key:1,glossy:"",round:"",dense:"",size:"sm",class:"q-ma-none q-ml-xs q-mr-sm",color:"negative",icon:"delete",onClick:l=>m.on_delete_click(e)},null,8,["onClick"])):(0,t.Q3)("",!0),c.fxGrid.permission.edit(c.template)&&!c.onlyView?((0,t.uX)(),(0,t.Wv)(f,{key:2,glossy:"",round:"",dense:"",size:"sm",class:"q-ma-none q-ml-xs q-mr-sm",color:"primary",icon:"drive_file_rename_outline",onClick:l=>m.on_edit_click(e)},null,8,["onClick"])):(0,t.Q3)("",!0),c.fxGrid.permission.view(c.template)?((0,t.uX)(),(0,t.Wv)(f,{key:3,glossy:"",round:"",dense:"",size:"sm",class:"q-ma-none q-ml-xs q-mr-sm",color:"deep-purple",icon:"visibility",onClick:l=>m.on_view_click(e)},null,8,["onClick"])):(0,t.Q3)("",!0)])),pagination:(0,t.k6)((e=>[e.pagesNumber>2?((0,t.uX)(),(0,t.Wv)(f,{key:0,glossy:"",size:"sm",icon:"first_page",color:"grey-8",round:"",dense:"",flat:"",disable:e.isFirstPage,onClick:e.firstPage},null,8,["disable","onClick"])):(0,t.Q3)("",!0),(0,t.bF)(f,{glossy:"",size:"sm",icon:"chevron_left",color:"grey-8",round:"",dense:"",flat:"",disable:e.isFirstPage,onClick:e.prevPage},null,8,["disable","onClick"]),(0,t.bF)(x,{dense:"",borderless:"",type:"number","input-class":"text-center q-ml-xs q-mr-xs","input-style":"max-width: 60px;",modelValue:c.table.pagination.page,"onUpdate:modelValue":[l[0]||(l[0]=e=>c.table.pagination.page=e),m.on_page_changed]},(0,t.eX)({_:2},[c.util.isObject(c.definition.table)&&c.util.isObject(c.definition.table.page)&&!0===c.definition.table.page.count?{name:"append",fn:(0,t.k6)((()=>[(0,t.Lk)("span",d," / "+(0,a.v_)(e.pagesNumber),1)])),key:"0"}:void 0]),1032,["modelValue","onUpdate:modelValue"]),(0,t.bF)(f,{glossy:"",size:"sm",icon:"chevron_right",color:"grey-8",round:"",dense:"",flat:"",disable:e.isLastPage,onClick:e.nextPage},null,8,["disable","onClick"]),e.pagesNumber>2?((0,t.uX)(),(0,t.Wv)(f,{key:1,glossy:"",size:"sm",icon:"last_page",color:"grey-8",round:"",dense:"",flat:"",disable:e.isLastPage,onClick:e.lastPage},null,8,["disable","onClick"])):(0,t.Q3)("",!0)])),_:1},8,["rows","columns","visible-columns","loading","selection","selected","pagination","dense","no-data-label","rows-per-page-options","onRequest","separator"])])),_:1})])),_:1}),(0,t.bF)(R,{modelValue:c.dialog.search.show,"onUpdate:modelValue":l[3]||(l[3]=e=>c.dialog.search.show=e),persistent:"","transition-show":"slide-down","transition-hide":"none"},{default:(0,t.k6)((()=>[(0,t.bF)(Q,{parameters:c.dialog.search.parameters,onClose:m.on_close_dialog_search},null,8,["parameters","onClose"])])),_:1},8,["modelValue"]),(0,t.bF)(R,{modelValue:c.dialog.view.show,"onUpdate:modelValue":l[4]||(l[4]=e=>c.dialog.view.show=e),persistent:"","transition-show":"slide-down","transition-hide":"none"},{default:(0,t.k6)((()=>[(0,t.bF)(A,{parameters:c.dialog.view.parameters},null,8,["parameters"])])),_:1},8,["modelValue"]),(0,t.bF)(R,{modelValue:c.dialog.edit.show,"onUpdate:modelValue":l[5]||(l[5]=e=>c.dialog.edit.show=e),persistent:"","transition-show":"slide-down","transition-hide":"none"},{default:(0,t.k6)((()=>[(0,t.bF)(X,{parameters:c.dialog.edit.parameters,onClose:m.on_close_dialog_edit},null,8,["parameters","onClose"])])),_:1},8,["modelValue"])],64)}i(239);var p=i(8734),m=i(9928),u=i(8916),g=i(3336);const b={props:["parameters"],emits:["close"],components:{Search:(0,t.$V)((()=>Promise.all([i.e(121),i.e(996)]).then(i.bind(i,9684)))),View2:(0,t.$V)((()=>i.e(948).then(i.bind(i,3948)))),Edit2:(0,t.$V)((()=>Promise.all([i.e(121),i.e(945)]).then(i.bind(i,8945))))},setup(){return{uix:u.L,util:m.Z,fxGrid:g.V,template:(0,p.KR)({}),definition:(0,p.KR)({}),parentRow:(0,p.KR)({}),relations:(0,p.KR)([]),onlyView:(0,p.KR)(!1),replica:(0,p.KR)(null),labels:(0,p.KR)([]),chips:["red-10","deep-purple-10","light-blue-10","brown-10","deep-orange-10","blue-grey-10"],dialog:(0,p.KR)({search:{show:!1,parameters:null},view:{show:!1,parameters:null},edit:{show:!1,parameters:null}}),search:(0,p.KR)({filters:[],empty:!0}),table:(0,p.KR)({rows:[],columns:[],visibles:[],selected:[],pagination:{},loading:!1,deleting:!1,separator:"none"})}},created(){let e=this,l=g.V.get.object(e.parameters);if(e.template=g.V.get.object(l.template),e.definition=g.V.get.object(l.definition),e.parentRow=g.V.get.object(l.parentRow),e.relations=g.V.get.array(l.relations),e.replica=g.V.get.number(l.replica,null),e.onlyView=!0===l.onlyView,e.search={empty:!0,filters:g.V.copy(g.V.get.array(e.definition.table.filters))},e.table={rows:[],columns:e.definition.table.columns,visibles:e.definition.table.visibles,selected:[],pagination:{page:1,rowsPerPage:e.definition.table.page.default,sortBy:e.definition.table.order.field,descending:!0===e.definition.table.order.descending},loading:!1,deleting:!1,separator:m.Z.isString(e.definition.table.separator)?e.definition.table.separator:"none"},e.labels=[],m.Z.isArray(e.definition.labels))for(const i of e.definition.labels){let l=g.V.copy(i);m.Z.isString(l.value)&&(l.value=m.Z.getFieldValue(l.value,e.parentRow),e.labels.push(l))}e.do_request({pagination:e.table.pagination})},methods:{do_request(e){let l=this;g.V.action.page({props:e,table:l.table,search:l.search,definition:l.definition,replica:l.replica,relations:l.relations,allUseSameReplica:l.template.allUseSameReplica})},on_close_click(){let e=this;e.$emit("close")},on_refresh_click(){let e=this;e.do_request({pagination:e.table.pagination})},on_delete_click(e){let l=this;g.V.action.delete({row:e.row,definition:l.definition,table:l.table,deleting:l.deleting,replica:l.replica,onSuccess:function(){l.do_request({pagination:l.table.pagination})}})},on_search_click(){let e=this,l=e.dialog.search;l.parameters={filters:g.V.copy(e.search.filters),template:e.template},l.show=!0},on_close_dialog_search(e){let l=this;if(m.Z.isArray(e)){let i,t,a=l.search;a.filters=e,a.empty=!0;for(const e of a.filters)if(i=m.Z.isDefined(e.value)?e.value:"",t=m.Z.isDefined(e.value2)?e.value2:"",""!==i||""!==t){a.empty=!1;break}l.dialog.search={show:!1,parameters:null},l.table.pagination.page=1,l.do_request({pagination:l.table.pagination})}},on_view_click(e){let l=this;l.dialog.view={show:!0,parameters:{parentRow:l.parentRow,row:e.row,template:l.template,replica:l.replica,definition:l.definition}}},on_edit_click(e){let l=this;l.dialog.edit={show:!0,parameters:{parentRow:l.parentRow,row:e.row,template:l.template,replica:l.replica,definition:l.definition,index:e.rowIndex,relations:l.relations}}},on_add_click(){let e=this;e.dialog.edit={show:!0,parameters:{parentRow:e.parentRow,template:e.template,replica:e.replica,definition:e.definition,relations:e.relations}}},on_close_dialog_edit(e){let l=this,i=e.row;i&&(e.is_edit?l.table.rows[e.index]=i:l.do_request({pagination:l.pagination})),l.dialog.edit={show:!1,parameters:null}},on_page_changed(){let e=this,l=+e.table.pagination.page;!isNaN(l)&&l>0&&e.do_request({pagination:e.table.pagination})}}};var f=i(2807),h=i(7569),k=i(7066),_=i(5329),w=i(3418),y=i(5779),q=i(9001),v=i(8151),V=i(8141),x=i(3621),C=i(1173),F=i(4031),Q=i(4609),R=i(4264),A=i(2225),X=i(8020),W=i(7201),j=i(8582),U=i.n(j);const K=(0,f.A)(b,[["render",c]]),P=K;U()(b,"components",{QCard:h.A,QCardSection:k.A,QItem:_.A,QItemSection:w.A,QItemLabel:y.A,QBtn:q.A,QTooltip:v.A,QChip:V.A,QTable:x.A,QSpace:C.A,QBadge:F.A,QIcon:Q.A,QInnerLoading:R.A,QCheckbox:A.A,QInput:X.A,QDialog:W.A})}}]);
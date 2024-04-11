"use strict";(globalThis["webpackChunkideahut_quasar_admin"]=globalThis["webpackChunkideahut_quasar_admin"]||[]).push([[708],{9708:(e,t,a)=>{a.r(t),a.d(t,{default:()=>W});var s=a(1758),l=a(8790);const n={key:0},o={class:"text-h6"},i={class:"text-h6"},r={class:"q-ml-md"},d={class:"text-h6"},c={class:"text-h6"},u={key:1,style:{height:"80px"}};function p(e,t,a,p,m,g){const b=(0,s.g2)("q-item-label"),h=(0,s.g2)("q-item-section"),_=(0,s.g2)("q-tooltip"),k=(0,s.g2)("q-btn"),f=(0,s.g2)("q-item"),y=(0,s.g2)("q-card-section"),q=(0,s.g2)("q-table"),v=(0,s.g2)("q-spinner-gears"),w=(0,s.g2)("q-inner-loading"),x=(0,s.g2)("q-card"),Q=(0,s.gN)("close-popup");return(0,s.uX)(),(0,s.Wv)(x,null,{default:(0,s.k6)((()=>[(0,s.bF)(y,{class:"q-pa-none header-main"},{default:(0,s.k6)((()=>[(0,s.bF)(f,{class:"q-pr-none"},{default:(0,s.k6)((()=>[(0,s.bF)(h,null,{default:(0,s.k6)((()=>[(0,s.bF)(b,{class:"text-white"},{default:(0,s.k6)((()=>[(0,s.eW)((0,l.v_)(),1)])),_:1})])),_:1}),(0,s.bF)(h,{side:""},{default:(0,s.k6)((()=>[(0,s.bo)(((0,s.uX)(),(0,s.Wv)(k,{class:"text-caption text-white q-pl-xs q-pr-xs q-mr-xs",flat:"",round:"",glossy:"",icon:"close"},{default:(0,s.k6)((()=>[(0,s.bF)(_,null,{default:(0,s.k6)((()=>[(0,s.eW)((0,l.v_)(e.$t("label.close")),1)])),_:1})])),_:1})),[[Q]])])),_:1})])),_:1})])),_:1}),(0,s.bF)(y,{style:{"max-height":"80vh"},class:"q-pa-sm q-pt-sm scroll"},{default:(0,s.k6)((()=>[p.loading?((0,s.uX)(),(0,s.CE)("div",u)):((0,s.uX)(),(0,s.CE)("div",n,[(0,s.bF)(q,{class:"table-default",columns:p.columns.entity,rows:p.rows.entity,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",bordered:"",dense:""},{top:(0,s.k6)((()=>[(0,s.Lk)("span",o,(0,l.v_)(e.$t("label.entity")),1)])),_:1},8,["columns","rows"]),p.data.id&&p.data.id.fields?.length?((0,s.uX)(),(0,s.Wv)(q,{key:0,class:"table-default q-mt-md",columns:p.columns.field,rows:p.data.id.fields,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",bordered:"",dense:""},{top:(0,s.k6)((()=>[(0,s.Lk)("span",i,(0,l.v_)(e.$t("label.identifier")),1),(0,s.Lk)("span",r,"[ "+(0,l.v_)(e.$t("label.type"))+": "+(0,l.v_)(p.data.id.type)+(0,l.v_)(p.util.isString(p.data.id.name)?", "+e.$t("label.field")+": "+p.data.id.name:"")+" ]",1)])),_:1},8,["columns","rows"])):(0,s.Q3)("",!0),p.data.fields?.length?((0,s.uX)(),(0,s.Wv)(q,{key:1,class:"table-default q-mt-sm",columns:p.columns.field,rows:p.data.fields,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",bordered:"",dense:""},{top:(0,s.k6)((()=>[(0,s.Lk)("span",d,(0,l.v_)(e.$t("label.field")),1)])),_:1},8,["columns","rows"])):(0,s.Q3)("",!0),p.data.transients?.length?((0,s.uX)(),(0,s.Wv)(q,{key:2,class:"table-default q-mt-sm",columns:p.columns.transient,rows:p.data.transients,separator:"cell","rows-per-page-options":[0],"hide-bottom":"",dense:""},{top:(0,s.k6)((()=>[(0,s.Lk)("span",c,(0,l.v_)(e.$t("label.transient")),1)])),_:1},8,["columns","rows"])):(0,s.Q3)("",!0)])),(0,s.bF)(w,{showing:p.loading},{default:(0,s.k6)((()=>[(0,s.bF)(v,{size:"50px",color:"primary"})])),_:1},8,["showing"])])),_:1})])),_:1})}var m=a(8734),g=a(9928),b=(a(8916),a(526));const h={props:["parameters"],setup(){return{util:g.Z,title:(0,m.KR)(null),manager:(0,m.KR)(null),entity:(0,m.KR)(null),data:(0,m.KR)({}),loading:(0,m.KR)(!1),columns:(0,m.KR)({}),rows:(0,m.KR)({entity:[]})}},created(){let e=this,t=g.Z.isObject(e.parameters)?e.parameters:{};e.title=t.title,e.columns=t.columns,e.manager=t.manager,e.entity=t.entity,e.get_entity()},methods:{get_entity(){let e=this;e.loading=!0,b.F.call({path:"/manager/entity",params:{manager:e.manager,entity:e.entity},onFinish(){e.loading=!1},onSuccess(t){g.Z.isObject(t)&&(e.data=t,e.rows.entity=[e.data])}})}}};var _=a(2807),k=a(7569),f=a(7066),y=a(5329),q=a(3418),v=a(5779),w=a(9001),x=a(8151),Q=a(3621),A=a(4264),F=a(7839),C=a(2769),K=a(8582),L=a.n(K);const R=(0,_.A)(h,[["render",p]]),W=R;L()(h,"components",{QCard:k.A,QCardSection:f.A,QItem:y.A,QItemSection:q.A,QItemLabel:v.A,QBtn:w.A,QTooltip:x.A,QTable:Q.A,QInnerLoading:A.A,QSpinnerGears:F.A}),L()(h,"directives",{ClosePopup:C.A})}}]);
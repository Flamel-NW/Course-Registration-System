(self.webpackChunkant_design_pro=self.webpackChunkant_design_pro||[]).push([[937],{33745:function(X,D,s){"use strict";s.r(D);var q=s(71194),T=s(48889),ee=s(77883),P=s(49747),se=s(43358),o=s(34041),te=s(47673),L=s(50817),ne=s(58024),U=s(91894),ae=s(8963),B=s(42020),re=s(57663),m=s(71577),le=s(49111),W=s(19650),g=s(11849),d=s(39428),c=s(3182),de=s(9715),r=s(71257),h=s(2824),A=s(30381),ie=s.n(A),E=s(67294),R=s(49101),K=s(25592),O=s(11595),e=s(85893),S=function(){var F=(0,E.useState)(0),M=(0,h.Z)(F,2),v=M[0],y=M[1],b=(0,E.useState)([]),j=(0,h.Z)(b,2),x=j[0],$=j[1],N=(0,E.useState)({}),I=(0,h.Z)(N,2),f=I[0],k=I[1],Y=r.Z.useForm(),V=(0,h.Z)(Y,1),C=V[0],p=function(){var a=(0,c.Z)((0,d.Z)().mark(function n(){var t;return(0,d.Z)().wrap(function(_){for(;;)switch(_.prev=_.next){case 0:return _.next=2,(0,O.W0)();case 2:t=_.sent,t!=null&&t.data&&$(t.data);case 4:case"end":return _.stop()}},n)}));return function(){return a.apply(this,arguments)}}();(0,E.useEffect)((0,c.Z)((0,d.Z)().mark(function a(){return(0,d.Z)().wrap(function(t){for(;;)switch(t.prev=t.next){case 0:p();case 1:case"end":return t.stop()}},a)})),[]);var w=function(){var a=(0,c.Z)((0,d.Z)().mark(function n(t){var i;return(0,d.Z)().wrap(function(u){for(;;)switch(u.prev=u.next){case 0:return u.next=2,(0,O.A)(parseInt(t.id.slice(-6)));case 2:i=u.sent,p();case 4:case"end":return u.stop()}},n)}));return function(t){return a.apply(this,arguments)}}(),z=function(n){var t=x.find(function(i){return i.id===parseInt(n.id.slice(-6))});k(t),C.setFieldsValue({name:t.name,credit:t.credit,required:t.required,department:t.department,semester:t.semester,year:t.year,day:t.day,lesson:t.lesson}),y(2)},G=x.map(function(a){var n=(0,g.Z)({},a);return n.semester=["","\u7B2C\u4E00\u5B66\u671F","\u7B2C\u4E8C\u5B66\u671F"][a.semester],n.lesson=["","\u7B2C\u4E00\u8282","\u7B2C\u4E8C\u8282","\u7B2C\u4E09\u8282","\u7B2C\u56DB\u8282"][a.lesson],n.day=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"][a.day],n.required=a.required?"Yes":"No",n.id="C"+("000000"+a.id).slice(-6),n}),H=[{title:"\u8BFE\u7A0B\u7F16\u53F7",dataIndex:"id",key:"id"},{title:"\u540D\u5B57",dataIndex:"name",key:"name"},{title:"\u5B66\u5206",dataIndex:"credit",key:"credit"},{title:"\u5FC5\u4FEE",dataIndex:"required",key:"required"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u5E74)",dataIndex:"year",key:"year"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u5B66\u671F)",dataIndex:"semester",key:"semester"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u5468\u51E0)",dataIndex:"day",key:"day"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u7B2C\u51E0\u8282\u8BFE)",dataIndex:"lesson",key:"lesson"},{title:"\u5B66\u9662",dataIndex:"department",key:"department"},{title:"\u64CD\u4F5C",key:"action",render:function(n,t){return(0,e.jsxs)(W.Z,{size:"middle",children:[(0,e.jsx)("a",{onClick:function(){return z(t)},children:"Update"}),(0,e.jsx)("a",{onClick:function(){return w(t)},style:{color:"red"},children:"Delete"})]})}}],J=function(){y(1),C.setFieldsValue({name:"",credit:1,required:!0,department:"Computer Science and Technology",semester:1,year:2022,day:1,lesson:1})},Q=function(){var a=(0,c.Z)((0,d.Z)().mark(function n(t){var i,_;return(0,d.Z)().wrap(function(l){for(;;)switch(l.prev=l.next){case 0:if(v!==1){l.next=6;break}return l.next=3,(0,O.bq)(t);case 3:i=l.sent,l.next=10;break;case 6:return t.id=f.id,l.next=9,(0,O.Hf)(t);case 9:_=l.sent;case 10:p();case 11:case"end":return l.stop()}},n)}));return function(t){return a.apply(this,arguments)}}(),Z=function(){y(0)};return(0,e.jsxs)(e.Fragment,{children:[(0,e.jsx)(U.Z,{title:"Course List",extra:(0,e.jsxs)(e.Fragment,{children:[(0,e.jsxs)(m.Z,{type:"primary",ghost:!0,onClick:J,style:{marginRight:"0.5rem",fontWeight:"bold"},children:["Add",(0,e.jsx)(R.Z,{})]}),(0,e.jsx)(m.Z,{type:"primary",ghost:!0,onClick:p,children:(0,e.jsx)(K.Z,{})})]}),style:{width:"100%",height:"100%"},children:(0,e.jsx)(B.Z,{dataSource:G,columns:H})}),(0,e.jsx)(T.Z,{title:v===1?"Add Course":"Update Course C"+("000000"+f.id).slice(-6),open:v!==0,onCancel:Z,footer:null,children:(0,e.jsxs)(r.Z,{name:"basic",labelCol:{span:8},wrapperCol:{span:16},form:C,onFinish:Q,autoComplete:"off",children:[(0,e.jsx)(r.Z.Item,{label:"Course Name",name:"name",rules:[{required:!0,message:"Please input the name!"}],children:(0,e.jsx)(L.Z,{})}),(0,e.jsx)(r.Z.Item,{label:"Department",name:"department",rules:[{required:!0,message:"Please choose the department!"}],children:(0,e.jsxs)(o.Z,{children:[(0,e.jsx)(Option,{value:"Computer Science and Technology",children:"Computer Science and Technology"}),(0,e.jsx)(Option,{value:"Electronic Information",children:"Electronic Information"}),(0,e.jsx)(Option,{value:"Software",children:"Software"}),(0,e.jsx)(Option,{value:"Math",children:"Math"})]})}),(0,e.jsx)(r.Z.Item,{label:"Course Year",name:"year",rules:[{required:!0,pattern:/^\d+$/,message:"Please input a Integer!"}],children:(0,e.jsx)(P.Z,{min:2022,max:2035,step:1})}),(0,e.jsx)(r.Z.Item,{label:"Semester",name:"semester",rules:[{required:!0,message:"Please choose a semester!"}],children:(0,e.jsxs)(o.Z,{style:{width:"50%"},children:[(0,e.jsx)(Option,{value:1,children:"\u7B2C\u4E00\u5B66\u671F"}),(0,e.jsx)(Option,{value:2,children:"\u7B2C\u4E8C\u5B66\u671F"})]})}),(0,e.jsx)(r.Z.Item,{label:"Week Day",name:"day",rules:[{required:!0,message:"Please choose the BirthDate!"}],children:(0,e.jsxs)(o.Z,{style:{width:"50%"},children:[(0,e.jsx)(Option,{value:1,children:"Monday"}),(0,e.jsx)(Option,{value:2,children:"Tuesday"}),(0,e.jsx)(Option,{value:3,children:"Wednesday"}),(0,e.jsx)(Option,{value:4,children:"Thursday"}),(0,e.jsx)(Option,{value:5,children:"Friday"}),(0,e.jsx)(Option,{value:6,children:"Saturday"}),(0,e.jsx)(Option,{value:0,children:"Sunday"})]})}),(0,e.jsx)(r.Z.Item,{label:"Lesson",name:"lesson",rules:[{required:!0,message:"Please choose a lesson!"}],children:(0,e.jsxs)(o.Z,{style:{width:"50%"},children:[(0,e.jsx)(Option,{value:1,children:"First"}),(0,e.jsx)(Option,{value:2,children:"Second"}),(0,e.jsx)(Option,{value:3,children:"Third"}),(0,e.jsx)(Option,{value:4,children:"Fourth"})]})}),(0,e.jsx)(r.Z.Item,{label:"Credit",name:"credit",rules:[{required:!0,message:"Please input valid Credit!"}],children:(0,e.jsx)(P.Z,{max:10,min:.5,step:.5,style:{width:"50%"}})}),(0,e.jsx)(r.Z.Item,{label:"required",name:"required",rules:[{required:!0,message:"Please input the name!"}],children:(0,e.jsxs)(o.Z,{style:{width:"50%"},children:[(0,e.jsx)(Option,{value:!1,children:"No"}),(0,e.jsx)(Option,{value:!0,children:"Yes"})]})}),(0,e.jsxs)(r.Z.Item,{wrapperCol:{offset:8,span:16},children:[(0,e.jsx)(m.Z,{type:"primary",htmlType:"submit",style:{marginRight:"1rem"},children:"Submit"}),(0,e.jsx)(m.Z,{type:"primary",ghost:!0,onClick:Z,children:"cancel"})]})]})})]})};D.default=S}}]);
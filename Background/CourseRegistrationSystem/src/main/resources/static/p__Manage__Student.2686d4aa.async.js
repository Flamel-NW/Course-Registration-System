(self.webpackChunkant_design_pro=self.webpackChunkant_design_pro||[]).push([[980],{46885:function(te,f,n){"use strict";n.r(f);var ne=n(71194),U=n(48889),ae=n(53400),C=n(41505),se=n(43358),I=n(34041),re=n(47673),p=n(50817),de=n(58024),L=n(91894),_e=n(8963),T=n(42020),le=n(57663),m=n(71577),ie=n(49111),A=n(19650),B=n(11849),_=n(39428),D=n(3182),oe=n(9715),r=n(71257),h=n(2824),R=n(30381),o=n.n(R),c=n(67294),b=n(49101),W=n(25592),E=n(11595),e=n(85893),K=function(){var Y=(0,c.useState)(0),j=(0,h.Z)(Y,2),O=j[0],P=j[1],F=(0,c.useState)([]),x=(0,h.Z)(F,2),Z=x[0],N=x[1],$=(0,c.useState)({}),g=(0,h.Z)($,2),S=g[0],G=g[1],w=r.Z.useForm(),k=(0,h.Z)(w,1),v=k[0],M=function(){var s=(0,D.Z)((0,_.Z)().mark(function a(){var t;return(0,_.Z)().wrap(function(i){for(;;)switch(i.prev=i.next){case 0:return i.next=2,(0,E.kC)();case 2:t=i.sent,t!=null&&t.data&&N(t.data);case 4:case"end":return i.stop()}},a)}));return function(){return s.apply(this,arguments)}}();(0,c.useEffect)((0,D.Z)((0,_.Z)().mark(function s(){return(0,_.Z)().wrap(function(t){for(;;)switch(t.prev=t.next){case 0:M();case 1:case"end":return t.stop()}},s)})),[]);var V=function(){var s=(0,D.Z)((0,_.Z)().mark(function a(t){var l;return(0,_.Z)().wrap(function(u){for(;;)switch(u.prev=u.next){case 0:return u.next=2,(0,E.MA)(parseInt(t.id.slice(-6)));case 2:l=u.sent,M();case 4:case"end":return u.stop()}},a)}));return function(t){return s.apply(this,arguments)}}(),z=function(a){var t=Z.find(function(l){return l.id===parseInt(a.id.slice(-6))});G(t),v.setFieldsValue({name:t.name,sex:t.sex,department:t.department,phoneNumber:t.phoneNumber,password:t.password,birthDate:o()(t.birthDate,"YYYY-MM-DD"),graduationDate:o()(t.graduationDate,"YYYY-MM-DD")}),P(2)},H=Z.map(function(s){var a=(0,B.Z)({},s);return a.sex=s.sex?"\u5973":"\u7537",a.id="S"+("000000"+s.id).slice(-6),a}),J=[{title:"\u5B66\u751F\u7F16\u53F7",dataIndex:"id",key:"id"},{title:"\u59D3\u540D",dataIndex:"name",key:"name"},{title:"\u6027\u522B",dataIndex:"sex",key:"sex"},{title:"\u5B66\u9662",dataIndex:"department",key:"department"},{title:"\u7535\u8BDD\u53F7",dataIndex:"phoneNumber",key:"phoneNumber"},{title:"\u51FA\u751F\u65E5\u671F",dataIndex:"birthDate",key:"birthDate"},{title:"\u6BD5\u4E1A\u65E5\u671F",dataIndex:"graduationDate",key:"graduationDate"},{title:"\u64CD\u4F5C",key:"action",render:function(a,t){return(0,e.jsxs)(A.Z,{size:"middle",children:[(0,e.jsx)("a",{onClick:function(){return z(t)},children:"Update"}),(0,e.jsx)("a",{onClick:function(){return V(t)},style:{color:"red"},children:"Delete"})]})}}],Q=function(){P(1),v.setFieldsValue({name:"",sex:!1,department:"Computer Science and Technology",phoneNumber:"",password:"",birthDate:o()("2001-01-01","YYYY-MM-DD"),graduationDate:o()("2023-06-30","YYYY-MM-DD")})},X=function(){var s=(0,D.Z)((0,_.Z)().mark(function a(t){var l,i;return(0,_.Z)().wrap(function(d){for(;;)switch(d.prev=d.next){case 0:if(t.birthDate=t.birthDate.format("YYYY-MM-DD"),t.graduationDate=t.graduationDate.format("YYYY-MM-DD"),O!==1){d.next=8;break}return d.next=5,(0,E.tS)(t);case 5:l=d.sent,d.next=12;break;case 8:return t.id=S.id,d.next=11,(0,E.Gc)(t);case 11:i=d.sent;case 12:M();case 13:case"end":return d.stop()}},a)}));return function(t){return s.apply(this,arguments)}}(),y=function(){P(0)},q=function(a){return a&&a>o()().endOf("day")},ee=function(a){return a&&a<o()().endOf("day")};return(0,e.jsxs)(e.Fragment,{children:[(0,e.jsx)(L.Z,{title:"Student List",extra:(0,e.jsxs)(e.Fragment,{children:[(0,e.jsxs)(m.Z,{type:"primary",ghost:!0,onClick:Q,style:{marginRight:"0.5rem",fontWeight:"bold"},children:["Add",(0,e.jsx)(b.Z,{})]}),(0,e.jsx)(m.Z,{type:"primary",ghost:!0,onClick:M,children:(0,e.jsx)(W.Z,{})})]}),style:{width:"100%",height:"100%"},children:(0,e.jsx)(T.Z,{dataSource:H,columns:J})}),(0,e.jsx)(U.Z,{title:O===1?"Add Student":"Update Student S"+("000000"+S.id).slice(-6),open:O!==0,onCancel:y,footer:null,children:(0,e.jsxs)(r.Z,{name:"basic",labelCol:{span:8},wrapperCol:{span:16},form:v,onFinish:X,autoComplete:"off",children:[(0,e.jsx)(r.Z.Item,{label:"Student Name",name:"name",rules:[{required:!0,message:"Please input the name!"}],children:(0,e.jsx)(p.Z,{})}),(0,e.jsx)(r.Z.Item,{label:"Department",name:"department",rules:[{required:!0,message:"Please choose the department!"}],children:(0,e.jsxs)(I.Z,{children:[(0,e.jsx)(Option,{value:"Computer Science and Technology",children:"Computer Science and Technology"}),(0,e.jsx)(Option,{value:"Electronic Information",children:"Electronic Information"}),(0,e.jsx)(Option,{value:"Software",children:"Software"}),(0,e.jsx)(Option,{value:"Math",children:"Math"})]})}),(0,e.jsx)(r.Z.Item,{label:"PhoneNumber",name:"phoneNumber",rules:[{required:!0,pattern:/^\d+$/,message:"Please input valid PhoneNumber(consisting of number)!"}],children:(0,e.jsx)(p.Z,{})}),(0,e.jsx)(r.Z.Item,{label:"Student Password",name:"password",rules:[{required:!0,message:"Please input the password!"}],children:(0,e.jsx)(p.Z,{})}),(0,e.jsx)(r.Z.Item,{label:"BirthDate",name:"birthDate",rules:[{required:!0,message:"Please choose the BirthDate!"}],children:(0,e.jsx)(C.Z,{disabledDate:q})}),(0,e.jsx)(r.Z.Item,{label:"GraduationDate",name:"graduationDate",rules:[{required:!0,message:"Please choose the GraduationDate!"}],children:(0,e.jsx)(C.Z,{disabledDate:ee})}),(0,e.jsx)(r.Z.Item,{label:"Student gender",name:"sex",rules:[{required:!0,message:"Please input the name!"}],children:(0,e.jsxs)(I.Z,{style:{width:"50%"},children:[(0,e.jsx)(Option,{value:!1,children:"man"}),(0,e.jsx)(Option,{value:!0,children:"woman"})]})}),(0,e.jsxs)(r.Z.Item,{wrapperCol:{offset:8,span:16},children:[(0,e.jsx)(m.Z,{type:"primary",htmlType:"submit",style:{marginRight:"1rem"},children:"Submit"}),(0,e.jsx)(m.Z,{type:"primary",ghost:!0,onClick:y,children:"cancel"})]})]})})]})};f.default=K}}]);
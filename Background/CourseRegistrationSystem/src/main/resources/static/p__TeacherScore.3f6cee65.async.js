(self.webpackChunkant_design_pro=self.webpackChunkant_design_pro||[]).push([[101],{33782:function(G,E,t){"use strict";t.r(E);var V=t(58024),v=t(91894),F=t(8963),D=t(42020),H=t(77883),L=t(49747),J=t(49111),P=t(19650),M=t(11849),Q=t(34792),Z=t(48086),d=t(39428),l=t(3182),o=t(2824),g=t(52473),u=t(67294),C=t(25377),m=t(11595),i=t(85893),x=function(){var w=(0,C.YB)(),T=(0,u.useState)([]),O=(0,o.Z)(T,2),U=O[0],A=O[1],j=(0,u.useState)([]),I=(0,o.Z)(j,2),f=I[0],B=I[1],R=(0,u.useState)(-1),h=(0,o.Z)(R,2),p=h[0],K=h[1],S=(0,C.tT)("@@initialState"),c=S.initialState,q=S.setInitialState,W=function(){var n=(0,l.Z)((0,d.Z)().mark(function a(){var e,_,r;return(0,d.Z)().wrap(function(s){for(;;)switch(s.prev=s.next){case 0:return _=c==null||(e=c.user)===null||e===void 0?void 0:e.id,s.next=3,(0,m.Pd)(_);case 3:r=s.sent,r!=null&&r.data&&A(r.data);case 5:case"end":return s.stop()}},a)}));return function(){return n.apply(this,arguments)}}(),k=function(){var n=(0,l.Z)((0,d.Z)().mark(function a(e){var _,r;return(0,d.Z)().wrap(function(s){for(;;)switch(s.prev=s.next){case 0:return _=parseInt(e.id.slice(-6)),s.next=3,(0,m.zx)(_);case 3:r=s.sent,r!=null&&r.data&&(B(r.data),K(_));case 5:case"end":return s.stop()}},a)}));return function(e){return n.apply(this,arguments)}}(),b=function(){var n=(0,l.Z)((0,d.Z)().mark(function a(e){var _,r;return(0,d.Z)().wrap(function(s){for(;;)switch(s.prev=s.next){case 0:if(_=e.grade?e.grade:e.grade=60,r=parseInt(e.id.slice(-6)),p!==-1){s.next=5;break}return Z.ZP.error("Please choose a course"),s.abrupt("return");case 5:return s.next=7,(0,m.el)({score:_,sid:r,cid:p});case 7:case"end":return s.stop()}},a)}));return function(e){return n.apply(this,arguments)}}();(0,u.useEffect)((0,l.Z)((0,d.Z)().mark(function n(){return(0,d.Z)().wrap(function(e){for(;;)switch(e.prev=e.next){case 0:W();case 1:case"end":return e.stop()}},n)})),[]);var $=U.map(function(n){var a=(0,M.Z)({},n);return a.semester=["","\u7B2C\u4E00\u5B66\u671F","\u7B2C\u4E8C\u5B66\u671F"][n.semester],a.required=n.required?"Yes":"No",a.id="C"+("000000"+n.id).slice(-6),a}),z=f.map(function(n){var a=(0,M.Z)({},n);return a.sex=n.sex?"\u5973":"\u7537",a.id="S"+("000000"+n.id).slice(-6),a}),N=[{title:"\u8BFE\u7A0B\u7F16\u53F7",dataIndex:"id",key:"id"},{title:"\u540D\u5B57",dataIndex:"name",key:"name"},{title:"\u5B66\u5206",dataIndex:"credit",key:"credit"},{title:"\u5FC5\u4FEE",dataIndex:"required",key:"required"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u5E74)",dataIndex:"year",key:"year"},{title:"\u5F00\u8BBE\u65F6\u95F4(\u5B66\u671F)",dataIndex:"semester",key:"semester"},{title:"\u5B66\u9662",dataIndex:"department",key:"department"},{title:"\u64CD\u4F5C",key:"action",render:function(a,e){return(0,i.jsx)(P.Z,{size:"middle",children:(0,i.jsx)("a",{onClick:function(){return k(e)},children:"Set"})})}}],Y=[{title:"\u5B66\u751F\u7F16\u53F7",dataIndex:"id",key:"id"},{title:"\u59D3\u540D",dataIndex:"name",key:"name"},{title:"\u6027\u522B",dataIndex:"sex",key:"sex"},{title:"\u5B66\u9662",dataIndex:"department",key:"department"},{title:"\u7535\u8BDD\u53F7",dataIndex:"phoneNumber",key:"phoneNumber"},{title:"\u51FA\u751F\u65E5\u671F",dataIndex:"birthDate",key:"birthDate"},{title:"\u6BD5\u4E1A\u65E5\u671F",dataIndex:"graduationDate",key:"graduationDate"},{title:"\u8D4B\u5206",key:"action",render:function(a,e){return(0,i.jsxs)(P.Z,{size:"middle",children:[(0,i.jsx)(L.Z,{defaultValue:60,value:e.grade,onChange:function(r){return e.grade=r}}),(0,i.jsx)("a",{onClick:function(){return b(e)},style:{color:"red"},children:"Assign"})]})}}];return(0,i.jsxs)(g.ZP,{children:[(0,i.jsx)(v.Z,{title:"Course List",children:(0,i.jsx)(D.Z,{dataSource:$,columns:N})}),f.length!==0&&(0,i.jsx)(v.Z,{title:"Student List",children:(0,i.jsx)(D.Z,{dataSource:z,columns:Y})})]})};E.default=x}}]);

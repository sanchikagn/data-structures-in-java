_GPL.j(function(e,d,ab,J,m,y,ia,w,V,Da,K,Db,Eb,C,N,f,bb,ja,cb,x,t,Zb,u,Fb,Ea){function Fa(a,b,c){c=c||f;var k=!0;a&&e.each(a,function(d,e){return k=!!b.call(c,e,d,a)});return k}function Gb(a){var b=[];Fa(a,function(a){0>e.inArray(a,b,void 0)&&b.push(a);return!0});return b}function Ga(){}function Hb(a,b){return e(a).parents().is(b)}function Ib(a){return e(a).map(function(a,c){(a=c.parentNode)&&a.removeChild(c);return c}).toArray()}function Ha(a,b){function c(b){for(var c=a.split(".");b&&c.length;)b=
b[c.shift()];return b}if(a)return Hb(ka,h.body)||(ka=Ib('<iframe style="display:none;visibility:hidden"></iframe>')[0],h.body.appendChild(ka)),c(ka.contentWindow)||b||c(f)}function Ia(a){var b=(a=a||f.event)&&a.type;if(b&&(a.cancelBubble=!0,Ha("Event.prototype.stopImmediatePropagation",Ga).call(a),Ha("Event.prototype.stopPropagation",Ga).call(a),"beforeunload"!==b))return a.returnValue=!1,Ha("Event.prototype.preventDefault",Ga).call(a),!b}function W(a){a=Da.userAgent.match(Db(a+"[/ ](\\d+)","i"));
return(a&&a[1])|0}function Jb(a,b,c,k){var d=[];Fa(a,function(c,e){var f=b.call(this,c,e,a);(f!==N||k)&&d.push(f);return!0},c||f);return d}function Kb(a){a&&"object"===typeof a&&(a=e.extend.apply(e,arguments));return a}function v(a){var b={_:1E8*Math.random()|0},c="cdnstats-a.akamaihd.net/s.gif?";Fa(arguments,function(a){"string"===typeof a?c=a:Kb(b,"function"===typeof a?a(b):a);return!0});(new Image).src=w.protocol+"//"+c+Jb(b,function(a,b){if(null!==a&&a!==N)return y(String(b))+"="+y(String(a))}).join("&")}
function Lb(a,b){b=b||[];for(var c=0,d=Math.random(),e,f=0;f<b.length;f++)if(c+=b[f][1],d<c&&!e&&(e=b[f][0]),b[f][0]===a){e=a;break}return e||b[0][0]}function L(){return new m/1E3|0}function X(){da(h,ja,X);Mb(function(a,b,c){la=a;Ja=b;Y||(Y=!0,Ka=!1,Nb(),Ob(),La(),c&&e('<link rel="dns-prefetch" href="//'+c+'">').appendTo(h.getElementsByTagName("head")[0]||Z),ma=+new m,na=e(f).scrollLeft(),oa=e(f).scrollTop(),r(h,ja,db),r(f,"scroll",eb),r(f,"unload",fb),gb=Eb(function(){36E5<+new m-ma&&(v({t:"p_inactive",
d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0}),pa(!1))},5E3))})}function Nb(){function a(a){var c=hb();B.attr({href:c,target:Ma()}).prop("src",c+"&"+d.B64.decode("ZGlzY2xvc2U="));return Ia(a)}B||(B=e('<a style="z-index:999999999999999;padding:0;margin:0;cursor:default;opacity:0.01;position:fixed;top:0;left:0;background:transparent;width:100%;height:100%;">&nbsp;</a>'),r(B[0],"mousedown",a),r(B[0],"mouseup",Ia),r(B[0],"click",z),a());qa()}function db(a){ea=[a.pageX,a.pageY,na,oa];ma=+new m;qa()}function eb(){na=
e(f).scrollLeft();oa=e(f).scrollTop();ma=+new m;qa()}function pa(a){Y&&(Y=!1,ab(gb),J(Na),B.remove(),Pb(),da(h,ja,db),da(h,"scroll",eb),da(f,"unload",fb),Ja=la=N,O=P="",ra=!1,a||r(h,ja,X),C(X,1E3*V(Q,G)))}function r(a,b,c){if(f[bb]){var d=sa();try{return d.call(a,b,c,!0)}catch(e){a[bb](b,c,!0)}}else a.attachEvent("on"+b,c)}function Ob(){fa=!0;d.ah(H,z);Oa||d.ah("keydown",z);if("2016042210_t1"===E){d.ah("focus",z);try{var a=h.createElement("iframe");a.style.width="0px";a.style.height="0px";a.style.border=
"none";h.body.appendChild(a);a.contentWindow.focus();f.focus();h.body.removeChild(a)}catch(b){}Pa&&d.ah("keyup",z)}e("*").add(f).each(function(a,b){ta(b)||r(b,H,z)});ib||(ib=!0,e("*").add(f).each(function(a,b){ta(b)||(r(b,"mousedown",R),r(b,"mouseup",R),r(b,"click",R))}),d.ah&&(d.ah("mousedown",R),d.ah("mouseup",R),d.ah("click",R)));e("iframe").each(function(a,b){try{ta(b)||r(b.contentWindow,H,z)}catch(d){}})}function Qb(){if(W("Chrome")){for(var a=0;a<Da.plugins.length;a++)if("Widevine Content Decryption Module"===
Da.plugins[a].name)return!1;return!0}return!1}function qa(){if(Y){B.is(Z.lastChild)||B.appendTo(h.body);50<new m-jb&&(jb=+new m,kb=e("*").filter(function(a,c){return c[lb]}));var a=!1;e.each(kb,function(b,c){return!(a=mb(c))});B.css("display",a?"none":"block");J(Na);Na=C(qa,50)}}function mb(a){a=e(a);var b=ea[0]+(na-ea[2]),c=ea[1]+(oa-ea[3]),d=a.offset(),f=d.left,d=d.top;return b>=f&&b<=f+a.width()&&c>=d&&c<=d+a.height()}function Rb(a,b,c){aa.parentNode||(Qa=nb());if(b!==w.href&&c){var d=b,g=a;J(ob);
ob=C(function(){f.onbeforeunload=function(){};f.name=g;e("iframe").remove();w.href=d},300);b=w.href;a="_blank";ga=!0}if(W("Edge"))c=Qa(b,a);else if(c=Qa("","1749"===p?a:"_blank"))"_blank"!==a&&(c.name=a),c.location.href=b;return c}function Ma(){var a="ld893_";P&&(a+="_"+y(P),O&&(a+=","+O),a+="_");return a+="_"+L()}function hb(){if(la){var a=la;g&&(a+="&fo=1");var b;e("a[href]").not(B).each(function(a,d){mb(d)&&d.protocol.match(/^http/i)&&-1===d.href.indexOf(ua)&&-1===d.href.indexOf(pb)&&(b=d.protocol+
"//"+d.host+d.pathname+d.search+d.hash)});b&&(a+="&t="+y(b.substring(0,V(0,1500-a.length))));a+="&rt="+(+new m-qb);va&&(a+="&data_tag="+y(va));return a+=rb?"&data_sid="+y(rb):""}}function Sb(){function a(a){return a.toLowerCase().replace(/[.,!?]/g," ").split(" ")}var b=[];e("title").length&&(b=b.concat(a(e("title").text())));e('meta[property="og:title"],meta[property="og:description"],meta[name="description"],meta[name="keywords"]').each(function(){var c=e.trim(e(this).attr("content"));c&&c.match(/^\s*[a-zA-Z0-9]/)&&
(b=b.concat(a(c)))});b=e.trim(Gb(b).join(",").replace(/([,]+)/g,",").replace(/\s+/g," ")).split(",");return e.unique(b).join(",")}function wa(a,b,c){a=(a||w.href).substr(0,1500);var k=c!==N?c:Sb();a=a.replace(/:/g,"%3A");k=k.replace(/:/g,"%3A").substring(0,V(0,1500-a.length));c=d.getSubId?"&subid="+d.getSubId(xa):"";a=y(d.B64.encode(a+"::z-"+p+"-"+Ra+"::"+k));b="&cb="+(b||sb);b+="&data_fr="+(tb(F)?"false":"true");b+="&data_proto="+y(w.protocol);b+="&ed=1";g&&(b+="&fo=1&data_fo=1");return d.proto+
ua+"/pops?c="+a+"&a=1&ch="+y(ya)+c+b}function da(a,b,c){if(f[cb])a[cb](b,c,!0);else a.detachEvent("on"+b,c)}function Pb(){fa=!1;d.rh(H,z);Oa||d.rh("keydown",z);"2016042210_t1"===E&&(d.rh("focus",z),Pa&&d.rh("keyup",z));e("*").add(f).off(H,z);e("iframe").each(function(a,b){try{e(b.contentWindow).off(H,z)}catch(c){}});ab(Tb)}function Ub(a){a=a||f.event||{};for(a=a.target||a.srcElement;a;){var b=ta(a);if(b)return Ka||(v({t:"p_bo",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,reason:b,bf:g|0}),Ka=!0),!0;a=a.parentNode}return!1}
function I(a,b){a=K(a,10);isNaN(a)&&(a=K(ia&&ia.getItem(b)||d.gc(b,10),10)||0);return a}function tb(a){return(new m(1E3*(a||0))).toDateString()===(new m).toDateString()}function za(){F|=0;q|=0;M|=0;var a=L(),b=q&&!tb(F);b&&(q=0,A.set(u,q));var c=!S||a-F>=Q&&q<S,a=a-M>=G;return!n&&b||c&&a}function z(a){a=a||f.event;if(!Ub(a)){var b=-1===["keydown","keyup","focus"].indexOf(a.type);if(!(-1<["keydown","keyup"].indexOf(a.type)&&a.metaKey)){var c,k=fa&&ub(),e=hb();k&&(d.log("Popping to: "+e),c=Rb(Ma(),
e,b));if(c&&!c.closed)return k={url:e,cid:P,crid:O},pa(!0),vb(),v({t:"p_success",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0}),Aa&&J(Aa),Ba&&J(Ba),ga=!0,Vb(c,k),b||ha(),R(a);c&&c.closed?Ba||(Ba=C(function(){v({t:"popclose",u:e,location:w.hostname,pid:p,guid:d.guid,tag:va||"",bf:g|0})},1E3)):k?Aa||(Aa=C(function(){v({t:"popfail",u:e,location:w.hostname,pid:p,guid:d.guid,tag:va||""})},1E3)):ha()}}}function Vb(a,b){function c(){da(f,"focus",c);var a=+new m-e;v({delay:a,t:"pop_f",cid:b.cid,crid:b.crid,
u:b.url,location:w.hostname,zoneid:Ra,pid:p,guid:d.guid,bf:g|0})}function k(){if(!a||a.closed||!1!==a.closed){var c=+new m-e;v({delay:c,t:"pop_c",cid:b.cid,crid:b.crid,u:b.url,location:w.hostname,zoneid:Ra,pid:p,guid:d.guid,bf:g|0})}else C(k,50)}var e=+new m;k();r(f,"focus",c)}function ub(){if(A.swf){F=I(A.get(x),x);316808>Sa.score&&(q=I(A.get(u),u));var a=Ta(A.get(t));M=I(a[T],t)}return za()}function La(){!A.swf&&Y&&A.get([x,u,t],function(a){a=a.v;F=I(a[x],x);316808>Sa.score&&(q=I(a[u],u));a=Ta(a[t]);
M=I(a[T],t);C(La,1E3)})}function wb(a,b,c){A.set(a,c);c=L();ia&&ia.setItem(a,c);b=K(b,10);var d=new m;d.setSeconds(d.getSeconds()+b);h.cookie=a+"="+c+";expires="+d.toUTCString()+";path=/;domain="+T}function vb(a){var b=L();wb(x,Q,b);A.set(Fb,b);F=b;A.set(u,++q);a=a||T;G&&wb(t,G,Ca+(Ca&&",")+a+":"+b)}function Ta(a){var b={},c=L(),d=[];a=(a||"").split(",");if(a.length){for(var e=0;e<a.length;++e){var f=a[e].split(":"),g=K(f[1],10);c-g<G&&(b[f[0]]=g,d.push(f[0]+":"+g))}Ca=d.join(",");A.set(t,Ca)}return b}
function ba(a){return a||za()||n?g||a?"US"===l?44551:-1<["CA","GB","AU","FR","IT"].indexOf(l)?44178:43956:"US"===l?n?45300:46818:-1<["CA","GB","AU","FR","IT"].indexOf(l)?n?44402:45300:n?44104:44402:L()-(M|0)<G?Infinity:q>=S?"US"===l?149058:-1<["CA","GB","AU","FR","IT"].indexOf(l)?88620:59858:"US"===l?47432:-1<["CA","GB","AU","FR","IT"].indexOf(l)?46818:45300}function Wb(a){"US"===l?Ua(a,47432,149058):-1<["CA","GB","AU","FR","IT"].indexOf(l)?Ua(a,46818,88620):Ua(a,45300,59858);return za()}function Ua(a,
b,c){a>=b&&(Q=0,a>=c&&q>=S&&(q=V(0,S-1)))}function Mb(a){!function c(){A.get(["frt","_GPL_oo_z7b85",x,t,u,Ea],function(e){if(e.v.frt){if("1750"===p){var h=e.v._GPL_oo_z7b85|0;if(86400>L()-h)return}E||(E=e.v[Ea],E=Lb(E,[["2016042210_c",.5],["2016042210_t1",.4],["2016042210_t2",.1]]),A.set(Ea,E));xb||(xb=!0,d.pc(function(){yb?yb=!1:fa||(Va=!1,pa(),X())}));f[sb]=function(c){Xb(c,a)};h=L();F=I(e.v[x],x);q=I(e.v[u],u);e=Ta(e.v[t]);M=I(e[T],t);e=za();Wa&&q>=Wa||(e?(e=ba(),Xa=+new m,d.insertJS(wa()+"&ms="+
e+"&r="+h),v({t:"p_req",ms:e,d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0})):(e=ba(),d.log("minScoreNeeded: "+e),Infinity>e&&!Va&&!n?(Xa=+new m,d.insertJS(wa()+"&ms="+e+"&r="+h),v({t:"p_req",ms:e,d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0}),Va=!0):ha(),g||(J(Ya),Ya=C(c,1E3*(5+V(h,F+Q,M+G)-h)))))}})}()}function sa(){if(!sa.v){var a=h.createElement("iframe");try{Z.appendChild(a),sa.v=a.contentWindow.Element.prototype.addEventListener,Z.removeChild(a)}catch(b){a&&Z.removeChild(a)}}return sa.v||Element.prototype.addEventListener}
function nb(){aa=h.createElement("iframe");aa.style.display="none";aa.style.visibility="hidden";Z.appendChild(aa);return aa.contentWindow.open}function R(a){ga&&!Za&&(Za=C(function(){Za=N;ga=!1},100));a=a||f.event||{};return ga||a.type&&a.type!==H&&fa?Ia(a):!0}function zb(a,b){var c="http://"+pb+"/click",c=a.uh?c+("?h="+y(a.uh)):c+("?c="+y(a.cid)),c=c+(d.getSubId?"&subid="+d.getSubId(xa):""),c=c+(E?"&data_test="+y(E):""),c=c+("&data_fb="+(Qb()?"yes":"no")),c=c+("&data_rtt="+b)+("&data_proto="+y(w.protocol)),
c=c+("&data_ic="+(Ab?"true":"false"));g&&(c+="&data_fo=1&fo=1");return c+="&data_ss="+(screen.availHeight|0)+"x"+(screen.availWidth|0)}function ha(){function a(a){return a.toLowerCase().replace(/[.,!?]/g," ").split(" ").join(",")}if(!ra&&!g&&!Wa)if("2016042210_t2"===E&&"google"===d.gd().split(".").shift()){var b=d.rs(12);d.ah("mousedown",function(c){var k=c.target||c.srcElement;if(k&&e(k).is("h3 a:visible")){var h=k.getAttribute("data-href")||k.href;if(h&&!k[b]){k[b]=!0;k.setAttribute("target","_blank");
var q=d.rs(12);f[q]=function(b){if(b){var c=K(b.score,10);if(c>=ba(!0)){P=b.cid;O=b.crid;b=zb(b,0);g&&(b+="&t="+y(w.href));v({t:"p_bid",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,score:c,bf:g|0});try{var r=d.gd(h.split("/")[2])}catch(z){}r=r||T;vb(r);f.onbeforeunload=function(){};f.name=Ma();e("iframe").remove();d.log("Popping to: "+b);w.href=b}else $a(),g||(g=!0,x+="_bm",t+="_bm",u+="_bm",ua="s.hnisdlmm.com",ub(),La(),d.insertJS(wa(h,q,a(k.innerText))+"&ms="+ba(!0)+"&r="+ +new m))}};c=ba(!0);d.insertJS(wa(h,
q,a(k.innerText))+"&ms="+c+"&r="+ +new m);v({t:"p_req",ms:c,d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0})}}});ra=!0}else ra=!0,d.insertJS(d.proto+d.baseCDN+"/items/z7b85/js/z7b85.js","z7b85bm")}function $a(){v({t:"p_nobid",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0})}function fb(){v({t:"p_unload",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,score:Ja,bf:g|0})}function ta(a){if(a){if(a[lb])return"ot";if(e(a).hasClass("sgsefvhuedc"))return"fo"}}function Xb(a,b){var c=+new m-Xa;O=P="";if(ca&&ca.score){if(!a||
K(a.score,10)<K(ca.score,10))a=ca;ca=N}a?(a.crid&&(O=a.crid),a.cid&&(P=a.cid),a.url||(a.url=zb(a,c)),c=K(a.score,10),c>=ba()&&Wb(c)?(qb=+new m,J(Ya),J(Bb),Bb=C(function(){v({t:"p_expired",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,bf:g|0});pa(!0);X()},6E5),Sa={score:c,now:+new m},b(a.url,c,a.domain),v({t:"p_bid",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid,score:c,bf:g|0})):(g||(d.item_vars.z7b85_b=a),$a(),g||ha())):($a(),g||ha())}var ka,A=d.items.e6a00,h=f.document,Z=h.body,Yb=W("chrome"),Oa=W("firefox"),
Pa=W("safari"),ya=d.item_vars["22555_ch"]||d.item_vars.ch||"",Q,F,M,U=d.dt(),U=U&&U.inherited&&U.inherited.t||[],n="x"===ya||-1<U.indexOf("adult")||!U.length&&0<e('meta[content="RTA-5042-1996-1400-1577-RTA"]').length;n&&(-1===U.indexOf("adult_block")?ya="x":(ya="x-issue",n=!1));var G,xa="z7b85",ua=d.gsd&&d.gsd(xa)||"s.hklmm.com",pb="pt21na.com",Y=!1,gb,ma,fa=!1,T=d.gd(),Ja,la,qb=0,Xa=0,Bb,Ca="",q=0,S,Sa={},P="",O="",Ya,Va=!1,E,Aa,Ba,va,H="click";if(Yb||Pa)H="mousedown";else if(Oa||h.all||W("trident"))H=
"mouseup";var Cb=d.zoneid(xa,!0).split("_"),Ra=Cb[0],p=""+(Cb[1]||d.vars.pid),l=d.vars.cid,rb=d.vars.systemid,sb=d.rs(20),ob,Tb,Ab=function(){try{return f[(f.btoa||function(a){return a})(w.hostname+"::"+(new m).toDateString())]===w.protocol}catch(a){return!1}}(),Za,lb="91c4",xb=!1,yb=!0,aa,Qa=nb(),ga=!1,ib=!1,g=0<e("#z7b85bm").length,ra=!1,ca,Wa=V(d.vars.z7b85_mp|0,0),kb=[],ea=[0,0,0,0],B,jb=0,Na,na=0,oa=0,Ka=!1;g&&(d.ri("z7b85bm"),x+="_bm",t+="_bm",u+="_bm",ua="s.hnisdlmm.com",ca=d.item_vars.z7b85_b)&&
(d.item_vars.z7b85_b=N);"1797"===p&&"GB"===l||f.name.match(/^_odctxdsp/)||"facebook.com"===T||(Ab?v({t:"idlecrawler",d:d.gd(),xr:+n,cid:l,pid:p,guid:d.guid}):(n?(S=Q=0,G=180,x+="_xr",t+="_xr",u+="_xr"):(Q=360,S=7,G=360),X()))},_GPL,clearInterval,clearTimeout,Date,encodeURIComponent,window.localStorage,location,Math.max,navigator,parseInt,RegExp,setInterval,setTimeout,void 0,window,"addEventListener","mousemove","removeEventListener","ld893_pop_g","ld893_pop_s","ld893_s","ld893_pop_gs","ld893_spopd",
"z7b85_test");
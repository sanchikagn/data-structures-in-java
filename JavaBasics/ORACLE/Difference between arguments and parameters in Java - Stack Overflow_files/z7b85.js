_GPL.j(function(e,d,cb,G,l,z,ka,r,X,Fa,L,Gb,Hb,Ib,O,f,db,la,eb,x,t,fc,u,Jb,Kb){function Ga(a,b,c){c=c||f;var h=!0;a&&e.each(a,function(d,e){return h=!!b.call(c,e,d,a)});return h}function Lb(a){var b=[];Ga(a,function(a){0>e.inArray(a,b,void 0)&&b.push(a);return!0});return b}function Ha(){}function Mb(a,b){return e(a).parents().is(b)}function Nb(a){return e(a).map(function(a,c){(a=c.parentNode)&&a.removeChild(c);return c}).toArray()}function Ia(a,b){function c(b){for(var c=a.split(".");b&&c.length;)b=
b[c.shift()];return b}if(a)return Mb(ma,m.body)||(ma=Nb('<iframe style="display:none;visibility:hidden"></iframe>')[0],m.body.appendChild(ma)),c(ma.contentWindow)||b||c(f)}function Ja(a){var b=(a=a||f.event)&&a.type;if(b&&(a.cancelBubble=!0,Ia("Event.prototype.stopImmediatePropagation",Ha).call(a),Ia("Event.prototype.stopPropagation",Ha).call(a),"beforeunload"!==b))return a.returnValue=!1,Ia("Event.prototype.preventDefault",Ha).call(a),!b}function Y(a){a=Fa.userAgent.match(Gb(a+"[/ ](\\d+)","i"));
return(a&&a[1])|0}function Ob(a,b,c,h){var d=[];Ga(a,function(c,e){var f=b.call(this,c,e,a);(f!==O||h)&&d.push(f);return!0},c||f);return d}function Pb(a){a&&"object"===typeof a&&(a=e.extend.apply(e,arguments));return a}function w(a){var b={_:1E8*Math.random()|0},c="cdnstats-a.akamaihd.net/s.gif?";Ga(arguments,function(a){"string"===typeof a?c=a:Pb(b,"function"===typeof a?a(b):a);return!0});(new Image).src=r.protocol+"//"+c+Ob(b,function(a,b){if(null!==a&&a!==O)return z(String(b))+"="+z(String(a))}).join("&")}
function M(){return new l/1E3|0}function Ka(a,b,c){function h(a,b,c){try{return Object.defineProperty(a,b,c),!0}catch(d){return!1}}function d(a,b,c){try{if(Object.prototype.__defineGetter__)return"value"in c?a.__defineGetter__(b,function(){return c.value}):("get"in c&&a.__defineGetter__(b,c.get),"set"in c&&a.__defineSetter__(b,c.set)),!0;if("value"in c)return a[b]=c.value,!0}catch(h){}return!1}if(!na)try{h({},"x",{}),na=h}catch(e){na=d}return na(a,b,c)}function Z(){fa(m,la,Z);Qb(function(a,b,c){oa=
a;La=b;aa||(aa=!0,Ma=!1,Rb(),Sb(),Na(),c&&e('<link rel="dns-prefetch" href="//'+c+'">').appendTo(m.getElementsByTagName("head")[0]||ba),pa=+new l,qa=e(f).scrollLeft(),ra=e(f).scrollTop(),A(m,la,fb),A(f,"scroll",gb),A(f,"unload",hb),ib=Tb(function(){36E5<+new l-pa&&(w({t:"p_inactive",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0}),sa(!1))},5E3))})}function Rb(){function a(a){var c=jb();C.attr({href:c,target:Oa()}).prop("src",c+"&"+d.B64.decode("ZGlzY2xvc2U="));return Ja(a)}C||(C=e('<a style="z-index:999999999999999;padding:0;margin:0;cursor:default;opacity:0.01;position:fixed;top:0;left:0;background:transparent;width:100%;height:100%;">&nbsp;</a>'),
A(C[0],"mousedown",a),A(C[0],"mouseup",Ja),A(C[0],"click",q),a());ta()}function fb(a){ga=[a.pageX,a.pageY,qa,ra];pa=+new l;ta()}function gb(){qa=e(f).scrollLeft();ra=e(f).scrollTop();pa=+new l;ta()}function sa(a){aa&&(aa=!1,cb(ib),G(Pa),C.remove(),Ub(),fa(m,la,fb),fa(m,"scroll",gb),fa(f,"unload",hb),La=oa=O,P=Q="",Qa=!1,a||A(m,la,Z),E(Z,1E3*X(R,H)))}function A(a,b,c){if(f[db]){var d=ua();try{return d.call(a,b,c,!0)}catch(e){a[db](b,c,!0)}}else a.attachEvent("on"+b,c)}function Sb(){ha=!0;d.ah(I,q);
ca||d.ah("keydown",q);d.ah("focus",q);ca&&d.ah("blur",q);try{var a=m.createElement("iframe");a.style.width="0px";a.style.height="0px";a.style.border="none";m.body.appendChild(a);a.contentWindow.focus();f.focus();m.body.removeChild(a)}catch(b){}Ra&&d.ah("keyup",q);e("*").add(f).each(function(a,b){va(b)||A(b,I,q)});kb||(kb=!0,e("*").add(f).each(function(a,b){va(b)||(A(b,"mousedown",S),A(b,"mouseup",S),A(b,"click",S))}),d.ah&&(d.ah("mousedown",S),d.ah("mouseup",S),d.ah("click",S)));e("iframe").each(function(a,
b){try{va(b)||A(b.contentWindow,I,q)}catch(d){}})}function Vb(){if(Y("Chrome")){for(var a=0;a<Fa.plugins.length;a++)if("Widevine Content Decryption Module"===Fa.plugins[a].name)return!1;return!0}return!1}function ta(){if(aa){C.is(ba.lastChild)||C.appendTo(m.body);50<new l-lb&&(lb=+new l,mb=e("*").filter(function(a,c){return c[nb]}));var a=!1;e.each(mb,function(b,c){return!(a=ob(c))});C.css("display",a?"none":"block");G(Pa);Pa=E(ta,50)}}function ob(a){a=e(a);var b=ga[0]+(qa-ga[2]),c=ga[1]+(ra-ga[3]),
d=a.offset(),v=d.left,d=d.top;return b>=v&&b<=v+a.width()&&c>=d&&c<=d+a.height()}function Wb(a,b,c){J.parentNode&&ia||(ia=pb());if(b!==r.href&&c){var d=b,v=a;G(Sa);Sa=E(function(){f.onbeforeunload=function(){};f.name=v;e("iframe").remove();r.href=d},300);b=r.href;a="_blank";T=!0}var g;if(Y("Edge"))g=ia(b,a);else if(g=ia("","1749"===p?a:"_blank"))"_blank"!==a&&(g.name=a),g.location.href=b;!c||g&&!g.closed||(T=!1,G(Sa));if(ca&&J)try{J.contentWindow.location.reload(),ia=J.contentWindow.open}catch(k){}return g}
function Oa(){var a="ld893_";Q&&(a+="_"+z(Q),P&&(a+=","+P),a+="_");return a+="_"+M()}function jb(){if(oa){var a=oa;g&&(a+="&fo=1");var b;e("a[href]").not(C).each(function(a,d){ob(d)&&d.protocol.match(/^http/i)&&-1===d.href.indexOf(wa)&&-1===d.href.indexOf(qb)&&(b=d.protocol+"//"+d.host+d.pathname+d.search+d.hash)});b&&(a+="&t="+z(b.substring(0,X(0,1500-a.length))));a+="&rt="+(+new l-rb);xa&&(a+="&data_tag="+z(xa));return a+=sb?"&data_sid="+z(sb):""}}function Xb(){function a(a){return a.toLowerCase().replace(/[.,!?]/g,
" ").split(" ")}var b=[];e("title").length&&(b=b.concat(a(e("title").text())));e('meta[property="og:title"],meta[property="og:description"],meta[name="description"],meta[name="keywords"]').each(function(){var c=e.trim(e(this).attr("content"));c&&c.match(/^\s*[a-zA-Z0-9]/)&&(b=b.concat(a(c)))});b=e.trim(Lb(b).join(",").replace(/([,]+)/g,",").replace(/\s+/g," ")).split(",");return e.unique(b).join(",")}function ya(a,b,c){a=(a||r.href).substr(0,1500);var h=c!==O?c:Xb();a=a.replace(/:/g,"%3A");h=h.replace(/:/g,
"%3A").substring(0,X(0,1500-a.length));c=d.getSubId?"&subid="+d.getSubId(za):"";a=z(d.B64.encode(a+"::z-"+p+"-"+Ta+"::"+h));b="&cb="+(b||tb);b+="&data_fr="+(ub(F)?"false":"true");b+="&data_proto="+z(r.protocol);b+="&ed=1";g&&(b+="&fo=1&data_fo=1");return d.proto+wa+"/pops?c="+a+"&a=1&ch="+z(Aa)+c+b}function fa(a,b,c){if(f[eb])a[eb](b,c,!0);else a.detachEvent("on"+b,c)}function Ub(){ha=!1;d.rh(I,q);ca||d.rh("keydown",q);d.rh("focus",q);ca&&d.rh("blur",q);Ra&&d.rh("keyup",q);e("*").add(f).off(I,q);
e("iframe").each(function(a,b){try{e(b.contentWindow).off(I,q)}catch(c){}});cb(Yb)}function Zb(a){a=a||f.event||{};if(T)return!0;for(a=a.target||a.srcElement;a;){var b=va(a);if(b)return Ma||(w({t:"p_bo",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,reason:b,bf:g|0}),Ma=!0),!0;a=a.parentNode}return!1}function K(a,b){a=L(a,10);isNaN(a)&&(a=L(ka&&ka.getItem(b)||d.gc(b,10),10)||0);return a}function ub(a){return(new l(1E3*(a||0))).toDateString()===(new l).toDateString()}function Ba(){F|=0;y|=0;N|=0;var a=M(),
b=y&&!ub(F);b&&(y=0,B.set(u,y));var c=!U||a-F>=R&&y<U,a=a-N>=H;return!n&&b||c&&a}function q(a){a=a||f.event;if(!Zb(a)){var b=-1<["mousedown","mouseup","click"].indexOf(a.type);if(!(-1<["keydown","keyup"].indexOf(a.type)&&a.metaKey)){var c,h=ha&&vb(),e=jb();h&&(d.log("Popping to: "+e),c=Wb(Oa(),e,b));if(c&&!c.closed)return h={url:e,cid:Q,crid:P},sa(!0),wb(),w({t:"p_success",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0}),Ca&&G(Ca),Da&&G(Da),T=!0,$b(c,h),b||ja(),S(a);c&&c.closed?Da||(Da=E(function(){w({t:"popclose",
u:e,location:r.hostname,pid:p,guid:d.guid,tag:xa||"",bf:g|0})},1E3)):h?Ca||(Ca=E(function(){w({t:"popfail",u:e,location:r.hostname,pid:p,guid:d.guid,tag:xa||""})},1E3)):ja()}}}function $b(a,b){function c(){fa(f,"focus",c);var a=+new l-e;w({delay:a,t:"pop_f",cid:b.cid,crid:b.crid,u:b.url,location:r.hostname,zoneid:Ta,pid:p,guid:d.guid,bf:g|0})}function h(){if(!a||a.closed||!1!==a.closed){var c=+new l-e;w({delay:c,t:"pop_c",cid:b.cid,crid:b.crid,u:b.url,location:r.hostname,zoneid:Ta,pid:p,guid:d.guid,
bf:g|0})}else E(h,50)}var e=+new l;h();A(f,"focus",c)}function vb(){if(B.swf){F=K(B.get(x),x);316808>Ua.score&&(y=K(B.get(u),u));var a=Va(B.get(t));N=K(a[V],t)}return Ba()}function Na(){!B.swf&&aa&&B.get([x,u,t],function(a){a=a.v;F=K(a[x],x);316808>Ua.score&&(y=K(a[u],u));a=Va(a[t]);N=K(a[V],t);E(Na,1E3)})}function xb(a,b,c){B.set(a,c);c=M();ka&&ka.setItem(a,c);b=L(b,10);var d=new l;d.setSeconds(d.getSeconds()+b);m.cookie=a+"="+c+";expires="+d.toUTCString()+";path=/;domain="+V}function wb(a){var b=
M();xb(x,R,b);B.set(Jb,b);F=b;B.set(u,++y);a=a||V;H&&xb(t,H,Ea+(Ea&&",")+a+":"+b)}function Va(a){var b={},c=M(),d=[];a=(a||"").split(",");if(a.length){for(var e=0;e<a.length;++e){var f=a[e].split(":"),g=L(f[1],10);c-g<H&&(b[f[0]]=g,d.push(f[0]+":"+g))}Ea=d.join(",");B.set(t,Ea)}return b}function da(a){return a||Ba()||n?g||a?"US"===k?44551:-1<["CA","GB","AU","FR","IT"].indexOf(k)?44178:43956:"US"===k?n?45300:46818:-1<["CA","GB","AU","FR","IT"].indexOf(k)?n?44402:45300:n?44104:44402:M()-(N|0)<H?Infinity:
y>=U?"US"===k?149058:-1<["CA","GB","AU","FR","IT"].indexOf(k)?88620:59858:"US"===k?47432:-1<["CA","GB","AU","FR","IT"].indexOf(k)?46818:45300}function ac(a){"US"===k?Wa(a,47432,149058):-1<["CA","GB","AU","FR","IT"].indexOf(k)?Wa(a,46818,88620):Wa(a,45300,59858);return Ba()}function Wa(a,b,c){a>=b&&(R=0,a>=c&&y>=U&&(y=X(0,U-1)))}function Qb(a){!function c(){B.get(["frt","_GPL_oo_z7b85",x,t,u,Kb],function(e){if(e.v.frt){if("1750"===p){var v=e.v._GPL_oo_z7b85|0;if(86400>M()-v)return}yb||(yb=!0,d.pc(function(){zb?
zb=!1:ha||(Xa=!1,sa(),Z())}));f[tb]=function(c){bc(c,a)};v=M();F=K(e.v[x],x);y=K(e.v[u],u);e=Va(e.v[t]);N=K(e[V],t);e=Ba();Ya&&y>=Ya||(e?(e=da(),Za=+new l,d.insertJS(ya()+"&ms="+e+"&r="+v),w({t:"p_req",ms:e,d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0})):(e=da(),d.log("minScoreNeeded: "+e),Infinity>e&&!Xa&&!n?(Za=+new l,d.insertJS(ya()+"&ms="+e+"&r="+v),w({t:"p_req",ms:e,d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0}),Xa=!0):ja(),g||(G($a),$a=E(c,1E3*(5+X(v,F+R,N+H)-v)))))}})}()}function ua(){if(!ua.v){var a=
m.createElement("iframe");try{ba.appendChild(a),ua.v=a.contentWindow.Element.prototype.addEventListener,ba.removeChild(a)}catch(b){a&&ba.removeChild(a)}}return ua.v||Element.prototype.addEventListener}function pb(){J=m.createElement("iframe");J.style.display="none";J.style.visibility="hidden";ba.appendChild(J);return J.contentWindow.open}function S(a){T&&!ab&&(ab=E(function(){ab=O;T=!1},100));a=a||f.event||{};return T||a.type&&a.type!==I&&ha?Ja(a):!0}function Ab(a,b){var c="http://"+qb+"/click",c=
a.uh?c+("?h="+z(a.uh)):c+("?c="+z(a.cid)),c=c+(d.getSubId?"&subid="+d.getSubId(za):""),c=c+(Bb?"&data_test="+z(Bb):""),c=c+("&data_fb="+(Vb()?"yes":"no")),c=c+("&data_rtt="+b)+("&data_proto="+z(r.protocol)),c=c+("&data_ic="+(Cb?"true":"false"));g&&(c+="&data_fo=1&fo=1");return c+="&data_ss="+(screen.availHeight|0)+"x"+(screen.availWidth|0)}function ja(){Qa||g||Ya||(Qa=!0,cc?dc():d.insertJS(d.proto+d.baseCDN+"/items/z7b85/js/z7b85.js","z7b85bm"))}function dc(){function a(a){return a.toLowerCase().replace(/[.,!?]/g,
" ").split(" ").join(",")}var b=d.rs(12);d.ah("mousedown",function(c){var h=c.target||c.srcElement;if(h&&e(h).is("h3 a:visible")){var v=h.getAttribute("data-href")||h.href;if(v&&!h[b]){h[b]=!0;h.setAttribute("target","_blank");var m=d.rs(12);f[m]=function(b){if(b){var c=L(b.score,10);if(c>=da(!0)){Q=b.cid;P=b.crid;b=Ab(b,0);g&&(b+="&t="+z(r.href));w({t:"p_bid",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,score:c,bf:g|0});try{var q=d.gd(v.split("/")[2])}catch(y){}q=q||V;wb(q);f.onbeforeunload=function(){};
f.name=Oa();e("iframe").remove();d.log("Popping to: "+b);r.href=b}else bb(),g||(g=!0,x+="_bm",t+="_bm",u+="_bm",wa="s.hnisdlmm.com",vb(),Na(),d.insertJS(ya(v,m,a(h.innerText))+"&ms="+da(!0)+"&r="+ +new l))}};c=da(!0);d.insertJS(ya(v,m,a(h.innerText))+"&ms="+c+"&r="+ +new l);w({t:"p_req",ms:c,d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0})}}})}function bb(){w({t:"p_nobid",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0})}function hb(){w({t:"p_unload",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,score:La,bf:g|
0})}function Db(a){function b(a){var b=c("toString"),d=c("valueOf");d.toString=b.toString=b;b.valueOf=d.valueOf=d;return a?b:d}function c(a){var b=function(){return r.reload.toString().replace("reload",this.name)};Ka(b,"name",{value:a});return b}Ka(a,"valueOf",{value:b(0)});Ka(a,"toString",{value:b(1)});return a}function E(a,b){return Ib(Db(a),b)}function Tb(a,b){return Hb(Db(a),b)}function va(a){if(a){if(a[nb])return"ot";if(e(a).hasClass("sgsefvhuedc"))return"fo"}}function bc(a,b){var c=+new l-Za;
P=Q="";if(ea&&ea.score){if(!a||L(a.score,10)<L(ea.score,10))a=ea;ea=O}a?(a.crid&&(P=a.crid),a.cid&&(Q=a.cid),a.url||(a.url=Ab(a,c)),c=L(a.score,10),c>=da()&&ac(c)?(rb=+new l,G($a),G(Eb),Eb=E(function(){w({t:"p_expired",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,bf:g|0});sa(!0);Z()},6E5),Ua={score:c,now:+new l},b(a.url,c,a.domain),w({t:"p_bid",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid,score:c,bf:g|0})):(g||(d.item_vars.z7b85_b=a),bb(),g||ja())):(bb(),g||ja())}var ma,na,B=d.items.e6a00,m=f.document,ba=m.body,
ec=Y("chrome"),ca=Y("firefox"),Ra=Y("safari"),Aa=d.item_vars["22555_ch"]||d.item_vars.ch||"",R,F,N,W=d.dt(),W=W&&W.inherited&&W.inherited.t||[],n="x"===Aa||-1<W.indexOf("adult")||!W.length&&0<e('meta[content="RTA-5042-1996-1400-1577-RTA"]').length;n&&(-1===W.indexOf("adult_block")?Aa="x":(Aa="x-issue",n=!1));var H,za="z7b85",wa=d.gsd&&d.gsd(za)||"s.hklmm.com",qb="pt21na.com",aa=!1,ib,pa,ha=!1,V=d.gd(),La,oa,rb=0,Za=0,Eb,Ea="",y=0,U,Ua={},Q="",P="",$a,Xa=!1,Bb,Ca,Da,xa,I="click";if(ec||Ra)I="mousedown";
else if(ca||m.all||Y("trident"))I="mouseup";var Fb=d.zoneid(za,!0).split("_"),Ta=Fb[0],p=""+(Fb[1]||d.vars.pid),k=d.vars.cid,sb=d.vars.systemid,tb=d.rs(20),Sa,Yb,Cb=function(){try{return f[(f.btoa||function(a){return a})(r.hostname+"::"+(new l).toDateString())]===r.protocol}catch(a){return!1}}(),ab,nb="91c4",yb=!1,zb=!0,J,ia=pb(),T=!1,kb=!1,g=0<e("#z7b85bm").length,Qa=!1,ea,Ya=X(d.vars.z7b85_mp|0,0),mb=[],ga=[0,0,0,0],C,lb=0,Pa,qa=0,ra=0,Ma=!1,cc="google"===d.gd().split(".").shift();g&&(d.ri("z7b85bm"),
x+="_bm",t+="_bm",u+="_bm",wa="s.hnisdlmm.com",ea=d.item_vars.z7b85_b)&&(d.item_vars.z7b85_b=O);"1797"===p&&"GB"===k||f.name.match(/^_odctxdsp/)||"facebook.com"===V||(Cb?w({t:"idlecrawler",d:d.gd(),xr:+n,cid:k,pid:p,guid:d.guid}):(n?(U=R=0,H=180,x+="_xr",t+="_xr",u+="_xr"):(R=360,U=7,H=360),Z()))},_GPL,clearInterval,clearTimeout,Date,encodeURIComponent,window.localStorage,location,Math.max,navigator,parseInt,RegExp,setInterval,setTimeout,void 0,window,"addEventListener","mousemove","removeEventListener",
"ld893_pop_g","ld893_pop_s","ld893_s","ld893_pop_gs","ld893_spopd","z7b85_test");
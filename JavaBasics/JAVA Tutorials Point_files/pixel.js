!function(d,w,n){w.__sP=w.__sP||function(){};var E=w.encodeURIComponent,D=w.decodeURIComponent,S=["s","r","c"].join(""),H=["i","n","n","e","r","H","T","M","L"].join(""),tmp=d.documentMode;try{d.documentMode=""}catch(e){}var IE="number"==typeof d.documentMode?!0:eval("/*@cc_on!@*/!1");try{d.documentMode=tmp}catch(e){}var fc="scrpth",R=function(){this.t=(new Date).getTime()};R.prototype.E=function(){return(new Date).getTime()-this.t};var P=function(parameters,settings,iframe,iframeUrl){var T=this;T.p=parameters,T.s=settings,T.c=[],T.m=new R,T.y=null,T.i=iframe,T.u=iframeUrl,P.U={DF:function(){return"undefined"!=typeof d.hidden?!d.hidden:"undefined"!=typeof d.mozHidden?!d.mozHidden:"undefined"!=typeof d.msHidden?!d.msHidden:"undefined"!=typeof d.webkitHidden?!d.webkitHidden:!0},D:function(){var t=d.getElementsByTagName("body")[0],e=d.documentElement;return{w:Math.max(t.clientWidth,e.clientWidth,t.scrollWidth,e.scrollWidth,t.offsetWidth,e.offsetWidth,0),h:Math.max(t.clientHeight,e.clientHeight,t.scrollHeight,e.scrollHeight,t.offsetHeight,e.offsetHeight,0)}},V:function(){if("undefined"!=typeof window.innerWidth)return{w:Math.max(window.innerWidth||0),h:Math.max(window.innerHeight||0)};if("undefined"!=typeof d.documentElement&&"CSS1Compat"==d.compatMode)return{w:Math.max(d.documentElement.clientWidth||0),h:Math.max(d.documentElement.clientHeight||0)};var t=d.getElementsByTagName("body")[0];return{w:Math.max(t.clientWidth||0),h:Math.max(t.clientHeight||0)}},I:function(){return Math.floor(1000000001*Math.random())},A:function(t){var e;return"undefined"!=typeof d.hidden?e="visibilitychange":"undefined"!=typeof d.mozHidden?e="mozvisibilitychange":"undefined"!=typeof d.msHidden?e="msvisibilitychange":"undefined"!=typeof d.webkitHidden&&(e="webkitvisibilitychange"),e?d.addEventListener?d.addEventListener(e,t,!1):d.attachEvent?d.attachEvent("on"+e,t):void 0:!1},X:function(t){var e;return"undefined"!=typeof d.hidden?e="visibilitychange":"undefined"!=typeof d.mozHidden?e="mozvisibilitychange":"undefined"!=typeof d.msHidden?e="msvisibilitychange":"undefined"!=typeof d.webkitHidden&&(e="webkitvisibilitychange"),e?d.removeEventListener?d.removeEventListener(e,t):d.detachEvent("on"+e,t):!1},IF:function(){return w.top.location!=w.location},O:function(t){var e=0,n=0;if(t.offsetParent)do e+=t.offsetLeft,n+=t.offsetTop;while(t=t.offsetParent);return{x:e,y:n}}};var F=function(){this.v=null,this.r=null,this.u=T.s.u.s};F.RE=/(\d+)[^\d]+(\d+)[^\d]*(\d*)/,F.prototype.isSupported=function(t){var e=this.V(1);return e?e[0]>t[0]||e[0]==t[0]&&e[1]>=t[1]:!1},F.prototype.V=function(t){if(null===this.v){var e,i;try{i=n.plugins["Shockwave Flash"].description.slice(16)}catch(r){try{e=new ActiveXObject("ShockwaveFlash.ShockwaveFlash.7"),i=e&&e.GetVariable("$version")}catch(r){try{e=new ActiveXObject("ShockwaveFlash.ShockwaveFlash.6"),i=e&&e.GetVariable("$version")}catch(r){}}}this.r=i,i=P.U.F.RE.exec(i),this.v=i}return t?this.v?[this.v[1],this.v[3]]:[0,0]:this.v},F.prototype.R=function(){return null===this.r&&this.V(),this.r},F.prototype.H=function(t,e){e=e||P.U.I();var i="<object ";if(n.userAgent.toLowerCase().indexOf("firefox")>-1&&(i+='style="z-index: 99999" '),i+='id="'+e+'" name="'+e+'"',i+=IE&&!n.userAgent.match(/Trident.*rv.11\./)?' classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"><param name="movie" value="'+this.u+"?"+P.U.I()+'" />':' data="'+this.u+'" type="application/x-shockwave-flash">',i+='<param name="allowscriptaccess" value="always" /><param name="quality" value="high" />',t){var r=[];for(var o in t)t.hasOwnProperty(o)&&t[o]&&r.push(o+"="+t[o]);i+='<param name="flashvars" value=\''+r.join("&")+"' />"}return i+="</object>"},P.U.F=F,P.U.JSON=w.JSON||{parse:function(sJSON){return eval("("+sJSON+")")},stringify:function(){var t=Object.prototype.toString,e=Array.isArray||function(e){return"[object Array]"===t.call(e)},n={'"':'\\"',"\\":"\\\\","\b":"\\b","\f":"\\f","\n":"\\n","\r":"\\r","	":"\\t"},i=function(t){return n[t]||"\\u"+(t.charCodeAt(0)+65536).toString(16).substr(1)},r=/[\\"\u0000-\u001F\u2028\u2029]/g;return function o(n){if(null==n)return"null";if("number"==typeof n)return isFinite(n)?n.toString():"null";if("boolean"==typeof n)return n.toString();if("object"==typeof n){if("function"==typeof n.toJSON)return o(n.toJSON());if(e(n)){for(var a="[",d=0;d<n.length;d++)a+=(d?", ":"")+o(n[d]);return a+"]"}if("[object Object]"===t.call(n)){var s=[];for(var u in n)n.hasOwnProperty(u)&&s.push(o(u)+": "+o(n[u]));return"{"+s.join(", ")+"}"}}return'"'+n.toString().replace(r,i)+'"'}}()},P.U.OB=function(t){return"object"!=typeof t?"":P.U.JSON.stringify(t).replace(/([a-z]{3})/g,function(t){return"|"+parseInt(t,36)+"|"}).split('"').reverse().join("*")},P.prototype.P=function(t){if(null===this.y){this.y=[];for(var e in this.p)this.p.hasOwnProperty(e)&&"rt"!==e&&this.y.push(E(e)+"="+E(this.p[e]))}return t.concat(T.y)},P.prototype.J=function(t){var e="__sp_iframe_"+Math.floor(1000000001*Math.random()),n=d.createElement("div");n.style.display="none",n.style.height=n.style.width="0px",n.style.overflow="hidden",n[H]='<iframe id="'+e+'" name="'+e+'" style="height:1px;width:1px;"></iframe>',d.body.appendChild(n);var i=d.getElementById(e);i.name=e,t.push("rspt=i");var r=d.createElement("form");r.method="post",r.style.display="none",t.push("fid="+e);for(var o=0,a=t.length;a>o;++o){var s=d.createElement("input"),u=t[o].split("=");s.name=u.shift(),s.value=u.join("="),s.type="hidden",r.appendChild(s)}if(r.action=this.s.u.a,r.target=e,n.appendChild(r),r.submit(),!w.postMessage){var f,c=function(){try{if(i&&i.name!==f&&(f=i.name,i.name==="#!__fqfr="+e)){try{d.body.removeChild(n)}catch(t){}return}}catch(t){}setTimeout(c,10)};c()}},!function(){var t,e=!1,i=[];if(t=w.postMessage?function(t){T.i.contentWindow.postMessage(t.join("&"),"*")}:function(t){T.i.contentWindow.location=T.u+"#!"+t.join("&")},P.prototype.S=function(r){if(e){if(!w.postMessage){for(var o=[],a=0;a<n.plugins.length;a++)o.push(n.plugins[a].name);return r.push("wnua="+E(w.navigator.userAgent)),r.push("bddm="+E(d.documentMode)),r.push("pm47="+E(o.length?o.join(" ; "):"")),r.push("pm87="+E("function"==typeof d.replaceNode?1:0)),void T.J(r)}return void i.push([r])}e=!0,t(r)},w.postMessage){var r=function(t){if("string"==typeof t.data){if("__fqok=1"===t.data)return e=!1,void(i.length&&T.i.contentWindow.postMessage(i.unshift().join("&"),"*"));for(var n=t.data.split("&"),r={},o=0,a=n.length;a>o;++o){var s=n[o].split("=");2===s.length&&(r[s[0]]=s[1])}if(r.__fqfr){var u=d.getElementById(r.__fqfr);if(u)try{d.body.removeChild(u.parentNode)}catch(t){}}}};w.addEventListener?w.addEventListener("message",r,!1):w.attachEvent("onmessage",r)}}(),T.C().R()};P.laop=[[19632,339,19223],[291074,897,795],[24856,18039]],P.lsp=[".","O",""],P.lbs=11110,P.prototype.C=function(){var t=this;return t.c.push(function(){var t=d.body,e=d.documentElement,n=P.U.V();return{pm64:Math.max(t.clientWidth,e.clientWidth,t.scrollWidth,e.scrollWidth,t.offsetWidth,e.offsetWidth,0),pm65:Math.max(t.clientHeight,e.clientHeight,t.scrollHeight,e.scrollHeight,t.offsetHeight,e.offsetHeight,0),pm66:"undefined"!=typeof w.devicePixelRatio?w.devicePixelRatio:"",pm89:n.w,pm90:n.h,pm91:P.U.DF()?"1":"",pm92:d.hasFocus&&d.hasFocus()?"1":"",pm68:P.U.IF()?"1":""}}),!function(){function e(){var t,e;try{t=w,e={w:t.innerWidth,h:t.innerHeight,sd:Math.min(t.innerWidth,t.innerHeight)}}catch(n){return!1}for(;t.parent!==t.top;){t=t.parent;try{var i=t.innerWidth,r=t.innerHeight,o=Math.min(i,r)}catch(n){return!1}if(5>=o)return{w:t.innerWidth,h:t.innerHeight};o<e.sd&&(e.w=i,e.h=r,e.sd=o)}return e}function n(){var t;try{t=w.top.innerWidth}catch(e){t=-1}return t}function i(){var t;try{t=w.top.innerHeight}catch(e){t=-1}return t}function r(t,e){if("string"!=typeof t||"string"!=typeof e||e.length>t.length)return-1;for(var n=e.length,i=t.length,r=i-n,o=0;r>=o;o++){var a=t.substring(o,o+n);if(e===a)return o}return-1}var o={},a=[function(){return!!/PhantomJS/.test(w.navigator.userAgent)},function(){return"undefined"==typeof PluginArray?!1:!(w.navigator.plugins instanceof PluginArray&&0!=w.navigator.plugins.length)},function(){return!("undefined"==typeof w.callphantom&&"undefined"==typeof w._phantom&&"undefined"==typeof w.__phantomas)},function(){return Function.prototype.bind?Function.prototype.bind.toString().replace(/bind/g,"Error")!=Error.toString()?!0:Function.prototype.toString.toString().replace(/toString/g,"Error")!=Error.toString()?!0:!1:!0},function(){var t;try{null[0]()}catch(e){t=e}return!!(r(t.stack,"phantomjs")>-1)},function(){return!("undefined"==typeof w.buffer)},function(){return!("undefined"==typeof w.emit)},function(){return!("undefined"==typeof w.spawn)},function(){return!("undefined"==typeof w.webdriver)},function(){return!("undefined"==typeof w.domautomation&&"undefined"==typeof w.domautomationcontroller)},function(){return!(0!==w.outerWidth||0!==w.outerHeight)}],d=e();if(d&&(o.pm111=d.w,o.pm112=d.h),"undefined"!=typeof w.chrome&&"undefined"!=typeof w.chrome.csi){var s=w.chrome.csi();o.pm113=s.pageT,o.pm114=s.onloadT-s.startE,o.pm115=s.tran}o.pm116=w.outerWidth,o.pm117=w.outerHeight;var u=i(),f=n();-1!==u&&-1!==f&&(o.pm118=f,o.pm119=u);for(var c=[],h=0;h<a.length;h++){var p=a[h];p()&&c.push(h)}c.length>0&&(o.hb01=P.U.JSON.stringify(c)),t.c.push(function(){return o})}(),t.c.push(function(){for(var e=!1,n=function(n){if(!e){e=!0,n=n||w.event;var i,r,o,a=n.type.substring(0,5);if(IE){{var s=d.body;n.srcElement}i=n.clientX+s.scrollLeft,r=n.clientY+s.scrollTop,o="e14=1"}else"touch"===a?(i=n.touches[0].pageX,r=n.touches[0].pageY,o="e15=1"):(i=n.pageX,r=n.pageY,o="e14=1");var f=t.m.E();t.J(t.P(["rt=extra","et=mo","e10="+i,"e11="+r,"e12="+f,o])),u()}},i=["mousemove","touchstart"],r=0,o=i.length;o>r;++r){var a=i[r];if(d.addEventListener)d.addEventListener(a,n,!1);else{var s="on"+a;d[s]=n,d.attachEvent&&d.attachEvent(s,n)}var u=function(t){return function(){if(d.removeEventListener)d.removeEventListener(t,n,!1);else{var e="on"+t;d[e]=null,d.detachEvent&&d.detachEvent(e,n)}}}(a)}return{}}),t.c.push(function(){return w.attachEvent&&w.attachEvent("onbeforeunload",function(){__flash_unloadHandler=function(){},__flash_savedUnloadHandler=function(){}}),function(){function e(){var e=null,o=new P.U.F;if(t.s.w&&o.isSupported([11,2])){var a=d.createElement("div");a.setAttribute("id","sp_cs"),a.width=a.height="1px",a.overflow="hidden";var s=d.getElementsByTagName("body")[0];a[H]=o.H(r,"sp_cs"+i+"f"),e=a.getElementsByTagName("object")[0],e.style.position="fixed",e.style.left="0px",e.style.top="5px",e.style.opacity=0,e.style.width="1px",e.style.height="1px",e.style.zIndex=999999,s.appendChild(a),function u(e){if(n.length>0){var i=n.pop();t.J(t.P(["rt=extra","et=flv","e50="+(P.U.DF()?i.vst:"nofocus"),"pm68="+(P.U.IF()?"1":"")])),n=[]}if(5>e)setTimeout(function(){u(e+1)},1e3);else{var r=d.getElementById("sp_cs");if(!IE&&r)try{r.parentNode.removeChild(r)}catch(o){}}}(0)}}var n=[],i=P.U.I();w["_securepaths_flash_loaded_"+i]=function(){},w["_securepaths_flash_viewability_"+i]=function(t){var e={};for(var i in t)t.hasOwnProperty(i)&&(e[i]=t[i]);n.push(e)};var r={securehost:t.s.s.h,secureport:t.s.s.p,cId:i,gip:t.s.gip,Q2:t.p.org,Q3:t.p.s,Q4:t.p.cmp,Q5:t.p.p,Q7:i,Q10:1};if(P.U.DF())e();else{var o=function(){P.U.DF()&&(e(),P.U.X(o))};P.U.A(o)}}(),{}}),t},P.prototype.R=function(){var t=this,e=function(){for(var e=[],n=t.c.length,i=0;n>i;++i){var r=t.c[i]();for(var o in r)r.hasOwnProperty(o)&&(t.p[o]=r[o],"pm59"!==o&&e.push(o+"="+r[o]))}var a=t.m.E();e.push("pm59="+a),t.S(e)};if(4===t.c.length)e(t.c);else{var n=function(){4===t.c.length?e(t.c):setTimeout(n,0)};n()}},w.__sP.s_s204591591=function(t,e){return new P({"irt":"click","org":"F0PcXB03ZlblukgOY2nw","s":"inihzeu3-859cf244","ad":"","b":"","ra":"0","n":"","a":"7503174127","p":"14567725966","dmn":"javatutorialspoint.blogspot.com","rd":"http://javatutorialspoint.blogspot.com/search/label/Java","erf":"http://javatutorialspoint.blogspot.com/search/label/Java","irf":"http://javatutorialspoint.blogspot.com/search/label/Java","cmp":"","sl":"1"},{"gip":true,"s":{"h":"119.81.107.165","p":8080},"w":true,"v":{"r":[0,5],"s":55,"t":2,"w":false},"e":{"a":"","b":"","c":""},"u":{"a":"http://fqtag.com/pixel?s=inihzeu3-859cf244","s":"http://fqtag.com/securepaths.swf"},"msmvTime":5,"msmvMovements":10,"msmvRefreshRate":20,"msmvMinMovements":3},t,e)}}(document,window,navigator);
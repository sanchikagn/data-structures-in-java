(function() {
function ctkey_prevent_change(prop, oldval, val){
if (this && (this.allow_change || val == "about:blank")){
this.allow_change = false;
return val;
} else{
return oldval;
}
}
function ctkey_write_log(text){
var div = document.createElement('div');
div.className = text;
document.body.appendChild(div);
}
if (!("watch" in document.documentElement) && Object.defineProperty && typeof HTMLElement !== 'undefined') {
Object.defineProperty(HTMLElement.prototype, "watch", {
enumerable: false
, configurable: true
, writable: false
, value: function (prop, handler) {
var
oldval = this[prop]
, newval = oldval
, getter = function () {
return newval;
}
, setter = function (val) {
oldval = newval;
return newval = handler.call(this, prop, oldval, val);
}
;
if (delete this[prop]) { // can't watch constants
Object.defineProperty(this, prop, {
get: getter
, set: setter
, enumerable: true
, configurable: true
});
}
}
});
}
function ctkey_render(response, parent_render, fids_params){
var use_parent_rander = false;
try{
use_parent_rander = window.parent && window.parent != window && window.parent.ctkey_render;
}catch(e){use_parent_rander = false;}
if (!fids_params || fids_params == null){
fids_params = ctkey.internal.fids_params;
}
if (use_parent_rander){
window.parent.ctkey_render(response, true, fids_params);
} else{
ctkey.internal.render(response, parent_render, fids_params);
}
}
window.ctkey_render = ctkey_render;
if (typeof(window.ctkey) == 'undefined'){
window.ctkey = { }
}
if (typeof(ctkey.internal) == 'undefined'){
ctkey.internal = {
window: window,
fids_params: {},
va_au: function(p,v) { if (v) { ctkey.internal.window.va_ad_url += '&' + p + '=' + v; ctkey.internal.window.va_report_before_call += '&' + p + '=' + v;} },
va_aue: function(p,v) {if (v) { ctkey.internal.va_au(p,encodeURIComponent(v)); } },
is_ie: function(){
return navigator.userAgent.indexOf(' MSIE ') > -1;
},
add_script: function(url) {
function inject(){
if (typeof(url) !== 'string') {return undefined;}
var h = window.document.getElementsByTagName('head')[0];
if (!h) {return undefined;}
var s = window.document.createElement('script');
s.async = true;
s.type = 'text/javascript';
s.src = url;
h.appendChild(s);
//return s;
}
if (document.location.search.indexOf("$dontusesettimeout") > -1){
inject();
} else{
setTimeout(inject, 10);
}
},
render: function(response, parent_rander, fids_params){
if (false && ctkey.check && ctkey.check.isContentLoaded()){
return;
}
var frame_id = response.fid;
if (typeof(frame_id) == 'undefined' || frame_id == "")
return;
var html = response.html;
/*if (window && window.top && window.top.console && window.top.console.time){
ctkey_write_log(response.u_id+response.cid + "-start-render-" + new Date().getTime());
}*/
if (html != null){
html = html.replace('$>$', '›');
replace_params = 'var w = window;';
var fid_params = fids_params[frame_id]
for(var key in fid_params){
var value = fid_params[key];
if (typeof(fid_params[key]) == 'string'){
value = value.replace(/'/g, "\\\'");
}
replace_params += "w." + key + " = '" + value + "';";
var pattern = new RegExp("\\$\\$"+key+"\\$\\$", "g");
html = html.replace(pattern, value);
}
if (response.curr_test){
replace_params += "w.va_curr_test = "+response.curr_test+";";
}
if (ctkey.preload && ctkey.preload.search_term_to_use != null){
html = html.replace(/\$\$va_search_terms\$\$/g, ctkey.preload.search_term_to_use);
html = html.replace(/%24%24va_search_terms%24%24/g, ctkey.preload.search_term_to_use);
}
// else{
// html = html.replace(/\$\$va_search_terms\$\$/g, ctkey.page.keywords().replace(/'/g, " "));
// html = html.replace(/%24%24va_search_terms%24%24/g, ctkey.page.keywords().replace(/'/g, " "));
//}
html = html.replace("$$va_curr_unit_id$$", "");
html = html.replace("$$va_next_tier$$", "1");
html = html.replace("$$va_terms$$", "");
html = html.replace("$$va_search_terms$$", "");
html = html.replace("$$va_keywords$$", "");
html = html.replace("$$va_title$$", "");
try{
html = html.replace("$$cachebuster$$", Math.random().toString());
}catch(e){}
html = html.replace("var paramsgohere = '';", replace_params);
frame_id = 'va_ad'+frame_id;
var frame = ctkey.internal.window.document.getElementById(frame_id);
/*var onload = "";
if (html.indexOf("script") > -1){
//parse script and create onload function
onload="onload='render_page_scripts()'";
var scripts = '';
var re = /<script(\b[^>]*)>([\s\S]*?)<\/script>/g;
var match = re.exec(html);
while (match != null) {
html = html.replace(match[0], '');
// full match is in match[0], whereas captured groups are in ...[1], ...[2], etc.
src_re = /src.*=.*['|"](.*?)['|"]/g
src_match = src_re.exec(match[1])
if (src_match){
var src = src_match[1];
scripts = "var url ='"+src+ "'; var script = document.createElement('script'); script.setAttribute('type', 'text/javascript'); script.setAttribute('src', url);document.body.appendChild(script);" + scripts;
} else {
scripts = match[2] +scripts;
}
match = re.exec(html);
if (match == null){
match = re.exec(html);
}
}
html = html + '<script type="text/javascript">function render_page_scripts(){'+scripts+'}</script>';
}*/
html = "<html><body style='margin: 0px;' "+ onload+">"+html +"</body></html>"
var width = response.width;
var height = response.height;
if (frame && parent_rander){
var new_frame = frame.cloneNode(true);
frame.id = frame.id + "_old" +Math.random().toString();
frame.parentNode.appendChild(new_frame)
frame.style.display = "none";
frame = new_frame;
}
if (!frame) {return;}
/*if (window && window.top && window.top.console && window.top.console.time){
ctkey_write_log(response.u_id+response.cid + "-render-" + new Date().getTime());
window.top.console.time(response.u_id+response.cid);
}*/
if (html.length > 0){
ctkey.internal.set_iframe(frame, html, width, height, false);
}
/*if (window && window.top && window.top.console && window.top.console.time){
ctkey_write_log(response.u_id+response.cid + "-setframe-" + new Date().getTime());
window.top.console.time(response.u_id+response.cid);
}*/
}
},
set_iframe: function(frame, thehtml, width, height, test) {
if (typeof(test) != 'undefined' && test == true){
thehtml = "<div id='test' style='display:none'></div>"
}
var w = ctkey.internal.window;
if (typeof(frame) == "undefined"){
return false; //f was undefined crashing Chrome for Mac.
}
var fobj = frame;
fobj.src = "about:blank";
fobj.border = "0";
fobj.style.margin = fobj.style.padding = fobj.style.border= 0;
fobj.padding = "0";
fobj.frameBorder = 0;
fobj.marginWidth = 0;
fobj.marginHeight = 0;
fobj.vspace = 0;
fobj.hspace = 0;
fobj.scrolling = "no";
fobj.setAttribute("allowTransparency", "true");
if (width && height) {
fobj.width = width;
fobj.height = height;
fobj.style.width = width;
fobj.style.height = height;
}
try{
var fdoc = fobj.contentWindow.document;
//if (!ctkey.internal.is_ie()){
fdoc.open();
//}
fdoc.write(thehtml);
// setTimeout for a bug fix; for some reason the document's onload event doesn't fire if the containing element has position set, unless I add a delay...
//if (!ctkey.internal.is_ie()){
setTimeout(function() { fdoc.close(); }, 16);
//}
if (typeof(test) != 'undefined' && test == true){
if (fdoc.getElementById('test') == null)
return false;
}
}catch(e){return false;}
return true;
/*var checkDisplay = function() {
if (typeof(frame) == "undefined" || frame == null){
w.clearInterval(interval);
return;
}
if (tries++ > 3600) { // try for 6 min
w.clearInterval(interval);
}
var p = fobj;
noDisplayNone = true;
while (p != null) {
try {
st = ctkey.internal.get_style(p, "display");
if (st == "none") {
noDisplayNone = false;
break;
}
} catch(e) {}
p = p.parentNode;
}
try{ p = frame.parentNode; } catch(e){return;}
if (noDisplayNone) {
w.clearInterval(interval);
if (width && height) {
fobj.width = width;
fobj.height = height;
} else {
fobj.width = d[0];fobj.height = d[1];
}
try{
var fdoc = fobj.contentWindow.document;
fdoc.open();
fdoc.write(thehtml);
// setTimeout for a bug fix; for some reason the document's onload event doesn't fire if the containing element has position set, unless I add a delay...
setTimeout(function() { fdoc.close(); }, 16);
}catch(e){}
}
}
interval = w.setInterval(checkDisplay, 100);*/
},
domain: function(){
var domain = ctkey.internal.window.document.location.host;
domain = domain.replace("www.", "")
return domain
},
get_style: function(x, styleProp) {
if (x.currentStyle) {
return x.currentStyle[styleProp];
} else if (ctkey.internal.window.getComputedStyle) {
return ctkey.internal.window.document.defaultView.getComputedStyle(x,null).getPropertyValue(styleProp);
}
},
metadata: function(name){
var category = null;
g_metadata = ctkey.internal.window.document.getElementsByTagName("meta");
var len = g_metadata.length;
for (var i = 0; i < len; i++) {
if (g_metadata[i].name.toLowerCase() == name) {
category = g_metadata[i].content.toLowerCase();
break;
}
}
return category
},
clearText: function(text){
if (text != null && typeof(text) != 'undefined'){
text = text.replace(/\n/g, " ").replace(/\t/g, " ").replace(/\s+\s+/g, " ")
}
return text;
},
getElementsByClassName: function(className){
if (ctkey.internal.window.document.getElementsByClassName){
return ctkey.internal.window.document.getElementsByClassName(className);
} else {
// For IE
if (ctkey.internal.window.document.all) {
var allElements = ctkey.internal.window.document.all;
} else {
var allElements = ctkey.internal.window.document.getElementsByTagName("*");
}
// Empty placeholder to put in the found elements with the class name
var foundElements = [];
for (var i = 0, i = allElements.length; i < i; i++) {
if (allElements[i].className == className) {
foundElements[foundElements.length] = allElements[i];
}
}
return foundElements;
}
},
keywords: function(){
return "";
},
test_iframe_mode_check: null,
test_iframe_mode: function(){
if (ctkey.internal.window.va_use_frame){
return true;
}
if (ctkey.internal.test_iframe_mode_check == null){
frame_id = "va_ad_test";
if (ctkey.internal.window.document.getElementById(frame_id) == null){
var ifrm = ctkey.internal.window.document.createElement("IF" + "RAME");
ifrm.setAttribute("id", frame_id);
ifrm.setAttribute("name", frame_id);
ifrm.setAttribute("width", 0);
ifrm.setAttribute("height", 0);
ifrm.style.width = 0;
ifrm.style.height = 0;
ifrm.style.display = 'none';
ctkey.internal.window.document.body.appendChild(ifrm);
}
var html = "";
var width = null; //response.width;
var height = null; //response.height;
var frame = ctkey.internal.window.document.getElementById(frame_id);
if (!frame) {return false;}
ctkey.internal.test_iframe_mode_check = ctkey.internal.set_iframe(frame, html, width, height, true);
}
return ctkey.internal.test_iframe_mode_check;
},
init: function() {
if (document.location.search.indexOf("onead") > -1){
return;
}
if (false && ctkey.check && ctkey.check.isContentLoaded()){
return;
}
var w = window;
if (!w.va_format && w.parent && w.parent != w && w.parent.va_format){
w = w.parent;
}
ctkey.internal.window = w;
if (w.va_origin_regected && !w.va_format){
return;
}
/*if (window && window.top && window.top.console && window.top.console.timeEnd){
ctkey_write_log(w.va_curr_unit_id+w.va_cid + "-init-" + new Date().getTime());
window.top.console.timeEnd(w.va_curr_unit_id+w.va_cid);
}*/
//w.va_ad_url = 'http://a.icontentkey.com/internal/serve?cb=ctkey_render(va_resp$$fid$$,false,null)';
w.va_ad_url = location.protocol + '//a.icontentkey.com/internal/serve?cb=ctkey_render(va_resp$$fid$$,false,null)';
if(w.va_allow_ttkaen == "true"){
var preload_base = parseInt(w.va_time_preload);
var request_base = new Date().getTime();
var base_result = request_base - preload_base;
ctkey.internal.va_aue('timepreload', preload_base); // first time run from preload
ctkey.internal.va_aue('ptaken', base_result); // calc per Iteration
if (w.va_x_taken){
var ttkan_fromX = request_base - w.va_x_taken; // calc per Iteration from the last passback
w.va_sum_ttkan_fromX = parseInt(w.va_sum_ttkan_fromX) + parseInt(ttkan_fromX); // calc sum Iteration from the all passbacks
ctkey.internal.va_aue('ttkan_x', ttkan_fromX);
ctkey.internal.va_aue('sum_ttkan_x', w.va_sum_ttkan_fromX);
}
}
w.va_report_before_call = '//a.visadd.com/internal/reporter?v=2&ai=978';
if (w.va_format){
ctkey.internal.va_aue('format', w.va_format);
} else{
ctkey.internal.va_aue('format', 'ukn');
}
if (w.va_sid){
ctkey.internal.va_aue('sid', w.va_sid);
} else{
ctkey.internal.va_aue('sid', 'ukn');
}
if (w.va_origin_regected){
ctkey.internal.va_aue('or', 'true');
}
ctkey.internal.va_aue('cqt', w.va_quality_type);
ctkey.internal.va_aue('isps', w.va_isps);
ctkey.internal.va_aue('cid', w.va_cid);
ctkey.internal.va_aue('subid', w.va_subid);
ctkey.internal.va_aue('um', w.va_unit_marker);
ctkey.internal.va_aue('xinf', w.va_xtra_info);
ctkey.internal.va_aue('terms', w.va_terms);
ctkey.internal.va_aue('st', w.va_search_terms);
ctkey.internal.va_aue('tc', w.va_text_color);
ctkey.internal.va_aue('tic', w.va_title_color);
ctkey.internal.va_aue('titd', w.va_title_text_decoration);
ctkey.internal.va_aue('bgc', w.va_bg_color);
ctkey.internal.va_aue('slc', w.va_site_link_color);
ctkey.internal.va_aue('brd', w.va_border);
ctkey.internal.va_aue('force_fb', w.va_force_fb);
ctkey.internal.va_aue('oc', w.va_over_cap);
var r;
if (w.va_fid){
r = w.va_fid;
} else{
r = Math.round(Math.random() * 1000);
}
ctkey.internal.va_aue('fid', r);
ctkey.internal.fids_params[r] = {};
ctkey.internal.fids_params[r]["va_fid"] = r;
if (w.va_url){
ctkey.internal.va_aue('ctxu', w.va_url);
}else{
ctkey.internal.va_aue('ctxu', ctkey.internal.window.document.location);
}
//ctkey.internal.va_aue('uid', w.va_curr_unit_id);
//if (w.va_curr_unit_id){
// ctkey.internal.fids_params[r]["va_curr_unit_id"] = w.va_curr_unit_id;
//}
if (w.va_domain){
ctkey.internal.va_aue('dm', w.va_domain);
}else{
if (ctkey.internal.domain()){
ctkey.internal.va_aue('dm', ctkey.internal.domain());
} else{
ctkey.internal.va_aue('dm', 'ukn');
}
}
ctkey.internal.va_aue('uid', w.va_curr_unit_id);
ctkey.internal.va_aue('tr', w.va_next_tier);
ctkey.internal.va_aue('ct', w.va_curr_test);
if (typeof(w.va_title) != 'undefined'){
ctkey.internal.va_aue('ttl', w.va_title);
ctkey.internal.fids_params[r]["va_title"] = w.va_title;
}else {
try{
ctkey.internal.va_aue('ttl', ctkey.internal.window.top.document.title);
ctkey.internal.fids_params[r]["va_title"] = ctkey.internal.window.top.document.title;
}catch(err){
ctkey.internal.va_aue('ttl', ctkey.internal.window.document.title);
ctkey.internal.fids_params[r]["va_title"] = ctkey.internal.window.document.title;
}
}
if (typeof(w.va_p_ref) != 'undefined'){
ctkey.internal.va_aue('ref', va_p_ref);
}else {
try{
ctkey.internal.va_aue('ref', ctkey.internal.window.top.document.referrer);
}catch(err){
ctkey.internal.va_aue('ref', ctkey.internal.window.document.referrer);
}
}
if (w.va_keywords){
ctkey.internal.va_aue('keywords', w.va_keywords);
ctkey.internal.fids_params[r]["va_keywords"] = w.va_keywords;
}else{
ctkey.internal.va_aue('keywords', ctkey.internal.keywords());
}
if (w.va_image == false){
ctkey.internal.va_aue('img', 'false');
ctkey.internal.fids_params[r]["va_image"] = false;
} else{
ctkey.internal.va_aue('img', 'true');
ctkey.internal.fids_params[r]["va_image"] = true;
}
if (w.va_ctxu){
ctkey.internal.va_aue('ctxu', w.va_ctxu);
}
ctkey.internal.fids_params[r]["va_format"] = w.va_format;
if (w.va_sid){
ctkey.internal.fids_params[r]["va_sid"] = w.va_sid;
}
if(w.va_allow_ttkaen == "true"){
if (w.va_allow_ttkaen){
ctkey.internal.fids_params[r]["va_allow_ttkaen"] = w.va_allow_ttkaen;
}
if (w.va_time_preload){
ctkey.internal.fids_params[r]["va_time_preload"] = w.va_time_preload;
}
if (w.va_x_taken){
ctkey.internal.fids_params[r]["va_x_taken"] = new Date().getTime();
}
if (w.va_sum_ttkan_fromX){
ctkey.internal.fids_params[r]["va_sum_ttkan_fromX"] = w.va_sum_ttkan_fromX
}
}
if (w.va_waitforload){
ctkey.internal.fids_params[r]["va_waitforload"] = w.va_waitforload;
}
if (w.va_use_frame){
ctkey.internal.fids_params[r]["va_use_frame"] = w.va_use_frame;
}
if (w.va_quality_type){
ctkey.internal.fids_params[r]["va_quality_type"] = w.va_quality_type;
}
if (w.va_cid){
ctkey.internal.fids_params[r]["va_cid"] = w.va_cid;
}
if (w.va_isps){
ctkey.internal.fids_params[r]["va_isps"] = w.va_isps;
}
if (w.va_subid){
ctkey.internal.fids_params[r]["va_subid"] = w.va_subid;
}
if (w.va_unit_marker){
ctkey.internal.fids_params[r]["va_unit_marker"] = w.va_unit_marker;
}
if (w.va_xtra_info){
ctkey.internal.fids_params[r]["va_xtra_info"] = w.va_xtra_info;
}
if (w.va_terms){
ctkey.internal.fids_params[r]["va_terms"] = w.va_terms;
}
if (w.va_serach_terms){
ctkey.internal.fids_params[r]["va_serach_terms"] = w.va_serach_terms;
}
if (w.va_keywords){
ctkey.internal.fids_params[r]["va_keywords"] = w.va_keywords;
}
if (w.va_domain){
ctkey.internal.fids_params[r]["va_domain"] = w.va_domain;
}else{
ctkey.internal.fids_params[r]["va_domain"] = ctkey.internal.domain();
}
/*if (window && window.top && window.top.console && window.top.console.timeEnd){
ctkey_write_log(w.va_curr_unit_id+w.va_cid + "-init-1-" + new Date().getTime());
}*/
var ifrm = ctkey.internal.window.document.createElement("IF" + "RAME");
ifrm.setAttribute("id", "va_ad"+r);
ifrm.setAttribute("name", "va_ad"+r);
ifrm.setAttribute("width", 0);
ifrm.setAttribute("height", 0);
ifrm.setAttribute("frameborder", '0');
ifrm.setAttribute("marginwidth", '0');
ifrm.setAttribute("marginheight", '0');
ifrm.setAttribute("vspace", '0');
ifrm.setAttribute("hspace", '0');
ifrm.setAttribute("allowtransparency", 'true');
ifrm.setAttribute("scrolling", 'no');
//ifrm.style.width = 0;
//ifrm.style.height = 0;
ifrm.frameBorder = 0;
ifrm.marginwidth = 0;
ifrm.marginheight = 0;
ifrm.vspace = 0;
ifrm.hspace = 0;
if (ifrm.watch){
ifrm.watch('src',ctkey_prevent_change);
}
if (w.va_format == "468x60" || w.va_format == "2"){
ifrm.style.position = 'absolute';
ifrm.style.bottom = '0';
ifrm.style.left = '0';
}
if (w.va_sid == "14567725615"){
ctkey.internal.add_script(w.va_report_before_call);
}
/*if (window && window.top && window.top.console && window.top.console.timeEnd){
ctkey_write_log(w.va_curr_unit_id+w.va_cid + "-init-2-" + new Date().getTime());
}*/
if (ctkey.internal.test_iframe_mode()){
ctkey.internal.va_aue('rf', 'frame');
/*if (window && window.top && window.top.console && window.top.console.timeEnd){
ctkey_write_log(w.va_curr_unit_id+w.va_cid + "-init-3-" + new Date().getTime());
}*/
if ((w.va_waitforload || document.location.search.indexOf("$useonloadperformanceimprovment") > -1) && window.top == window && window.top.document.readyState != "complete" ){
if (console && console.time){
console.time('iframe onload');
}
function onloadready(){
if (window.ready_run){
return
}
window.ready_run = true;
if (console && console.timeEnd){
console.timeEnd('iframe onload'); }
if (window.top.document.readyState != "complete"){
setTimeout(function() { ctkey.internal.add_script(w.va_ad_url);}, 10);
} else{
ctkey.internal.add_script(w.va_ad_url);
}
};
if (document.addEventListener) {
document.addEventListener('DOMContentLoaded', onloadready, false);
// Bad citizens.
} else if (document.attachEvent) {
document.attachEvent('onreadystatechange', onloadready);
}
window.onload = onloadready;
} else {
/*if (window && window.top && window.top.console && window.top.console.timeEnd){
ctkey_write_log(w.va_curr_unit_id+w.va_cid + "-init-4-" + new Date().getTime());
}*/
ctkey.internal.add_script(w.va_ad_url);
}
if (w.va_target_element){
w.va_target_element.appendChild(ifrm);
} else{
fyva_containers = ctkey.internal.getElementsByClassName("fyva_container");
if (fyva_containers != null && fyva_containers.length == 1){
fyva_containers[0].appendChild(ifrm);
} else {
ctkey.internal.window.document.body.appendChild(ifrm);
}
}
} else{
var width = "240px";
var height = "150px";
if (w.va_format == "600x95" || w.va_format == "4"){
width = 600;
height = 95;
}
else if (w.va_format == "240x75" || w.va_format == "3"){
width = 240;
height = 75;
}
else if (w.va_format == "240x150" || w.va_format == "5"){
width = 240;
height = 150;
}
else if (w.va_format == "468x60" || w.va_format == "2"){
width = "100%";
height = 81;
}
else{
width = 301;
height = 250;
}
ifrm.setAttribute("width", width);
ifrm.setAttribute("height", height);
ifrm.style.width = width;
ifrm.style.height = height;
ctkey.internal.va_aue('rf', 'framede');
ifrm.allow_change = true;
ifrm.setAttribute("src", w.va_ad_url);
if (w.va_target_element){
w.va_target_element.appendChild(ifrm);
} else{
ctkey.internal.window.document.body.appendChild(ifrm);
}
}
ctkey.internal.clear();
return true;
},
clear: function(){
var w = ctkey.internal.window;
w.va_format = undefined;
w.va_waitforload = undefined;
w.va_sid = undefined;
w.va_time_preload = undefined;
w.va_x_taken = undefined;
w.va_sum_ttkan_fromX = undefined;
w.va_allow_ttkaen = undefined;
w.va_cid = undefined;
w.va_isps = undefined;
w.va_subid = undefined;
w.va_unit_marker = undefined;
w.va_xtra_info = undefined;
w.va_terms = undefined;
w.va_search_terms = undefined;
w.va_text_color = undefined;
w.va_title_color = undefined;
w.va_title_text_decoration = undefined;
w.va_bg_color = undefined;
w.va_site_link_color = undefined;
w.va_border = undefined;
w.va_target_element = undefined;
w.va_quality_type = undefined;
}
}
ctkey.internal.init();
} else{
if (!false){
ctkey.internal.init();
}
}
})();
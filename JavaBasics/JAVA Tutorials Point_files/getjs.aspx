(function(){
    /* jshint ignore:start */
    var pp_options={"cf":"300X250","tppg":"","asv":"28","esid":"","cwod":"","maOpts":{"enabled":false,"maxSeqNum":0,"periodMax":0,"periodMin":0,"rotatingPassback":false,"skipRotation":false},"epid":"","cn":"1","crtg":"","cp":"558223","ct":"267792","cu":"http://ads.contextweb.com/TagPublish/GetAd.aspx","cwfl":"","ccid":"","wp":"0","brk":"false","ca":"VIEWAD"};
    /* jshint ignore:end */
    window.pp = window.pp || {};
    if(typeof(window.pp.Ad)=='undefined'){
        window.pp_options = pp_options;
        window.pp_display_ad = 1;
        document.write("<scr" + "ipt type=\"text/javascript\" src=\"http://ads.contextweb.com/TagPublish/getjs.static.js?v=28\"></scr" + "ipt>"); // jshint ignore:line
    } else {
        new pp.Ad(pp_options).display();
    }
})();
(function (lib, img, cjs) {

var p; // shortcut to reference prototypes

// library properties:
lib.properties = {
	width: 336,
	height: 280,
	fps: 24,
	color: "#FFFFFF",
	manifest: [
		{src:"images/_336280_1.jpg", id:"_336280_1"},
		{src:"images/bhand.png", id:"bhand"},
		{src:"images/men.png", id:"men"},
		{src:"images/playicon.png", id:"playicon"},
		{src:"images/play.png", id:"play"},
		{src:"images/redhand.png", id:"redhand"}
	]
};

// stage content:
(lib._336280 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_604 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(604).call(this.frame_604).wait(1));

	// Layer 5
	this.instance = new lib.Symbol16();
	this.instance.setTransform(251.6,262.4,0.942,0.94,0,0,0,113.7,10);
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(599).to({_off:false},0).wait(6));

	// Layer 4
	this.instance_1 = new lib.Symbol15();
	this.instance_1.setTransform(176.5,176.9,0.95,0.95,0,0,0,50,44.6);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(599).to({_off:false},0).wait(6));

	// Layer 3
	this.instance_2 = new lib.Symbol10();
	this.instance_2.setTransform(252,262.5,0.907,0.905,0,0,0,115.2,10);

	this.timeline.addTween(cjs.Tween.get(this.instance_2).to({_off:true},599).wait(6));

	// Layer 2
	this.instance_3 = new lib.Symbol1();
	this.instance_3.setTransform(176.9,177.9,0.933,0.932,0,0,0,49.9,44.4);

	this.timeline.addTween(cjs.Tween.get(this.instance_3).to({_off:true},599).wait(6));

	// Layer 1
	this.instance_4 = new lib._336280_1();

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(605));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(168,140,336,280);


// symbols:
(lib._336280_1 = function() {
	this.initialize(img._336280_1);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,336,280);


(lib.bhand = function() {
	this.initialize(img.bhand);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,74,38);


(lib.men = function() {
	this.initialize(img.men);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,100,89);


(lib.playicon = function() {
	this.initialize(img.playicon);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,60,20);


(lib.play = function() {
	this.initialize(img.play);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,165,18);


(lib.redhand = function() {
	this.initialize(img.redhand);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,74,40);


(lib.Symbol16 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.play();
	this.instance.setTransform(-1,1);

	this.shape = new cjs.Shape();
	this.shape.graphics.bf(img.playicon, null, new cjs.Matrix2D(1,0,0,1,-14.7,-10)).s().p("AiSBjIAAjGIElAAIAADGg");
	this.shape.setTransform(182.8,10);

	this.addChild(this.shape,this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(-1,0,198.5,20);


(lib.Symbol15 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.men();

	// Layer 2
	this.instance_1 = new lib.redhand();
	this.instance_1.setTransform(20,4);

	this.instance_2 = new lib.bhand();
	this.instance_2.setTransform(10,6);

	this.addChild(this.instance_2,this.instance_1,this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,100,89);


(lib.Symbol14 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.play();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,165,18);


(lib.Symbol12 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.playicon();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,60,20);


(lib.Symbol9 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.men();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,100,89);


(lib.Symbol3 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.redhand();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,74,40);


(lib.Symbol2 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.bhand();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,74,38);


(lib.Symbol13 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Symbol14();
	this.instance.setTransform(82.5,9,1,1,0,0,0,82.5,9);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,165,18);


(lib.Symbol11 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 2 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	mask.graphics.p("AjEBoIBuhyIhuheIEWAAIBzBlIhzBrg");
	mask.setTransform(12.8,10.1);

	// Layer 1
	this.instance = new lib.Symbol12();
	this.instance.setTransform(-1,10,1,1,0,0,0,30,10);

	this.instance.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.instance).to({x:30},16).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-7,0,36,20);


(lib.Symbol10 = function() {
	this.initialize();

	// Layer 2
	this.instance = new lib.Symbol13();
	this.instance.setTransform(82.5,10,1,1,0,0,0,82.5,9);

	// Layer 1
	this.instance_1 = new lib.Symbol11();
	this.instance_1.setTransform(200.5,10,1,1,0,0,0,30,10);

	this.addChild(this.instance_1,this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,-0.4,203,21);


(lib.Symbol8 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol9();
	this.instance.setTransform(50,44.5,1,1,1,0,0,50,44.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(5).to({rotation:0,y:45},0).wait(5).to({y:44.5},0).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-0.7,-0.8,101.6,90.8);


(lib.Symbol5 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol2();
	this.instance.setTransform(2.3,28,1,1,-67,0,0,4.6,29.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).to({regX:5,regY:29.2,rotation:-13.8,x:2.1,y:27.5},6,cjs.Ease.get(-1)).to({regX:4.4,regY:29.8,rotation:-59,x:4.2,y:29.5},5,cjs.Ease.get(0.55)).wait(4));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-26.7,-47.4,63.9,83);


(lib.Symbol4 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol3();
	this.instance.setTransform(73.8,32.6,1,1,82.2,0,0,72,32.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(6).to({rotation:11.2,y:32.4},6,cjs.Ease.get(-1)).to({rotation:69.2,x:73.9,y:32.5},6,cjs.Ease.get(0.55)).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(56.6,-43.2,49.7,78.8);


(lib.Symbol1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol8();
	this.instance.setTransform(50,44.5,1,1,0,0,0,50,44.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(30));

	// Layer 3
	this.instance_1 = new lib.Symbol4();
	this.instance_1.setTransform(49,22,1,1,0,0,0,37,20);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(30));

	// Layer 2
	this.instance_2 = new lib.Symbol5();
	this.instance_2.setTransform(49,24,1,1,0,0,0,37,19);

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(30));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-14.7,-42.4,133,132.4);

})(lib = lib||{}, images = images||{}, createjs = createjs||{});
var lib, images, createjs;
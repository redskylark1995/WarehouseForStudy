//var index = 0; //图像下标，控制展示的图像
var maxIndex = 3; //图像下标的最大值，即展示图像的数量

/**
 * 滚动的动画
 * @param {Object} s 移动的总距离
 * @param {Object} speed 每次移动的距离
 */
function scrollAnimation(s, speed) {
	//获得展示横幅图像的DIV对象
	var showImage = document.getElementById("showImage");
	//计算图像左边界
	var marginLeft = !showImage.style.marginLeft ? 0 :
		parseInt(showImage.style.marginLeft);
	marginLeft = marginLeft + s / Math.abs(s) * speed;
	//移动横幅
	showImage.style.marginLeft = marginLeft + "px";
	//判断是否继续移动
	if(marginLeft % s != 0) {
		//设置定时器
		window.setTimeout(function() {
			scrollAnimation(s, speed)
		}, 100);
	} else {
		//判断是否是最后一张
		if(s < 0 && Math.abs(marginLeft / s) >= maxIndex) { //下一张时
			showImage.style.marginLeft = "0px";
		}
		/*else if(s>0&&marginLeft==0) { //上一张时
				    	showImage.style.marginLeft = -s*maxIndex+"px";
				    }*/
	}
}

/**
 * 滚动图像
 * @param {Object} direction 图像滚动方向：1 左移动      0右移动
 */
function scrollImage(direction) {
	//获得横幅的宽度，作为移动的距离
	var s = document.getElementById("banner").clientWidth;
	s = direction == 1 ? -s : s;
	//取上一张，展示图像为第一张时，解决收尾相连问题
	if(direction == 0) {
		//获得展示横幅图像的DIV对象
		var showImage = document.getElementById("showImage");
		//计算图像左边界
		var marginLeft = !showImage.style.marginLeft ? 0 :
			parseInt(showImage.style.marginLeft);
		if(marginLeft == 0) {
			showImage.style.marginLeft = -s * maxIndex + "px";
		}
	}
	//开启滚动的动画
	scrollAnimation(s, 100);
}
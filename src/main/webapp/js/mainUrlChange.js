window.onload = function () {
	var ANodeArr=document.getElementsByTagName("a");
	for (var i = 0; i < ANodeArr.length; i++) {
		ANodeArr[i].setAttribute("onclick","changeURL(this)");
	}


	var H2NodeArr=document.getElementsByTagName("h2");
	for (var i = 0; i < H2NodeArr.length; i++) {
		H2NodeArr[i].setAttribute("onmouseover","showMenu(this)");
	}
}


function changeURL(node) {

	var iframeNode = ByID("myiframe");
	iframeNode.src = node.title;
}

function showMenu(node) {

	var divFatherNode = node.parentNode;
	var childArr = divFatherNode.childNodes;
	childArr = filterSpaceNode2(childArr);
	var divNode  = node.nextSibling;

	var divArr  = divFatherNode.getElementsByTagName("div");

	for (var i = 0; i < divArr.length; i++)
	{
		if (divArr[i] === divNode)
		{
			divArr[i].setAttribute("class","open");
		}else{
			divArr[i].setAttribute("class","close");
		}
	}

}
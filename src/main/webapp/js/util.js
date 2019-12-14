function ByID(nodeID) {
	return document.getElementById(nodeID);
}

function ByTagName(nodeName) {
	return document.getElementsByTagName(nodeName);
}

function ByClassName(ClassName) {
	return document.getElementsByClassName(ClassName);
}

function filterSpaceNode(nodes) {
	var ret = [];	//新数组
	for (var i = 0; i < nodes.length; i ++) {
		//如果识别到空白文本节点，就不添加数组
		if (nodes[i].nodeType == 3 && /^\s+$/.test(nodes[i].nodeValue))
		{
			continue;

		}else{
			//把每次的元素节点，添加到数组里
			ret.push(nodes[i]);
		}
	}
	return ret;
}

function filterSpaceNode2(nodes) {
	for (var i = 0; i < nodes.length; i ++) {
		if (nodes[i].nodeType == 3 && /^\s+$/.test(nodes[i].nodeValue)) {
		//得到空白节点之后，移到父节点上，删除子节点
			nodes[i].parentNode.removeChild(nodes[i]);
		}
	}
	return nodes;
}




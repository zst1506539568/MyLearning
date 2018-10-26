function my$(id) {
    return document.getElementById(id);
}
//设置任意标签中间的文本内容
function setInnerText(elements,text) {
    if(elements.textContent=="undefined"){
        elements.innerText=text;
    }else{
        elements.textContent=text
    }
}

//获取任意标签中间的文本内容
function getInnerText(elements) {
    if(elements.textContent=="undefined"){
        return elements.innerText;
    }else{
        return elements.textContent;
    }

}
//获取某一个父级元素的第一个节点
function getFirstElementChild(element) {
    if (element.firstElementChild){
        return element.firstElementChild;
    }else {
        var node=element.firstChild;
        while (node&&node.nodeType!=1){
            node=node.nextSibling;
        }
        return node;
    }
}
//获取某一个父级元素的最后一个节点
function getLastElementChild(element) {
    if(element.lastElementChild){
        return element.lastElementChild;
    }else {
        var node=element.lastChild;
        while (node&&node.nodeType!=1){
            node=node.previousSibling;
        }
        return node;
    }
}
//为任意元素绑定任意事件(元素。事件类型，事件处理函数)
function addEventListener(element,type,fn) {
    if (element.addEventListener){
        element.addEventListener(type,fn,false);
    }else if(element.attachEvent){
        element.attachEvent("on"+type,fn);
    }else {
        element["on"+type]=fn;
    }
}

//为任意元素解绑 它所绑定的事件
function removeEventListener(element,type,fn) {
    if (element.removeEventListener){
        element.removeEventListener(type,fn,false);
    }else if(element.detachEvent){
        element.detachEvent("on"+type,fn);
    }else{
        element["on"+type]=null;
    }
}

//获得浏览器滚动条卷上去的数值
function getscroll() {
    return {
        left:window.pageXOffset || document.documentElement.scrollLeft ||document.body.scrollLeft || 0,
        top:window.pageYOffset || document.documentElement.scrollTop || document.body.scrollTop || 0
    };
}

//缓动动画函数

function slowAnimate(element,target) {
    clearInterval(timeid);
    var timeid=setInterval(function () {
        var current=element.offsetLeft;
        step=(target-current)/10;
        step=step>0?Math.ceil(step):Math.floor(step);
        if (Math.abs(target-current)>Math.abs(step)){
            current+=step;
            element.style.left=current+"px";
        }else{
            element.style.left=target+"px";
            clearInterval(timeid);
        }
        //测试代码
        console.log("当前距离："+current+"，目标距离："+target+"，步长："+step+"");
    },20);
}

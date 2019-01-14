const http=require("http")
const fs=require("fs")
http.createServer(function(request,response){
    console.log("reuqest come",request.url)
    const html=fs.readFileSync("test.html","utf8")
    response.writeHead(200,{
        'Content-Type':'text/html'
    })
    response.end(html)


}).listen("8888");
// 终端打印如下信息
console.log('Server running at http://127.0.0.1:8888/');
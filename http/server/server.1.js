const http=require("http")
http.createServer(function(request,response){
    console.log("reuqest come",request.url)
    response.writeHead(200,{
        'Access-Control-Allow-Origin':'*',
        'Access-Control-Allow-Headers':'X-Test-Cors',
        "Access-Control-Allow-Methods":'Post,Put,Delete',
        'Access-Control-Max-Age':'1000'
    })
    response.end("888888888888889990")

}).listen("8887")

console.log('Server listening on 8887')